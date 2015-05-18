package com.jd.dongxin.common.util;

import org.apache.log4j.Logger;

public class LogHelper {

    private static Logger logger = Logger.getLogger(LogHelper.class);

    public static void trace(final Logger logger, Object[] argDes,
            Object[] argVal) {
        excute(argDes, argVal, new LogCallBack() {
            @Override
            public void doLog(String logMessage) {
                logger.trace(logMessage);
            }
        });
    }

    public static void trace(final Logger logger, Object[] argDes,
            Object[] argVal, final Throwable e) {
        excute(argDes, argVal, new LogCallBack() {
            @Override
            public void doLog(String logMessage) {
                logger.trace(logMessage, e);
            }
        });
    }

    public static void fatal(final Logger logger, Object[] argDes,
            Object[] argVal) {
        excute(argDes, argVal, new LogCallBack() {
            @Override
            public void doLog(String logMessage) {
                logger.fatal(logMessage);
            }
        });
    }

    public static void fatal(final Logger logger, Object[] argDes,
            Object[] argVal, final Throwable e) {
        excute(argDes, argVal, new LogCallBack() {
            @Override
            public void doLog(String logMessage) {
                logger.fatal(logMessage, e);
            }
        });
    }

    public static void debug(final Logger logger, Object[] argDes,
            Object[] argVal) {
        excute(argDes, argVal, new LogCallBack() {
            @Override
            public void doLog(String logMessage) {
                logger.debug(logMessage);
            }
        });
    }

    public static void debug(final Logger logger, Object[] argDes,
            Object[] argVal, final Throwable e) {
        excute(argDes, argVal, new LogCallBack() {
            @Override
            public void doLog(String logMessage) {
                logger.debug(logMessage, e);
            }
        });
    }

    public static void info(final Logger logger, Object[] argDes,
            Object[] argVal) {
        excute(argDes, argVal, new LogCallBack() {
            @Override
            public void doLog(String logMessage) {
                logger.info(logMessage);
            }
        });
    }

    public static void info(final Logger logger, Object[] argDes,
            Object[] argVal, final Throwable e) {
        excute(argDes, argVal, new LogCallBack() {
            @Override
            public void doLog(String logMessage) {
                logger.info(logMessage, e);
            }
        });
    }

    public static void warn(final Logger logger, Object[] argDes,
            Object[] argVal) {
        excute(argDes, argVal, new LogCallBack() {
            @Override
            public void doLog(String logMessage) {
                logger.warn(logMessage);
            }
        });
    }

    public static void warn(final Logger logger, Object[] argDes,
            Object[] argVal, final Throwable e) {
        excute(argDes, argVal, new LogCallBack() {
            @Override
            public void doLog(String logMessage) {
                logger.warn(logMessage, e);
            }
        });
    }

    public static void error(final Logger logger, Object[] argDes,
            Object[] argVal) {
        excute(argDes, argVal, new LogCallBack() {
            @Override
            public void doLog(String logMessage) {
                logger.error(logMessage);
            }
        });
    }

    public static void error(final Logger logger, Object[] argDes,
            Object[] argVal, final Throwable e) {
        excute(argDes, argVal, new LogCallBack() {
            @Override
            public void doLog(String logMessage) {
                logger.error(logMessage, e);
            }
        });
    }

    private static void excute(Object[] argDes, Object[] argVal,
            LogCallBack call) {
        try {
            String logMessage = convertLogMessage(argDes, argVal);
            call.doLog(logMessage);
        } catch (LogParamLengthNotEqualException el) {
            logger.error("日志信息的格式不正确", el);
        } catch (Exception e) {
            logger.error("日志记录出错，系统错误！！！", e);
        }
    }

    private static String convertLogMessage(Object[] argDes, Object[] argVal) throws LogParamLengthNotEqualException {
        if ((argDes == null || argDes.length < 1)
                && (argVal == null || argVal.length < 1)) {
            return "";
        }
        if (argDes.length != argVal.length) {
            throw new LogParamLengthNotEqualException("日志信息描述参数的长度和值参数的长度不一致");
        }
        StringBuffer message = new StringBuffer();
        for (int i = 0; i < argDes.length; i++) {
            message.append(",").append(argDes[i]).append("=[");
            message.append(JsonUtil.toJson(argVal[i])).append("]");
        }
        if (message.length() > 0) {
            return message.substring(1);
        }

        return message.toString();
    }

    private interface LogCallBack {

        void doLog(String logMessage);

    }

    public static void main(String[] args) {
        trace(logger, new Object[]{"method", "argDes"}, new Object[]{"main", "argVal"});
    }

}
