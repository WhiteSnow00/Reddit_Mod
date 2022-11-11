// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import androidx.appcompat.widget.s0;
import ag0.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u0011\u001a\u00020\fH\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fH\u00d6\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\"" }, d2 = { "Lcom/reddit/domain/model/FileUploadResponse;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "component3", "fileUrl", "fileKey", "success", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getFileUrl", "()Ljava/lang/String;", "getFileKey", "Z", "getSuccess", "()Z", "setSuccess", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class FileUploadResponse implements Parcelable
{
    public static final Parcelable$Creator<FileUploadResponse> CREATOR;
    private final String fileKey;
    private final String fileUrl;
    private boolean success;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public FileUploadResponse(final String fileUrl, final String fileKey, final boolean success) {
        f.f((Object)fileUrl, "fileUrl");
        f.f((Object)fileKey, "fileKey");
        this.fileUrl = fileUrl;
        this.fileKey = fileKey;
        this.success = success;
    }
    
    public final String component1() {
        return this.fileUrl;
    }
    
    public final String component2() {
        return this.fileKey;
    }
    
    public final boolean component3() {
        return this.success;
    }
    
    public final FileUploadResponse copy(final String s, final String s2, final boolean b) {
        f.f((Object)s, "fileUrl");
        f.f((Object)s2, "fileKey");
        return new FileUploadResponse(s, s2, b);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileUploadResponse)) {
            return false;
        }
        final FileUploadResponse fileUploadResponse = (FileUploadResponse)o;
        return f.a((Object)this.fileUrl, (Object)fileUploadResponse.fileUrl) && f.a((Object)this.fileKey, (Object)fileUploadResponse.fileKey) && this.success == fileUploadResponse.success;
    }
    
    public final String getFileKey() {
        return this.fileKey;
    }
    
    public final String getFileUrl() {
        return this.fileUrl;
    }
    
    public final boolean getSuccess() {
        return this.success;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.fileKey, this.fileUrl.hashCode() * 31, 31);
        int success;
        if ((success = (this.success ? 1 : 0)) != 0) {
            success = 1;
        }
        return f + success;
    }
    
    public final void setSuccess(final boolean success) {
        this.success = success;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("FileUploadResponse(fileUrl=");
        k.append(this.fileUrl);
        k.append(", fileKey=");
        k.append(this.fileKey);
        k.append(", success=");
        return s0.o(k, this.success, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.fileUrl);
        parcel.writeString(this.fileKey);
        parcel.writeInt((int)(this.success ? 1 : 0));
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<FileUploadResponse>
    {
        public final FileUploadResponse createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new FileUploadResponse(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }
        
        public final FileUploadResponse[] newArray(final int n) {
            return new FileUploadResponse[n];
        }
    }
}
