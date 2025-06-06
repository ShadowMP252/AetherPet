# coding=utf-8
# 
# ╔═ INFO ═╗
# ║ Document  :: Configuration File for Custom Logger
# ║ Author    :: Tyler Fletcher
# ║ Company   :: Cedar Electronics
# ║ Notes     :: Import logger into other files to ensure that all files are directed to the Main Log directory
# ╚════════╝
# 


import logging
import os


class ColoredFormatter(logging.Formatter):
    """Color Formatter for structuring log files and CLI colors"""
    COLORS = {
        'DEBUG': '\033[97m',
        'INFO': '\033[33m',
        'WARNING': '\033[33m',
        'ERROR': '\033[91m',
        'EXCEPTION': '\033[91m'
    }
    RESET = '\033[0m'

    def format(self, record):
        log_color = self.COLORS.get(record.levelname, self.RESET)
        formatted_message = super().format(record)
        colored_message = f"{log_color}{formatted_message}{self.RESET}"
        return colored_message


def init_logger():
    """Logger Config Construct returns logger"""
    
    def get_main_script_name():
        """Using Inspect → Get Application Name Running for Logs"""
        import inspect
        
        for frame_info in reversed(inspect.stack()):
            module = inspect.getmodule(frame_info.frame)
            if module and getattr(module, '__name__', None) == '__main__':
                return os.path.splitext(os.path.basename(module.__file__))[0]
        return 'unknown_script' 

    logger = logging.getLogger("load_logger")
    logger.setLevel(logging.DEBUG)

    log_folder = r"C:\logs"
    os.makedirs(log_folder, exist_ok=True)
    
    application_name = get_main_script_name()
    log_filename = os.path.join(log_folder, f"{application_name}.log")
    
    file_handler = logging.FileHandler(log_filename)
    file_handler.setLevel(logging.DEBUG)

    console_handler = logging.StreamHandler()
    console_handler.setLevel(logging.DEBUG)

    formatter = logging.Formatter("%(asctime)s - %(levelname)s - %(message)s")
    file_handler.setFormatter(formatter)

    color_formatter = ColoredFormatter('%(asctime)s - %(levelname)s - %(message)s')
    console_handler.setFormatter(color_formatter)

    logger.addHandler(file_handler)
    logger.addHandler(console_handler)

    return logger

# Import logger in other files to ensure logs are designed and placed in correct directory (Data Sharepoint → Logs).
logger = init_logger()

