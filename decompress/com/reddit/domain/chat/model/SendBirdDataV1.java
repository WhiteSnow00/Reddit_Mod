// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import java.util.List;
import p1.h;
import ng2.e;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016" }, d2 = { "Lcom/reddit/domain/chat/model/SendBirdDataV1;", "", "message", "Lcom/reddit/domain/chat/model/SendBirdDataV1$Message;", "(Lcom/reddit/domain/chat/model/SendBirdDataV1$Message;)V", "getMessage", "()Lcom/reddit/domain/chat/model/SendBirdDataV1$Message;", "component1", "copy", "equals", "", "other", "hashCode", "", "toJson", "", "toString", "Awarding", "EmbedData", "Gif", "Image", "Message", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SendBirdDataV1
{
    private final Message message;
    
    public SendBirdDataV1(@n(name = "v1") final Message message) {
        this.message = message;
    }
    
    public static SendBirdDataV1 copy$default(final SendBirdDataV1 sendBirdDataV1, Message message, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            message = sendBirdDataV1.message;
        }
        return sendBirdDataV1.copy(message);
    }
    
    public final Message component1() {
        return this.message;
    }
    
    public final SendBirdDataV1 copy(@n(name = "v1") final Message message) {
        return new SendBirdDataV1(message);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof SendBirdDataV1 && e.a((Object)this.message, (Object)((SendBirdDataV1)o).message));
    }
    
    public final Message getMessage() {
        return this.message;
    }
    
    @Override
    public int hashCode() {
        final Message message = this.message;
        int hashCode;
        if (message == null) {
            hashCode = 0;
        }
        else {
            hashCode = message.hashCode();
        }
        return hashCode;
    }
    
    public final String toJson() {
        return y10.e.d((Class)SendBirdDataV1.class, (Object)this);
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("SendBirdDataV1(message=");
        t.append(this.message);
        t.append(')');
        return t.toString();
    }
    
    @o(generateAdapter = true)
    @Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012" }, d2 = { "Lcom/reddit/domain/chat/model/SendBirdDataV1$Awarding;", "", "awarderId", "", "awardId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAwardId", "()Ljava/lang/String;", "getAwarderId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Awarding
    {
        private final String awardId;
        private final String awarderId;
        
        public Awarding(@n(name = "awarder_id") final String awarderId, @n(name = "award_id") final String awardId) {
            this.awarderId = awarderId;
            this.awardId = awardId;
        }
        
        public static Awarding copy$default(final Awarding awarding, String awarderId, String awardId, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                awarderId = awarding.awarderId;
            }
            if ((n & 0x2) != 0x0) {
                awardId = awarding.awardId;
            }
            return awarding.copy(awarderId, awardId);
        }
        
        public final String component1() {
            return this.awarderId;
        }
        
        public final String component2() {
            return this.awardId;
        }
        
        public final Awarding copy(@n(name = "awarder_id") final String s, @n(name = "award_id") final String s2) {
            return new Awarding(s, s2);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Awarding)) {
                return false;
            }
            final Awarding awarding = (Awarding)o;
            return e.a((Object)this.awarderId, (Object)awarding.awarderId) && e.a((Object)this.awardId, (Object)awarding.awardId);
        }
        
        public final String getAwardId() {
            return this.awardId;
        }
        
        public final String getAwarderId() {
            return this.awarderId;
        }
        
        @Override
        public int hashCode() {
            final String awarderId = this.awarderId;
            int hashCode = 0;
            int hashCode2;
            if (awarderId == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = awarderId.hashCode();
            }
            final String awardId = this.awardId;
            if (awardId != null) {
                hashCode = awardId.hashCode();
            }
            return hashCode2 * 31 + hashCode;
        }
        
        @Override
        public String toString() {
            final StringBuilder t = a.t("Awarding(awarderId=");
            t.append(this.awarderId);
            t.append(", awardId=");
            return h.c(t, this.awardId, ')');
        }
    }
    
    @o(generateAdapter = true)
    @Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/chat/model/SendBirdDataV1$EmbedData;", "", "url", "", "image", "siteName", "title", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getImage", "getSiteName", "getTitle", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class EmbedData
    {
        private final String description;
        private final String image;
        private final String siteName;
        private final String title;
        private final String url;
        
        public EmbedData(@n(name = "url") final String url, @n(name = "image") final String image, @n(name = "site_name") final String siteName, @n(name = "title") final String title, @n(name = "description") final String description) {
            this.url = url;
            this.image = image;
            this.siteName = siteName;
            this.title = title;
            this.description = description;
        }
        
        public static EmbedData copy$default(final EmbedData embedData, String url, String image, String siteName, String title, String description, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                url = embedData.url;
            }
            if ((n & 0x2) != 0x0) {
                image = embedData.image;
            }
            if ((n & 0x4) != 0x0) {
                siteName = embedData.siteName;
            }
            if ((n & 0x8) != 0x0) {
                title = embedData.title;
            }
            if ((n & 0x10) != 0x0) {
                description = embedData.description;
            }
            return embedData.copy(url, image, siteName, title, description);
        }
        
        public final String component1() {
            return this.url;
        }
        
        public final String component2() {
            return this.image;
        }
        
        public final String component3() {
            return this.siteName;
        }
        
        public final String component4() {
            return this.title;
        }
        
        public final String component5() {
            return this.description;
        }
        
        public final EmbedData copy(@n(name = "url") final String s, @n(name = "image") final String s2, @n(name = "site_name") final String s3, @n(name = "title") final String s4, @n(name = "description") final String s5) {
            return new EmbedData(s, s2, s3, s4, s5);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof EmbedData)) {
                return false;
            }
            final EmbedData embedData = (EmbedData)o;
            return e.a((Object)this.url, (Object)embedData.url) && e.a((Object)this.image, (Object)embedData.image) && e.a((Object)this.siteName, (Object)embedData.siteName) && e.a((Object)this.title, (Object)embedData.title) && e.a((Object)this.description, (Object)embedData.description);
        }
        
        public final String getDescription() {
            return this.description;
        }
        
        public final String getImage() {
            return this.image;
        }
        
        public final String getSiteName() {
            return this.siteName;
        }
        
        public final String getTitle() {
            return this.title;
        }
        
        public final String getUrl() {
            return this.url;
        }
        
        @Override
        public int hashCode() {
            final String url = this.url;
            int hashCode = 0;
            int hashCode2;
            if (url == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = url.hashCode();
            }
            final String image = this.image;
            int hashCode3;
            if (image == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = image.hashCode();
            }
            final String siteName = this.siteName;
            int hashCode4;
            if (siteName == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = siteName.hashCode();
            }
            final String title = this.title;
            int hashCode5;
            if (title == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = title.hashCode();
            }
            final String description = this.description;
            if (description != null) {
                hashCode = description.hashCode();
            }
            return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
        }
        
        @Override
        public String toString() {
            final StringBuilder t = a.t("EmbedData(url=");
            t.append(this.url);
            t.append(", image=");
            t.append(this.image);
            t.append(", siteName=");
            t.append(this.siteName);
            t.append(", title=");
            t.append(this.title);
            t.append(", description=");
            return h.c(t, this.description, ')');
        }
    }
    
    @o(generateAdapter = true)
    @Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0002\u0010\u000bJJ\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/chat/model/SendBirdDataV1$Gif;", "", "id", "", "title", "url", "height", "", "width", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()Ljava/lang/String;", "getTitle", "getUrl", "getWidth", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/reddit/domain/chat/model/SendBirdDataV1$Gif;", "equals", "", "other", "hashCode", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Gif
    {
        private final Integer height;
        private final String id;
        private final String title;
        private final String url;
        private final Integer width;
        
        public Gif(@n(name = "id") final String id, @n(name = "title") final String title, @n(name = "url") final String url, @n(name = "height") final Integer height, @n(name = "width") final Integer width) {
            this.id = id;
            this.title = title;
            this.url = url;
            this.height = height;
            this.width = width;
        }
        
        public static Gif copy$default(final Gif gif, String id, String title, String url, Integer height, Integer width, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                id = gif.id;
            }
            if ((n & 0x2) != 0x0) {
                title = gif.title;
            }
            if ((n & 0x4) != 0x0) {
                url = gif.url;
            }
            if ((n & 0x8) != 0x0) {
                height = gif.height;
            }
            if ((n & 0x10) != 0x0) {
                width = gif.width;
            }
            return gif.copy(id, title, url, height, width);
        }
        
        public final String component1() {
            return this.id;
        }
        
        public final String component2() {
            return this.title;
        }
        
        public final String component3() {
            return this.url;
        }
        
        public final Integer component4() {
            return this.height;
        }
        
        public final Integer component5() {
            return this.width;
        }
        
        public final Gif copy(@n(name = "id") final String s, @n(name = "title") final String s2, @n(name = "url") final String s3, @n(name = "height") final Integer n, @n(name = "width") final Integer n2) {
            return new Gif(s, s2, s3, n, n2);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Gif)) {
                return false;
            }
            final Gif gif = (Gif)o;
            return e.a((Object)this.id, (Object)gif.id) && e.a((Object)this.title, (Object)gif.title) && e.a((Object)this.url, (Object)gif.url) && e.a((Object)this.height, (Object)gif.height) && e.a((Object)this.width, (Object)gif.width);
        }
        
        public final Integer getHeight() {
            return this.height;
        }
        
        public final String getId() {
            return this.id;
        }
        
        public final String getTitle() {
            return this.title;
        }
        
        public final String getUrl() {
            return this.url;
        }
        
        public final Integer getWidth() {
            return this.width;
        }
        
        @Override
        public int hashCode() {
            final String id = this.id;
            int hashCode = 0;
            int hashCode2;
            if (id == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = id.hashCode();
            }
            final String title = this.title;
            int hashCode3;
            if (title == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = title.hashCode();
            }
            final String url = this.url;
            int hashCode4;
            if (url == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = url.hashCode();
            }
            final Integer height = this.height;
            int hashCode5;
            if (height == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = height.hashCode();
            }
            final Integer width = this.width;
            if (width != null) {
                hashCode = width.hashCode();
            }
            return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
        }
        
        @Override
        public String toString() {
            final StringBuilder t = a.t("Gif(id=");
            t.append(this.id);
            t.append(", title=");
            t.append(this.title);
            t.append(", url=");
            t.append(this.url);
            t.append(", height=");
            t.append(this.height);
            t.append(", width=");
            return m5.a.h(t, this.width, ')');
        }
    }
    
    @o(generateAdapter = true)
    @Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JV\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\f¨\u0006!" }, d2 = { "Lcom/reddit/domain/chat/model/SendBirdDataV1$Image;", "", "id", "", "title", "url", "height", "", "width", "phase", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()Ljava/lang/String;", "getPhase", "getTitle", "getUrl", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/reddit/domain/chat/model/SendBirdDataV1$Image;", "equals", "", "other", "hashCode", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Image
    {
        private final Integer height;
        private final String id;
        private final String phase;
        private final String title;
        private final String url;
        private final Integer width;
        
        public Image(@n(name = "id") final String id, @n(name = "title") final String title, @n(name = "url") final String url, @n(name = "height") final Integer height, @n(name = "width") final Integer width, @n(name = "phase") final String phase) {
            this.id = id;
            this.title = title;
            this.url = url;
            this.height = height;
            this.width = width;
            this.phase = phase;
        }
        
        public static Image copy$default(final Image image, String id, String title, String url, Integer height, Integer width, String phase, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                id = image.id;
            }
            if ((n & 0x2) != 0x0) {
                title = image.title;
            }
            if ((n & 0x4) != 0x0) {
                url = image.url;
            }
            if ((n & 0x8) != 0x0) {
                height = image.height;
            }
            if ((n & 0x10) != 0x0) {
                width = image.width;
            }
            if ((n & 0x20) != 0x0) {
                phase = image.phase;
            }
            return image.copy(id, title, url, height, width, phase);
        }
        
        public final String component1() {
            return this.id;
        }
        
        public final String component2() {
            return this.title;
        }
        
        public final String component3() {
            return this.url;
        }
        
        public final Integer component4() {
            return this.height;
        }
        
        public final Integer component5() {
            return this.width;
        }
        
        public final String component6() {
            return this.phase;
        }
        
        public final Image copy(@n(name = "id") final String s, @n(name = "title") final String s2, @n(name = "url") final String s3, @n(name = "height") final Integer n, @n(name = "width") final Integer n2, @n(name = "phase") final String s4) {
            return new Image(s, s2, s3, n, n2, s4);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Image)) {
                return false;
            }
            final Image image = (Image)o;
            return e.a((Object)this.id, (Object)image.id) && e.a((Object)this.title, (Object)image.title) && e.a((Object)this.url, (Object)image.url) && e.a((Object)this.height, (Object)image.height) && e.a((Object)this.width, (Object)image.width) && e.a((Object)this.phase, (Object)image.phase);
        }
        
        public final Integer getHeight() {
            return this.height;
        }
        
        public final String getId() {
            return this.id;
        }
        
        public final String getPhase() {
            return this.phase;
        }
        
        public final String getTitle() {
            return this.title;
        }
        
        public final String getUrl() {
            return this.url;
        }
        
        public final Integer getWidth() {
            return this.width;
        }
        
        @Override
        public int hashCode() {
            final String id = this.id;
            int hashCode = 0;
            int hashCode2;
            if (id == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = id.hashCode();
            }
            final String title = this.title;
            int hashCode3;
            if (title == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = title.hashCode();
            }
            final String url = this.url;
            int hashCode4;
            if (url == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = url.hashCode();
            }
            final Integer height = this.height;
            int hashCode5;
            if (height == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = height.hashCode();
            }
            final Integer width = this.width;
            int hashCode6;
            if (width == null) {
                hashCode6 = 0;
            }
            else {
                hashCode6 = width.hashCode();
            }
            final String phase = this.phase;
            if (phase != null) {
                hashCode = phase.hashCode();
            }
            return ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode;
        }
        
        @Override
        public String toString() {
            final StringBuilder t = a.t("Image(id=");
            t.append(this.id);
            t.append(", title=");
            t.append(this.title);
            t.append(", url=");
            t.append(this.url);
            t.append(", height=");
            t.append(this.height);
            t.append(", width=");
            t.append(this.width);
            t.append(", phase=");
            return h.c(t, this.phase, ')');
        }
    }
    
    @o(generateAdapter = true)
    @Metadata(d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\rH\u00c6\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00103\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u0098\u0001\u00105\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020:H\u00d6\u0001J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019¨\u0006<" }, d2 = { "Lcom/reddit/domain/chat/model/SendBirdDataV1$Message;", "", "messageBody", "", "embedData", "Lcom/reddit/domain/chat/model/SendBirdDataV1$EmbedData;", "redditUsername", "snoomoji", "highlights", "", "communityInvite", "Lcom/reddit/domain/chat/model/CommunityInvite;", "collapsedForPreview", "", "awarding", "Lcom/reddit/domain/chat/model/SendBirdDataV1$Awarding;", "gif", "Lcom/reddit/domain/chat/model/SendBirdDataV1$Gif;", "image", "Lcom/reddit/domain/chat/model/SendBirdDataV1$Image;", "clientMessageId", "(Ljava/lang/String;Lcom/reddit/domain/chat/model/SendBirdDataV1$EmbedData;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/reddit/domain/chat/model/CommunityInvite;Ljava/lang/Boolean;Lcom/reddit/domain/chat/model/SendBirdDataV1$Awarding;Lcom/reddit/domain/chat/model/SendBirdDataV1$Gif;Lcom/reddit/domain/chat/model/SendBirdDataV1$Image;Ljava/lang/String;)V", "getAwarding", "()Lcom/reddit/domain/chat/model/SendBirdDataV1$Awarding;", "getClientMessageId", "()Ljava/lang/String;", "getCollapsedForPreview", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCommunityInvite", "()Lcom/reddit/domain/chat/model/CommunityInvite;", "getEmbedData", "()Lcom/reddit/domain/chat/model/SendBirdDataV1$EmbedData;", "getGif", "()Lcom/reddit/domain/chat/model/SendBirdDataV1$Gif;", "getHighlights", "()Ljava/util/List;", "getImage", "()Lcom/reddit/domain/chat/model/SendBirdDataV1$Image;", "getMessageBody", "getRedditUsername", "getSnoomoji", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/reddit/domain/chat/model/SendBirdDataV1$EmbedData;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/reddit/domain/chat/model/CommunityInvite;Ljava/lang/Boolean;Lcom/reddit/domain/chat/model/SendBirdDataV1$Awarding;Lcom/reddit/domain/chat/model/SendBirdDataV1$Gif;Lcom/reddit/domain/chat/model/SendBirdDataV1$Image;Ljava/lang/String;)Lcom/reddit/domain/chat/model/SendBirdDataV1$Message;", "equals", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Message
    {
        private final Awarding awarding;
        private final String clientMessageId;
        private final Boolean collapsedForPreview;
        private final CommunityInvite communityInvite;
        private final EmbedData embedData;
        private final Gif gif;
        private final List<String> highlights;
        private final Image image;
        private final String messageBody;
        private final String redditUsername;
        private final String snoomoji;
        
        public Message(@n(name = "message_body") final String messageBody, @n(name = "embed_data") final EmbedData embedData, @n(name = "reddit_username") final String redditUsername, @n(name = "snoomoji") final String snoomoji, @n(name = "highlights") final List<String> highlights, @n(name = "mod_invitation") final CommunityInvite communityInvite, @n(name = "preview_collapsed") final Boolean collapsedForPreview, @n(name = "awarding") final Awarding awarding, @n(name = "gif") final Gif gif, @n(name = "image") final Image image, @n(name = "clientMessageId") final String clientMessageId) {
            this.messageBody = messageBody;
            this.embedData = embedData;
            this.redditUsername = redditUsername;
            this.snoomoji = snoomoji;
            this.highlights = highlights;
            this.communityInvite = communityInvite;
            this.collapsedForPreview = collapsedForPreview;
            this.awarding = awarding;
            this.gif = gif;
            this.image = image;
            this.clientMessageId = clientMessageId;
        }
        
        public static Message copy$default(final Message message, String messageBody, EmbedData embedData, String redditUsername, String snoomoji, List highlights, CommunityInvite communityInvite, Boolean collapsedForPreview, Awarding awarding, Gif gif, Image image, String clientMessageId, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                messageBody = message.messageBody;
            }
            if ((n & 0x2) != 0x0) {
                embedData = message.embedData;
            }
            if ((n & 0x4) != 0x0) {
                redditUsername = message.redditUsername;
            }
            if ((n & 0x8) != 0x0) {
                snoomoji = message.snoomoji;
            }
            if ((n & 0x10) != 0x0) {
                highlights = message.highlights;
            }
            if ((n & 0x20) != 0x0) {
                communityInvite = message.communityInvite;
            }
            if ((n & 0x40) != 0x0) {
                collapsedForPreview = message.collapsedForPreview;
            }
            if ((n & 0x80) != 0x0) {
                awarding = message.awarding;
            }
            if ((n & 0x100) != 0x0) {
                gif = message.gif;
            }
            if ((n & 0x200) != 0x0) {
                image = message.image;
            }
            if ((n & 0x400) != 0x0) {
                clientMessageId = message.clientMessageId;
            }
            return message.copy(messageBody, embedData, redditUsername, snoomoji, highlights, communityInvite, collapsedForPreview, awarding, gif, image, clientMessageId);
        }
        
        public final String component1() {
            return this.messageBody;
        }
        
        public final Image component10() {
            return this.image;
        }
        
        public final String component11() {
            return this.clientMessageId;
        }
        
        public final EmbedData component2() {
            return this.embedData;
        }
        
        public final String component3() {
            return this.redditUsername;
        }
        
        public final String component4() {
            return this.snoomoji;
        }
        
        public final List<String> component5() {
            return this.highlights;
        }
        
        public final CommunityInvite component6() {
            return this.communityInvite;
        }
        
        public final Boolean component7() {
            return this.collapsedForPreview;
        }
        
        public final Awarding component8() {
            return this.awarding;
        }
        
        public final Gif component9() {
            return this.gif;
        }
        
        public final Message copy(@n(name = "message_body") final String s, @n(name = "embed_data") final EmbedData embedData, @n(name = "reddit_username") final String s2, @n(name = "snoomoji") final String s3, @n(name = "highlights") final List<String> list, @n(name = "mod_invitation") final CommunityInvite communityInvite, @n(name = "preview_collapsed") final Boolean b, @n(name = "awarding") final Awarding awarding, @n(name = "gif") final Gif gif, @n(name = "image") final Image image, @n(name = "clientMessageId") final String s4) {
            return new Message(s, embedData, s2, s3, list, communityInvite, b, awarding, gif, image, s4);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Message)) {
                return false;
            }
            final Message message = (Message)o;
            return e.a((Object)this.messageBody, (Object)message.messageBody) && e.a((Object)this.embedData, (Object)message.embedData) && e.a((Object)this.redditUsername, (Object)message.redditUsername) && e.a((Object)this.snoomoji, (Object)message.snoomoji) && e.a((Object)this.highlights, (Object)message.highlights) && e.a((Object)this.communityInvite, (Object)message.communityInvite) && e.a((Object)this.collapsedForPreview, (Object)message.collapsedForPreview) && e.a((Object)this.awarding, (Object)message.awarding) && e.a((Object)this.gif, (Object)message.gif) && e.a((Object)this.image, (Object)message.image) && e.a((Object)this.clientMessageId, (Object)message.clientMessageId);
        }
        
        public final Awarding getAwarding() {
            return this.awarding;
        }
        
        public final String getClientMessageId() {
            return this.clientMessageId;
        }
        
        public final Boolean getCollapsedForPreview() {
            return this.collapsedForPreview;
        }
        
        public final CommunityInvite getCommunityInvite() {
            return this.communityInvite;
        }
        
        public final EmbedData getEmbedData() {
            return this.embedData;
        }
        
        public final Gif getGif() {
            return this.gif;
        }
        
        public final List<String> getHighlights() {
            return this.highlights;
        }
        
        public final Image getImage() {
            return this.image;
        }
        
        public final String getMessageBody() {
            return this.messageBody;
        }
        
        public final String getRedditUsername() {
            return this.redditUsername;
        }
        
        public final String getSnoomoji() {
            return this.snoomoji;
        }
        
        @Override
        public int hashCode() {
            final String messageBody = this.messageBody;
            int hashCode = 0;
            int hashCode2;
            if (messageBody == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = messageBody.hashCode();
            }
            final EmbedData embedData = this.embedData;
            int hashCode3;
            if (embedData == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = embedData.hashCode();
            }
            final String redditUsername = this.redditUsername;
            int hashCode4;
            if (redditUsername == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = redditUsername.hashCode();
            }
            final String snoomoji = this.snoomoji;
            int hashCode5;
            if (snoomoji == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = snoomoji.hashCode();
            }
            final List<String> highlights = this.highlights;
            int hashCode6;
            if (highlights == null) {
                hashCode6 = 0;
            }
            else {
                hashCode6 = highlights.hashCode();
            }
            final CommunityInvite communityInvite = this.communityInvite;
            int hashCode7;
            if (communityInvite == null) {
                hashCode7 = 0;
            }
            else {
                hashCode7 = communityInvite.hashCode();
            }
            final Boolean collapsedForPreview = this.collapsedForPreview;
            int hashCode8;
            if (collapsedForPreview == null) {
                hashCode8 = 0;
            }
            else {
                hashCode8 = collapsedForPreview.hashCode();
            }
            final Awarding awarding = this.awarding;
            int hashCode9;
            if (awarding == null) {
                hashCode9 = 0;
            }
            else {
                hashCode9 = awarding.hashCode();
            }
            final Gif gif = this.gif;
            int hashCode10;
            if (gif == null) {
                hashCode10 = 0;
            }
            else {
                hashCode10 = gif.hashCode();
            }
            final Image image = this.image;
            int hashCode11;
            if (image == null) {
                hashCode11 = 0;
            }
            else {
                hashCode11 = image.hashCode();
            }
            final String clientMessageId = this.clientMessageId;
            if (clientMessageId != null) {
                hashCode = clientMessageId.hashCode();
            }
            return (((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode;
        }
        
        @Override
        public String toString() {
            final StringBuilder t = a.t("Message(messageBody=");
            t.append(this.messageBody);
            t.append(", embedData=");
            t.append(this.embedData);
            t.append(", redditUsername=");
            t.append(this.redditUsername);
            t.append(", snoomoji=");
            t.append(this.snoomoji);
            t.append(", highlights=");
            t.append(this.highlights);
            t.append(", communityInvite=");
            t.append(this.communityInvite);
            t.append(", collapsedForPreview=");
            t.append(this.collapsedForPreview);
            t.append(", awarding=");
            t.append(this.awarding);
            t.append(", gif=");
            t.append(this.gif);
            t.append(", image=");
            t.append(this.image);
            t.append(", clientMessageId=");
            return h.c(t, this.clientMessageId, ')');
        }
    }
}
