// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.trim;

import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010\u0012\u001a\u00020\u000fJ\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016" }, d2 = { "Lcom/reddit/video/creation/video/trim/Progress;", "", "progress", "", "outputFile", "Ljava/io/File;", "(ILjava/io/File;)V", "getOutputFile", "()Ljava/io/File;", "getProgress", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "isComplete", "toString", "", "Companion", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Progress
{
    public static final int $stable;
    public static final Companion Companion;
    public static final int MAX_PROGRESS = 100;
    private final File outputFile;
    private final int progress;
    
    static {
        Companion = new Companion(null);
        $stable = 8;
    }
    
    public Progress(final int progress, final File outputFile) {
        e.f((Object)outputFile, "outputFile");
        this.progress = progress;
        this.outputFile = outputFile;
    }
    
    public final int component1() {
        return this.progress;
    }
    
    public final File component2() {
        return this.outputFile;
    }
    
    public final Progress copy(final int n, final File file) {
        e.f((Object)file, "outputFile");
        return new Progress(n, file);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Progress)) {
            return false;
        }
        final Progress progress = (Progress)o;
        return this.progress == progress.progress && e.a((Object)this.outputFile, (Object)progress.outputFile);
    }
    
    public final File getOutputFile() {
        return this.outputFile;
    }
    
    public final int getProgress() {
        return this.progress;
    }
    
    @Override
    public int hashCode() {
        return this.outputFile.hashCode() + Integer.hashCode(this.progress) * 31;
    }
    
    public final boolean isComplete() {
        return this.progress == 100;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Progress(progress=");
        r.append(this.progress);
        r.append(", outputFile=");
        r.append(this.outputFile);
        r.append(')');
        return r.toString();
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lcom/reddit/video/creation/video/trim/Progress$Companion;", "", "()V", "MAX_PROGRESS", "", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
}
