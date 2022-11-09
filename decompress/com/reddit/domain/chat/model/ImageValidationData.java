// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ah2.f;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/chat/model/ImageValidationData;", "", "file", "Ljava/io/File;", "mimeType", "Lcom/reddit/domain/chat/model/MimeType;", "(Ljava/io/File;Lcom/reddit/domain/chat/model/MimeType;)V", "getFile", "()Ljava/io/File;", "getMimeType", "()Lcom/reddit/domain/chat/model/MimeType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ImageValidationData
{
    private final File file;
    private final MimeType mimeType;
    
    public ImageValidationData(final File file, final MimeType mimeType) {
        f.f((Object)file, "file");
        f.f((Object)mimeType, "mimeType");
        this.file = file;
        this.mimeType = mimeType;
    }
    
    public final File component1() {
        return this.file;
    }
    
    public final MimeType component2() {
        return this.mimeType;
    }
    
    public final ImageValidationData copy(final File file, final MimeType mimeType) {
        f.f((Object)file, "file");
        f.f((Object)mimeType, "mimeType");
        return new ImageValidationData(file, mimeType);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageValidationData)) {
            return false;
        }
        final ImageValidationData imageValidationData = (ImageValidationData)o;
        return f.a((Object)this.file, (Object)imageValidationData.file) && this.mimeType == imageValidationData.mimeType;
    }
    
    public final File getFile() {
        return this.file;
    }
    
    public final MimeType getMimeType() {
        return this.mimeType;
    }
    
    @Override
    public int hashCode() {
        return this.mimeType.hashCode() + this.file.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ImageValidationData(file=");
        k.append(this.file);
        k.append(", mimeType=");
        k.append(this.mimeType);
        k.append(')');
        return k.toString();
    }
}
