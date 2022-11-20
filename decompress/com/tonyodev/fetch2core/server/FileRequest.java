// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2core.server;

import kotlin.TypeCastException;
import android.os.Parcelable$Creator;
import java.util.Map;
import java.util.HashMap;
import android.os.Parcel;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.tonyodev.fetch2core.Extras;
import kotlin.Metadata;
import java.io.Serializable;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0086\b\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001ABk\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\r\u0012\b\b\u0002\u0010\u001b\u001a\u00020\r\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0005\u0012\b\b\u0002\u0010 \u001a\u00020\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\u0016¢\u0006\u0004\b>\u0010?J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\t\u0010\n\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\rH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0012H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0016H\u00c6\u0003Jm\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u0016H\u00c6\u0001J\t\u0010#\u001a\u00020\u000bH\u00d6\u0001J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010'\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010%H\u00d6\u0003R\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0019\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u001a\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u001b\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001b\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\u001c\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b2\u0010-R\u0017\u0010\u001d\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b3\u0010-R\u0017\u0010\u001e\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001e\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u001f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b7\u0010*R\u0017\u0010 \u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b8\u0010*R\u0017\u0010!\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b!\u00109\u001a\u0004\b:\u0010;R\u0011\u0010=\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b<\u0010-¨\u0006B" }, d2 = { "Lcom/tonyodev/fetch2core/server/FileRequest;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "Landroid/os/Parcel;", "dest", "", "flags", "Lcg2/j;", "writeToParcel", "describeContents", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "Lcom/tonyodev/fetch2core/Extras;", "component7", "component8", "component9", "", "component10", "type", "fileResourceId", "rangeStart", "rangeEnd", "authorization", "client", "extras", "page", "size", "persistConnection", "copy", "toString", "hashCode", "", "other", "equals", "I", "getType", "()I", "Ljava/lang/String;", "getFileResourceId", "()Ljava/lang/String;", "J", "getRangeStart", "()J", "getRangeEnd", "getAuthorization", "getClient", "Lcom/tonyodev/fetch2core/Extras;", "getExtras", "()Lcom/tonyodev/fetch2core/Extras;", "getPage", "getSize", "Z", "getPersistConnection", "()Z", "getToJsonString", "toJsonString", "<init>", "(ILjava/lang/String;JJLjava/lang/String;Ljava/lang/String;Lcom/tonyodev/fetch2core/Extras;IIZ)V", "CREATOR", "a", "fetch2core_release" }, k = 1, mv = { 1, 4, 0 })
public final class FileRequest implements Parcelable, Serializable
{
    public static final String CATALOG_FILE = "/Catalog.json";
    public static final long CATALOG_ID = -1L;
    public static final String CATALOG_NAME = "Catalog.json";
    public static final a CREATOR;
    public static final String FIELD_AUTHORIZATION = "Authorization";
    public static final String FIELD_CLIENT = "Client";
    public static final String FIELD_EXTRAS = "Extras";
    public static final String FIELD_FILE_RESOURCE_ID = "FileResourceId";
    public static final String FIELD_PAGE = "Page";
    public static final String FIELD_PERSIST_CONNECTION = "Persist-Connection";
    public static final String FIELD_RANGE_END = "Range-End";
    public static final String FIELD_RANGE_START = "Range-Start";
    public static final String FIELD_SIZE = "Size";
    public static final String FIELD_TYPE = "Type";
    public static final int TYPE_CATALOG = 2;
    public static final int TYPE_FILE = 1;
    public static final int TYPE_INVALID = -1;
    public static final int TYPE_PING = 0;
    private final String authorization;
    private final String client;
    private final Extras extras;
    private final String fileResourceId;
    private final int page;
    private final boolean persistConnection;
    private final long rangeEnd;
    private final long rangeStart;
    private final int size;
    private final int type;
    
    static {
        CREATOR = new a();
    }
    
    public FileRequest() {
        this(0, null, 0L, 0L, null, null, null, 0, 0, false, 1023, null);
    }
    
    public FileRequest(final int type, final String fileResourceId, final long rangeStart, final long rangeEnd, final String authorization, final String client, final Extras extras, final int page, final int size, final boolean persistConnection) {
        e.g((Object)fileResourceId, "fileResourceId");
        e.g((Object)authorization, "authorization");
        e.g((Object)client, "client");
        e.g((Object)extras, "extras");
        this.type = type;
        this.fileResourceId = fileResourceId;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
        this.authorization = authorization;
        this.client = client;
        this.extras = extras;
        this.page = page;
        this.size = size;
        this.persistConnection = persistConnection;
    }
    
    public FileRequest(int n, String value, long n2, long n3, String s, String s2, Extras access$getEmptyExtras$cp, int n4, int n5, boolean b, final int n6, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n6 & 0x1) != 0x0) {
            n = -1;
        }
        final long n7 = -1L;
        if ((n6 & 0x2) != 0x0) {
            value = String.valueOf(-1L);
        }
        if ((n6 & 0x4) != 0x0) {
            n2 = 0L;
        }
        if ((n6 & 0x8) != 0x0) {
            n3 = n7;
        }
        final String s3 = "";
        if ((n6 & 0x10) != 0x0) {
            s = "";
        }
        if ((n6 & 0x20) != 0x0) {
            s2 = s3;
        }
        if ((n6 & 0x40) != 0x0) {
            Extras.CREATOR.getClass();
            access$getEmptyExtras$cp = Extras.access$getEmptyExtras$cp();
        }
        final int n8 = 0;
        if ((n6 & 0x80) != 0x0) {
            n4 = 0;
        }
        if ((n6 & 0x100) != 0x0) {
            n5 = n8;
        }
        if ((n6 & 0x200) != 0x0) {
            b = true;
        }
        this(n, value, n2, n3, s, s2, access$getEmptyExtras$cp, n4, n5, b);
    }
    
    public static FileRequest copy$default(final FileRequest fileRequest, int type, String fileResourceId, long rangeStart, long rangeEnd, String authorization, String client, Extras extras, int page, int size, boolean persistConnection, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            type = fileRequest.type;
        }
        if ((n & 0x2) != 0x0) {
            fileResourceId = fileRequest.fileResourceId;
        }
        if ((n & 0x4) != 0x0) {
            rangeStart = fileRequest.rangeStart;
        }
        if ((n & 0x8) != 0x0) {
            rangeEnd = fileRequest.rangeEnd;
        }
        if ((n & 0x10) != 0x0) {
            authorization = fileRequest.authorization;
        }
        if ((n & 0x20) != 0x0) {
            client = fileRequest.client;
        }
        if ((n & 0x40) != 0x0) {
            extras = fileRequest.extras;
        }
        if ((n & 0x80) != 0x0) {
            page = fileRequest.page;
        }
        if ((n & 0x100) != 0x0) {
            size = fileRequest.size;
        }
        if ((n & 0x200) != 0x0) {
            persistConnection = fileRequest.persistConnection;
        }
        return fileRequest.copy(type, fileResourceId, rangeStart, rangeEnd, authorization, client, extras, page, size, persistConnection);
    }
    
    public final int component1() {
        return this.type;
    }
    
    public final boolean component10() {
        return this.persistConnection;
    }
    
    public final String component2() {
        return this.fileResourceId;
    }
    
    public final long component3() {
        return this.rangeStart;
    }
    
    public final long component4() {
        return this.rangeEnd;
    }
    
    public final String component5() {
        return this.authorization;
    }
    
    public final String component6() {
        return this.client;
    }
    
    public final Extras component7() {
        return this.extras;
    }
    
    public final int component8() {
        return this.page;
    }
    
    public final int component9() {
        return this.size;
    }
    
    public final FileRequest copy(final int n, final String s, final long n2, final long n3, final String s2, final String s3, final Extras extras, final int n4, final int n5, final boolean b) {
        e.g((Object)s, "fileResourceId");
        e.g((Object)s2, "authorization");
        e.g((Object)s3, "client");
        e.g((Object)extras, "extras");
        return new FileRequest(n, s, n2, n3, s2, s3, extras, n4, n5, b);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof FileRequest) {
                final FileRequest fileRequest = (FileRequest)o;
                if (this.type == fileRequest.type && e.a((Object)this.fileResourceId, (Object)fileRequest.fileResourceId) && this.rangeStart == fileRequest.rangeStart && this.rangeEnd == fileRequest.rangeEnd && e.a((Object)this.authorization, (Object)fileRequest.authorization) && e.a((Object)this.client, (Object)fileRequest.client) && e.a((Object)this.extras, (Object)fileRequest.extras) && this.page == fileRequest.page && this.size == fileRequest.size && this.persistConnection == fileRequest.persistConnection) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final String getAuthorization() {
        return this.authorization;
    }
    
    public final String getClient() {
        return this.client;
    }
    
    public final Extras getExtras() {
        return this.extras;
    }
    
    public final String getFileResourceId() {
        return this.fileResourceId;
    }
    
    public final int getPage() {
        return this.page;
    }
    
    public final boolean getPersistConnection() {
        return this.persistConnection;
    }
    
    public final long getRangeEnd() {
        return this.rangeEnd;
    }
    
    public final long getRangeStart() {
        return this.rangeStart;
    }
    
    public final int getSize() {
        return this.size;
    }
    
    public final String getToJsonString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('{');
        sb.append("\"Type\":");
        sb.append(this.type);
        sb.append(',');
        sb.append("\"FileResourceId\":");
        final StringBuilder sb2 = new StringBuilder();
        sb2.append('\"');
        sb2.append(this.fileResourceId);
        sb2.append('\"');
        sb.append(sb2.toString());
        sb.append(',');
        sb.append("\"Range-Start\":");
        sb.append(this.rangeStart);
        sb.append(',');
        sb.append("\"Range-End\":");
        sb.append(this.rangeEnd);
        sb.append(',');
        sb.append("\"Authorization\":");
        final StringBuilder sb3 = new StringBuilder();
        sb3.append('\"');
        sb3.append(this.authorization);
        sb3.append('\"');
        sb.append(sb3.toString());
        sb.append(',');
        sb.append("\"Client\":");
        final StringBuilder sb4 = new StringBuilder();
        sb4.append('\"');
        sb4.append(this.client);
        sb4.append('\"');
        sb.append(sb4.toString());
        sb.append(',');
        sb.append("\"Extras\":");
        sb.append(this.extras.toJSONString());
        sb.append(',');
        sb.append("\"Page\":");
        sb.append(this.page);
        sb.append(',');
        sb.append("\"Size\":");
        sb.append(this.size);
        sb.append(',');
        sb.append("\"Persist-Connection\":");
        sb.append(this.persistConnection);
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
        final int type = this.type;
        final String fileResourceId = this.fileResourceId;
        int hashCode = 0;
        int hashCode2;
        if (fileResourceId != null) {
            hashCode2 = fileResourceId.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final long rangeStart = this.rangeStart;
        final int n = (int)(rangeStart ^ rangeStart >>> 32);
        final long rangeEnd = this.rangeEnd;
        final int n2 = (int)(rangeEnd ^ rangeEnd >>> 32);
        final String authorization = this.authorization;
        int hashCode3;
        if (authorization != null) {
            hashCode3 = authorization.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String client = this.client;
        int hashCode4;
        if (client != null) {
            hashCode4 = client.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final Extras extras = this.extras;
        if (extras != null) {
            hashCode = extras.hashCode();
        }
        final int page = this.page;
        final int size = this.size;
        int persistConnection;
        if ((persistConnection = (this.persistConnection ? 1 : 0)) != 0) {
            persistConnection = 1;
        }
        return ((((((((type * 31 + hashCode2) * 31 + n) * 31 + n2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode) * 31 + page) * 31 + size) * 31 + persistConnection;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("FileRequest(type=");
        t.append(this.type);
        t.append(", fileResourceId=");
        t.append(this.fileResourceId);
        t.append(", rangeStart=");
        t.append(this.rangeStart);
        t.append(", rangeEnd=");
        t.append(this.rangeEnd);
        t.append(", authorization=");
        t.append(this.authorization);
        t.append(", client=");
        t.append(this.client);
        t.append(", extras=");
        t.append(this.extras);
        t.append(", page=");
        t.append(this.page);
        t.append(", size=");
        t.append(this.size);
        t.append(", persistConnection=");
        t.append(this.persistConnection);
        t.append(")");
        return t.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.g((Object)parcel, "dest");
        parcel.writeInt(this.type);
        parcel.writeString(this.fileResourceId);
        parcel.writeLong(this.rangeStart);
        parcel.writeLong(this.rangeEnd);
        parcel.writeString(this.authorization);
        parcel.writeString(this.client);
        parcel.writeSerializable((Serializable)new HashMap<Object, Object>(this.extras.getMap()));
        parcel.writeInt(this.page);
        parcel.writeInt(this.size);
        parcel.writeInt((int)(this.persistConnection ? 1 : 0));
    }
    
    public static final class a implements Parcelable$Creator<FileRequest>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.g((Object)parcel, "source");
            final int int1 = parcel.readInt();
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            final long long1 = parcel.readLong();
            final long long2 = parcel.readLong();
            String string2 = parcel.readString();
            if (string2 == null) {
                string2 = "";
            }
            String string3 = parcel.readString();
            if (string3 == null) {
                string3 = "";
            }
            final Serializable serializable = parcel.readSerializable();
            if (serializable != null) {
                return new FileRequest(int1, string, long1, long2, string2, string3, new Extras((Map<String, String>)serializable), parcel.readInt(), parcel.readInt(), parcel.readInt() == 1);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
        }
        
        public final Object[] newArray(final int n) {
            return new FileRequest[n];
        }
    }
}
