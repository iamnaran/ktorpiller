package com.delphiclab.ktorpiller.utils


class AppLog private constructor() {
    companion object {

        fun init() {
            // You can add additional trees or modify the initialization as needed
            // For example, you might want to add a custom tree for release builds
            // Timber.plant(CrashReportingTree())
        }

        fun showDebug(tag: String, message: String) {

        }

        fun showLog(message: String) {

        }

        fun showError(tag: String, message: String) {


        }

        fun showException(throwable: Throwable, message: String, vararg args: Any?) {

        }

        fun tagFor(clazz: Class<*>): String {
            return clazz.simpleName
        }
    }
}