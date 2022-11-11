// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.normalize;

import sg2.e;
import java.io.File;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0004H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015" }, d2 = { "Lcom/reddit/video/creation/video/normalize/NormalizationResult;", "", "normalizedMp4Files", "", "", "normalizedSoundFile", "Ljava/io/File;", "(Ljava/util/List;Ljava/io/File;)V", "getNormalizedMp4Files", "()Ljava/util/List;", "getNormalizedSoundFile", "()Ljava/io/File;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class NormalizationResult
{
    public static final int $stable = 8;
    private final List<String> normalizedMp4Files;
    private final File normalizedSoundFile;
    
    public NormalizationResult(final List<String> normalizedMp4Files, final File normalizedSoundFile) {
        e.f((Object)normalizedMp4Files, "normalizedMp4Files");
        this.normalizedMp4Files = normalizedMp4Files;
        this.normalizedSoundFile = normalizedSoundFile;
    }
    
    public final List<String> component1() {
        return this.normalizedMp4Files;
    }
    
    public final File component2() {
        return this.normalizedSoundFile;
    }
    
    public final NormalizationResult copy(final List<String> list, final File file) {
        e.f((Object)list, "normalizedMp4Files");
        return new NormalizationResult(list, file);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NormalizationResult)) {
            return false;
        }
        final NormalizationResult normalizationResult = (NormalizationResult)o;
        return e.a((Object)this.normalizedMp4Files, (Object)normalizationResult.normalizedMp4Files) && e.a((Object)this.normalizedSoundFile, (Object)normalizationResult.normalizedSoundFile);
    }
    
    public final List<String> getNormalizedMp4Files() {
        return this.normalizedMp4Files;
    }
    
    public final File getNormalizedSoundFile() {
        return this.normalizedSoundFile;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.normalizedMp4Files.hashCode();
        final File normalizedSoundFile = this.normalizedSoundFile;
        int hashCode2;
        if (normalizedSoundFile == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = normalizedSoundFile.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("NormalizationResult(normalizedMp4Files=");
        r.append(this.normalizedMp4Files);
        r.append(", normalizedSoundFile=");
        r.append(this.normalizedSoundFile);
        r.append(')');
        return r.toString();
    }
}
