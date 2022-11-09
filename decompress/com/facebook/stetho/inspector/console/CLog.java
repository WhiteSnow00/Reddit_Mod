// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.console;

import com.facebook.stetho.common.LogRedirector;
import com.facebook.stetho.inspector.protocol.module.Console;
import com.facebook.stetho.inspector.helper.ChromePeerManager;

public class CLog
{
    private static final String TAG = "CLog";
    
    public static void writeToConsole(final ChromePeerManager chromePeerManager, final Console.MessageLevel level, final Console.MessageSource source, final String text) {
        LogRedirector.d("CLog", text);
        final Console.ConsoleMessage message = new Console.ConsoleMessage();
        message.source = source;
        message.level = level;
        message.text = text;
        final Console.MessageAddedRequest messageAddedRequest = new Console.MessageAddedRequest();
        messageAddedRequest.message = message;
        chromePeerManager.sendNotificationToPeers("Console.messageAdded", messageAddedRequest);
    }
    
    public static void writeToConsole(final Console.MessageLevel messageLevel, final Console.MessageSource messageSource, final String s) {
        final ConsolePeerManager instanceOrNull = ConsolePeerManager.getInstanceOrNull();
        if (instanceOrNull == null) {
            return;
        }
        writeToConsole(instanceOrNull, messageLevel, messageSource, s);
    }
}
