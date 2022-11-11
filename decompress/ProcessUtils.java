// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render.utils;

import android.os.Process;
import sg2.e;
import java.io.InputStreamReader;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\u0007¨\u0006\n" }, d2 = { "Lcom/reddit/video/creation/video/render/utils/ProcessUtils;", "", "()V", "executeCommand", "Ljava/io/InputStreamReader;", "command", "", "", "([Ljava/lang/String;)Ljava/io/InputStreamReader;", "getCurrentProcessId", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ProcessUtils
{
    public static final int $stable = 0;
    
    @Inject
    public ProcessUtils() {
    }
    
    public final InputStreamReader executeCommand(final String[] array) {
        e.f((Object)array, "command");
        return new InputStreamReader(Runtime.getRuntime().exec(array).getInputStream());
    }
    
    public final String getCurrentProcessId() {
        return String.valueOf(Process.myPid());
    }
}
