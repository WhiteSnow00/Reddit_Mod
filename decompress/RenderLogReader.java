// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render.utils;

import java.io.IOException;
import kotlin.text.b;
import sg2.e;
import java.io.Reader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f" }, d2 = { "Lcom/reddit/video/creation/video/render/utils/RenderLogReader;", "", "()V", "processUtils", "Lcom/reddit/video/creation/video/render/utils/ProcessUtils;", "getProcessUtils", "()Lcom/reddit/video/creation/video/render/utils/ProcessUtils;", "setProcessUtils", "(Lcom/reddit/video/creation/video/render/utils/ProcessUtils;)V", "getLogEntries", "", "", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class RenderLogReader
{
    public static final int $stable = 8;
    @Inject
    public ProcessUtils processUtils;
    
    @Inject
    public RenderLogReader() {
    }
    
    public final List<String> getLogEntries() {
        final ArrayList list = new ArrayList();
        try {
            final BufferedReader bufferedReader = new BufferedReader(this.getProcessUtils().executeCommand(new String[] { "logcat", "-d", "-v", "threadtime" }));
            int n2;
            int n = n2 = 0;
            while (true) {
                final String line = bufferedReader.readLine();
                e.e((Object)line, "it");
                if (n >= 50 || n2 >= 2000) {
                    break;
                }
                int n3 = n;
                if (b.P0((CharSequence)line, (CharSequence)this.getProcessUtils().getCurrentProcessId(), false)) {
                    list.add(line);
                    n3 = n + 1;
                }
                ++n2;
                n = n3;
            }
            return list;
        }
        catch (final IOException ex) {
            return list;
        }
    }
    
    public final ProcessUtils getProcessUtils() {
        final ProcessUtils processUtils = this.processUtils;
        if (processUtils != null) {
            return processUtils;
        }
        e.n("processUtils");
        throw null;
    }
    
    public final void setProcessUtils(final ProcessUtils processUtils) {
        e.f((Object)processUtils, "<set-?>");
        this.processUtils = processUtils;
    }
}
