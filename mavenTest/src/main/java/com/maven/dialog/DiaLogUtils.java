package com.maven.dialog;

import android.content.Context;
import android.support.v7.app.AlertDialog;

/**
 * 作者: 赵虔
 * 时间: 2017/10/18
 * 类作用:
 */

public class DiaLogUtils {
    public static void showDiaLog(Context context, String title, String message) {
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .show();
    }
}
