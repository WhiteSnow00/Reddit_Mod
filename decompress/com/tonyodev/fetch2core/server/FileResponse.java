// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2core.server;

import android.os.Parcelable$Creator;
import android.os.Parcel;
import java.util.Date;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import java.io.Serializable;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00013BM\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b0\u00101J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\t\u0010\n\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\rH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0010H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0010H\u00c6\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0010H\u00c6\u0001J\t\u0010\u001b\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003R\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0019\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b-\u0010,R\u0011\u0010/\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010,¨\u00064" }, d2 = { "Lcom/tonyodev/fetch2core/server/FileResponse;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "Landroid/os/Parcel;", "dest", "", "flags", "Lcg2/j;", "writeToParcel", "describeContents", "component1", "component2", "component3", "", "component4", "component5", "", "component6", "component7", "status", "type", "connection", "date", "contentLength", "md5", "sessionId", "copy", "toString", "hashCode", "", "other", "", "equals", "I", "getStatus", "()I", "getType", "getConnection", "J", "getDate", "()J", "getContentLength", "Ljava/lang/String;", "getMd5", "()Ljava/lang/String;", "getSessionId", "getToJsonString", "toJsonString", "<init>", "(IIIJJLjava/lang/String;Ljava/lang/String;)V", "CREATOR", "a", "fetch2core_release" }, k = 1, mv = { 1, 4, 0 })
public final class FileResponse implements Parcelable, Serializable
{
    public static final int CLOSE_CONNECTION = 0;
    public static final a CREATOR;
    public static final String FIELD_CONNECTION = "connection";
    public static final String FIELD_CONTENT_LENGTH = "content-length";
    public static final String FIELD_DATE = "date";
    public static final String FIELD_MD5 = "md5";
    public static final String FIELD_SESSION_ID = "sessionid";
    public static final String FIELD_STATUS = "status";
    public static final String FIELD_TYPE = "type";
    public static final int OPEN_CONNECTION = 1;
    private final int connection;
    private final long contentLength;
    private final long date;
    private final String md5;
    private final String sessionId;
    private final int status;
    private final int type;
    
    static {
        CREATOR = new a();
    }
    
    public FileResponse() {
        this(0, 0, 0, 0L, 0L, null, null, 127, null);
    }
    
    public FileResponse(final int status, final int type, final int connection, final long date, final long contentLength, final String md5, final String sessionId) {
        e.g((Object)md5, "md5");
        e.g((Object)sessionId, "sessionId");
        this.status = status;
        this.type = type;
        this.connection = connection;
        this.date = date;
        this.contentLength = contentLength;
        this.md5 = md5;
        this.sessionId = sessionId;
    }
    
    public FileResponse(int n, int n2, int n3, long time, long n4, String s, String s2, final int n5, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n5 & 0x1) != 0x0) {
            n = 415;
        }
        if ((n5 & 0x2) != 0x0) {
            n2 = -1;
        }
        if ((n5 & 0x4) != 0x0) {
            n3 = 0;
        }
        if ((n5 & 0x8) != 0x0) {
            time = new Date().getTime();
        }
        if ((n5 & 0x10) != 0x0) {
            n4 = 0L;
        }
        final String s3 = "";
        if ((n5 & 0x20) != 0x0) {
            s = "";
        }
        if ((n5 & 0x40) != 0x0) {
            s2 = s3;
        }
        this(n, n2, n3, time, n4, s, s2);
    }
    
    public static FileResponse copy$default(final FileResponse fileResponse, int status, int type, int connection, long date, long contentLength, String md5, String sessionId, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            status = fileResponse.status;
        }
        if ((n & 0x2) != 0x0) {
            type = fileResponse.type;
        }
        if ((n & 0x4) != 0x0) {
            connection = fileResponse.connection;
        }
        if ((n & 0x8) != 0x0) {
            date = fileResponse.date;
        }
        if ((n & 0x10) != 0x0) {
            contentLength = fileResponse.contentLength;
        }
        if ((n & 0x20) != 0x0) {
            md5 = fileResponse.md5;
        }
        if ((n & 0x40) != 0x0) {
            sessionId = fileResponse.sessionId;
        }
        return fileResponse.copy(status, type, connection, date, contentLength, md5, sessionId);
    }
    
    public final int component1() {
        return this.status;
    }
    
    public final int component2() {
        return this.type;
    }
    
    public final int component3() {
        return this.connection;
    }
    
    public final long component4() {
        return this.date;
    }
    
    public final long component5() {
        return this.contentLength;
    }
    
    public final String component6() {
        return this.md5;
    }
    
    public final String component7() {
        return this.sessionId;
    }
    
    public final FileResponse copy(final int n, final int n2, final int n3, final long n4, final long n5, final String s, final String s2) {
        e.g((Object)s, "md5");
        e.g((Object)s2, "sessionId");
        return new FileResponse(n, n2, n3, n4, n5, s, s2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof FileResponse) {
                final FileResponse fileResponse = (FileResponse)o;
                if (this.status == fileResponse.status && this.type == fileResponse.type && this.connection == fileResponse.connection && this.date == fileResponse.date && this.contentLength == fileResponse.contentLength && e.a((Object)this.md5, (Object)fileResponse.md5) && e.a((Object)this.sessionId, (Object)fileResponse.sessionId)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final int getConnection() {
        return this.connection;
    }
    
    public final long getContentLength() {
        return this.contentLength;
    }
    
    public final long getDate() {
        return this.date;
    }
    
    public final String getMd5() {
        return this.md5;
    }
    
    public final String getSessionId() {
        return this.sessionId;
    }
    
    public final int getStatus() {
        return this.status;
    }
    
    public final String getToJsonString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('{');
        sb.append("\"Status\":");
        sb.append(this.status);
        sb.append(',');
        sb.append("\"Md5\":");
        final StringBuilder sb2 = new StringBuilder();
        sb2.append('\"');
        sb2.append(this.md5);
        sb2.append('\"');
        sb.append(sb2.toString());
        sb.append(',');
        sb.append("\"Connection\":");
        sb.append(this.connection);
        sb.append(',');
        sb.append("\"Date\":");
        sb.append(this.date);
        sb.append(',');
        sb.append("\"Content-Length\":");
        sb.append(this.contentLength);
        sb.append(',');
        sb.append("\"Type\":");
        sb.append(this.type);
        sb.append(',');
        sb.append("\"SessionId\":");
        sb.append(this.sessionId);
        sb.append('}');
        final String string = sb.toString();
        e.b((Object)string, "builder.toString()");
        return string;
    }
    
    public final int getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final int status = this.status;
        final int type = this.type;
        final int connection = this.connection;
        final long date = this.date;
        final int n = (int)(date ^ date >>> 32);
        final long contentLength = this.contentLength;
        final int n2 = (int)(contentLength ^ contentLength >>> 32);
        final String md5 = this.md5;
        int hashCode = 0;
        int hashCode2;
        if (md5 != null) {
            hashCode2 = md5.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String sessionId = this.sessionId;
        if (sessionId != null) {
            hashCode = sessionId.hashCode();
        }
        return (((((status * 31 + type) * 31 + connection) * 31 + n) * 31 + n2) * 31 + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("FileResponse(status=");
        t.append(this.status);
        t.append(", type=");
        t.append(this.type);
        t.append(", connection=");
        t.append(this.connection);
        t.append(", date=");
        t.append(this.date);
        t.append(", contentLength=");
        t.append(this.contentLength);
        t.append(", md5=");
        t.append(this.md5);
        t.append(", sessionId=");
        return ph0.a.f(t, this.sessionId, ")");
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.g((Object)parcel, "dest");
        parcel.writeInt(this.status);
        parcel.writeInt(this.type);
        parcel.writeInt(this.connection);
        parcel.writeLong(this.date);
        parcel.writeLong(this.contentLength);
        parcel.writeString(this.md5);
        parcel.writeString(this.sessionId);
    }
    
    public static final class a implements Parcelable$Creator<FileResponse>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.g((Object)parcel, "source");
            final int int1 = parcel.readInt();
            final int int2 = parcel.readInt();
            final int int3 = parcel.readInt();
            final long long1 = parcel.readLong();
            final long long2 = parcel.readLong();
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            String string2 = parcel.readString();
            if (string2 == null) {
                string2 = "";
            }
            return new FileResponse(int1, int2, int3, long1, long2, string, string2);
        }
        
        public final Object[] newArray(final int n) {
            return new FileResponse[n];
        }
    }
}
