// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/model/FileUploadLeaseMediaGallery;", "", "args", "Lcom/reddit/domain/model/FileUploadLease;", "(Lcom/reddit/domain/model/FileUploadLease;)V", "getArgs", "()Lcom/reddit/domain/model/FileUploadLease;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class FileUploadLeaseMediaGallery
{
    private final FileUploadLease args;
    
    public FileUploadLeaseMediaGallery() {
        this(null, 1, null);
    }
    
    public FileUploadLeaseMediaGallery(final FileUploadLease args) {
        this.args = args;
    }
    
    public final FileUploadLease component1() {
        return this.args;
    }
    
    public final FileUploadLeaseMediaGallery copy(final FileUploadLease fileUploadLease) {
        return new FileUploadLeaseMediaGallery(fileUploadLease);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof FileUploadLeaseMediaGallery && f.a((Object)this.args, (Object)((FileUploadLeaseMediaGallery)o).args));
    }
    
    public final FileUploadLease getArgs() {
        return this.args;
    }
    
    @Override
    public int hashCode() {
        final FileUploadLease args = this.args;
        int hashCode;
        if (args == null) {
            hashCode = 0;
        }
        else {
            hashCode = args.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("FileUploadLeaseMediaGallery(args=");
        k.append(this.args);
        k.append(')');
        return k.toString();
    }
}
