// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model;

import java.util.Collections;
import java.util.ArrayList;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import java.util.List;
import com.google.gson.a.c;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ImageModel implements Parcelable
{
    public static final Parcelable$Creator<ImageModel> CREATOR;
    @c(LIZ = "avg_color")
    public String avgColor;
    @c(LIZ = "content")
    public Content content;
    @c(LIZ = "height")
    public int height;
    @c(LIZ = "image_type")
    public int imageType;
    @c(LIZ = "is_animated")
    public boolean isAnimated;
    public boolean isFeedCandidate;
    public boolean isLoaded;
    public boolean isMonitored;
    @c(LIZ = "uri")
    public String mUri;
    @c(LIZ = "url_list")
    public List<String> mUrls;
    @c(LIZ = "open_web_url")
    public String schema;
    @c(LIZ = "width")
    public int width;
    
    static {
        Covode.recordClassIndex(4904);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ImageModel>() {
            static {
                Covode.recordClassIndex(4905);
            }
        };
    }
    
    public ImageModel() {
        this.mUrls = new ArrayList<String>();
    }
    
    public ImageModel(final Parcel parcel) {
        this.mUrls = new ArrayList<String>();
        this.mUri = parcel.readString();
        this.mUrls = parcel.createStringArrayList();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.schema = parcel.readString();
        this.imageType = parcel.readInt();
        this.content = (Content)parcel.readParcelable(Content.class.getClassLoader());
        final byte byte1 = parcel.readByte();
        final boolean b = true;
        this.isAnimated = (byte1 != 0);
        this.isLoaded = (parcel.readByte() != 0);
        this.isMonitored = (parcel.readByte() != 0);
        this.isFeedCandidate = (parcel.readByte() != 0 && b);
    }
    
    public ImageModel(final String mUri, final List<String> mUrls) {
        this.mUrls = new ArrayList<String>();
        this.mUri = mUri;
        this.mUrls = mUrls;
    }
    
    public ImageModel(final String mUri, final List<String> mUrls, final String schema) {
        this.mUrls = new ArrayList<String>();
        this.mUri = mUri;
        this.mUrls = mUrls;
        this.schema = schema;
    }
    
    public static boolean equals(final Object o, final Object o2) {
        return o == o2 || (o != null && o.equals(o2));
    }
    
    public static ImageModel genBy(final String s) {
        final ImageModel imageModel = new ImageModel();
        imageModel.setUrls(Collections.singletonList(s));
        return imageModel;
    }
    
    public static int hash(final Object... array) {
        if (array == null) {
            return 0;
        }
        final int length = array.length;
        int n = 1;
        for (final Object o : array) {
            int hashCode;
            if (o == null) {
                hashCode = 0;
            }
            else {
                hashCode = o.hashCode();
            }
            n = n * 31 + hashCode;
        }
        return n;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final ImageModel imageModel = (ImageModel)o;
            if (this.width == imageModel.width && this.height == imageModel.height && equals(this.avgColor, imageModel.avgColor) && equals(this.mUri, imageModel.mUri) && equals(this.mUrls, imageModel.mUrls)) {
                return true;
            }
        }
        return false;
    }
    
    public String getAvgColor() {
        return this.avgColor;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    @c(LIZ = "content")
    public Content getImageContent() {
        return this.content;
    }
    
    @c(LIZ = "image_type")
    public int getImageType() {
        return this.imageType;
    }
    
    @c(LIZ = "open_web_url")
    public String getSchema() {
        return this.schema;
    }
    
    @c(LIZ = "uri")
    public String getUri() {
        return this.mUri;
    }
    
    @c(LIZ = "url_list")
    public List<String> getUrls() {
        return this.mUrls;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    @Override
    public int hashCode() {
        return hash(this.avgColor, this.mUri, this.mUrls, this.width, this.height);
    }
    
    @c(LIZ = "is_animated")
    public boolean isAnimated() {
        return this.isAnimated;
    }
    
    public boolean isFeedCandidate() {
        return this.isFeedCandidate;
    }
    
    public boolean isLoaded() {
        return this.isLoaded;
    }
    
    public boolean isMonitored() {
        return this.isMonitored;
    }
    
    @c(LIZ = "is_animated")
    public void setAnimated(final boolean isAnimated) {
        this.isAnimated = isAnimated;
    }
    
    public void setAvgColor(final String avgColor) {
        this.avgColor = avgColor;
    }
    
    @c(LIZ = "content")
    public void setContent(final Content content) {
        this.content = content;
    }
    
    public void setFeedCandidate(final boolean isFeedCandidate) {
        this.isFeedCandidate = isFeedCandidate;
    }
    
    public void setHeight(final int height) {
        this.height = height;
    }
    
    @c(LIZ = "image_type")
    public void setImageType(final int imageType) {
        this.imageType = imageType;
    }
    
    public void setLoaded(final boolean isLoaded) {
        this.isLoaded = isLoaded;
    }
    
    public void setMonitored(final boolean isMonitored) {
        this.isMonitored = isMonitored;
    }
    
    @c(LIZ = "open_web_url")
    public void setSchema(final String schema) {
        this.schema = schema;
    }
    
    @c(LIZ = "uri")
    public void setUri(final String mUri) {
        this.mUri = mUri;
    }
    
    @c(LIZ = "url_list")
    public void setUrls(final List<String> mUrls) {
        this.mUrls = mUrls;
    }
    
    public void setWidth(final int width) {
        this.width = width;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{\"uri\":\"");
        final String mUri = this.mUri;
        final String s = "";
        String s2 = mUri;
        if (mUri == null) {
            s2 = "";
        }
        sb.append(s2);
        sb.append("\",\"image_type\":\"");
        String schema = this.schema;
        if (schema == null) {
            schema = s;
        }
        sb.append(schema);
        sb.append("\",\"url_list\":[");
        final List<String> mUrls = this.mUrls;
        if (mUrls != null) {
            for (int size = mUrls.size(), i = 0; i < size; ++i) {
                sb.append("\"");
                sb.append(this.mUrls.get(i));
                sb.append("\"");
                if (i != size - 1) {
                    sb.append(",");
                }
            }
        }
        sb.append("]}");
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.mUri);
        parcel.writeStringList((List)this.mUrls);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.schema);
        parcel.writeInt(this.imageType);
        parcel.writeParcelable((Parcelable)this.content, n);
        parcel.writeByte((byte)(byte)(this.isAnimated ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.isLoaded ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.isMonitored ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.isFeedCandidate ? 1 : 0));
    }
    
    public static class Content implements Parcelable
    {
        public static final Parcelable$Creator<Content> CREATOR;
        @c(LIZ = "name")
        public String LIZ;
        @c(LIZ = "font_color")
        public String LIZIZ;
        @c(LIZ = "level")
        public long LIZJ;
        
        static {
            Covode.recordClassIndex(4906);
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<Content>() {
                static {
                    Covode.recordClassIndex(4907);
                }
            };
        }
        
        public Content() {
        }
        
        public Content(final Parcel parcel) {
            this.LIZ = parcel.readString();
            this.LIZIZ = parcel.readString();
            this.LIZJ = parcel.readLong();
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeString(this.LIZ);
            parcel.writeString(this.LIZIZ);
            parcel.writeLong(this.LIZJ);
        }
    }
}
