// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.console;

import com.facebook.stetho.inspector.protocol.module.Console$MessageAddedRequest;
import com.facebook.stetho.inspector.protocol.module.Console$ConsoleMessage;
import com.facebook.stetho.common.LogRedirector;
import com.facebook.stetho.inspector.protocol.module.Console$MessageSource;
import com.facebook.stetho.inspector.protocol.module.Console$MessageLevel;
import com.facebook.stetho.inspector.helper.ChromePeerManager;

public class CLog
{
    private static final String TAG = "CLog";
    
    public static void writeToConsole(final ChromePeerManager chromePeerManager, final Console$MessageLevel level, final Console$MessageSource source, final String text) {
        LogRedirector.d("CLog", text);
        final Console$ConsoleMessage message = new Console$ConsoleMessage();
        message.source = source;
        message.level = level;
        message.text = text;
        final Console$MessageAddedRequest console$MessageAddedRequest = new Console$MessageAddedRequest();
        console$MessageAddedRequest.message = message;
        chromePeerManager.sendNotificationToPeers("Console.messageAdded", console$MessageAddedRequest);
    }
    
    public static void writeToConsole(final Console$MessageLevel console$MessageLevel, final Console$MessageSource console$MessageSource, final String s) {
        final ConsolePeerManager instanceOrNull = ConsolePeerManager.getInstanceOrNull();
        if (instanceOrNull == null) {
            return;
        }
        writeToConsole((ChromePeerManager)instanceOrNull, console$MessageLevel, console$MessageSource, s);
    }
}
