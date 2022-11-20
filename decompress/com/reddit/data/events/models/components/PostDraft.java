// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import b5.k;
import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class PostDraft
{
    public static final a<PostDraft, Builder> ADAPTER;
    public final String author_id;
    public final Integer body_text_length;
    public final Long created_timestamp;
    public final String flair;
    public final String id;
    public final Boolean nsfw;
    public final Integer number_rte_images;
    public final Integer number_rte_videos;
    public final Boolean original_content;
    public final Boolean spoiler;
    public final Integer title_length;
    public final String type;
    public final Integer url_length;
    
    static {
        ADAPTER = (a)new PostDraftAdapter(null);
    }
    
    private PostDraft(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.type = Builder.access$200(builder);
        this.author_id = Builder.access$300(builder);
        this.created_timestamp = Builder.access$400(builder);
        this.title_length = Builder.access$500(builder);
        this.url_length = Builder.access$600(builder);
        this.body_text_length = Builder.access$700(builder);
        this.nsfw = Builder.access$800(builder);
        this.spoiler = Builder.access$900(builder);
        this.original_content = Builder.access$1000(builder);
        this.flair = Builder.access$1100(builder);
        this.number_rte_images = Builder.access$1200(builder);
        this.number_rte_videos = Builder.access$1300(builder);
    }
    
    public PostDraft(final Builder builder, final PostDraft$1 object) {
        this(builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof PostDraft)) {
            return false;
        }
        final PostDraft postDraft = (PostDraft)o;
        final String id = this.id;
        final String id2 = postDraft.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String type = this.type;
            final String type2 = postDraft.type;
            if (type == type2 || (type != null && type.equals(type2))) {
                final String author_id = this.author_id;
                final String author_id2 = postDraft.author_id;
                if (author_id == author_id2 || (author_id != null && author_id.equals(author_id2))) {
                    final Long created_timestamp = this.created_timestamp;
                    final Long created_timestamp2 = postDraft.created_timestamp;
                    if (created_timestamp == created_timestamp2 || (created_timestamp != null && created_timestamp.equals(created_timestamp2))) {
                        final Integer title_length = this.title_length;
                        final Integer title_length2 = postDraft.title_length;
                        if (title_length == title_length2 || (title_length != null && title_length.equals(title_length2))) {
                            final Integer url_length = this.url_length;
                            final Integer url_length2 = postDraft.url_length;
                            if (url_length == url_length2 || (url_length != null && url_length.equals(url_length2))) {
                                final Integer body_text_length = this.body_text_length;
                                final Integer body_text_length2 = postDraft.body_text_length;
                                if (body_text_length == body_text_length2 || (body_text_length != null && body_text_length.equals(body_text_length2))) {
                                    final Boolean nsfw = this.nsfw;
                                    final Boolean nsfw2 = postDraft.nsfw;
                                    if (nsfw == nsfw2 || (nsfw != null && nsfw.equals(nsfw2))) {
                                        final Boolean spoiler = this.spoiler;
                                        final Boolean spoiler2 = postDraft.spoiler;
                                        if (spoiler == spoiler2 || (spoiler != null && spoiler.equals(spoiler2))) {
                                            final Boolean original_content = this.original_content;
                                            final Boolean original_content2 = postDraft.original_content;
                                            if (original_content == original_content2 || (original_content != null && original_content.equals(original_content2))) {
                                                final String flair = this.flair;
                                                final String flair2 = postDraft.flair;
                                                if (flair == flair2 || (flair != null && flair.equals(flair2))) {
                                                    final Integer number_rte_images = this.number_rte_images;
                                                    final Integer number_rte_images2 = postDraft.number_rte_images;
                                                    if (number_rte_images == number_rte_images2 || (number_rte_images != null && number_rte_images.equals(number_rte_images2))) {
                                                        final Integer number_rte_videos = this.number_rte_videos;
                                                        final Integer number_rte_videos2 = postDraft.number_rte_videos;
                                                        boolean b2 = b;
                                                        if (number_rte_videos == number_rte_videos2) {
                                                            return b2;
                                                        }
                                                        if (number_rte_videos != null && number_rte_videos.equals(number_rte_videos2)) {
                                                            b2 = b;
                                                            return b2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
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
        final String type = this.type;
        int hashCode3;
        if (type == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = type.hashCode();
        }
        final String author_id = this.author_id;
        int hashCode4;
        if (author_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = author_id.hashCode();
        }
        final Long created_timestamp = this.created_timestamp;
        int hashCode5;
        if (created_timestamp == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = created_timestamp.hashCode();
        }
        final Integer title_length = this.title_length;
        int hashCode6;
        if (title_length == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = title_length.hashCode();
        }
        final Integer url_length = this.url_length;
        int hashCode7;
        if (url_length == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = url_length.hashCode();
        }
        final Integer body_text_length = this.body_text_length;
        int hashCode8;
        if (body_text_length == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = body_text_length.hashCode();
        }
        final Boolean nsfw = this.nsfw;
        int hashCode9;
        if (nsfw == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = nsfw.hashCode();
        }
        final Boolean spoiler = this.spoiler;
        int hashCode10;
        if (spoiler == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = spoiler.hashCode();
        }
        final Boolean original_content = this.original_content;
        int hashCode11;
        if (original_content == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = original_content.hashCode();
        }
        final String flair = this.flair;
        int hashCode12;
        if (flair == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = flair.hashCode();
        }
        final Integer number_rte_images = this.number_rte_images;
        int hashCode13;
        if (number_rte_images == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = number_rte_images.hashCode();
        }
        final Integer number_rte_videos = this.number_rte_videos;
        if (number_rte_videos != null) {
            hashCode = number_rte_videos.hashCode();
        }
        return (((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("PostDraft{id=");
        t.append(this.id);
        t.append(", type=");
        t.append(this.type);
        t.append(", author_id=");
        t.append(this.author_id);
        t.append(", created_timestamp=");
        t.append(this.created_timestamp);
        t.append(", title_length=");
        t.append(this.title_length);
        t.append(", url_length=");
        t.append(this.url_length);
        t.append(", body_text_length=");
        t.append(this.body_text_length);
        t.append(", nsfw=");
        t.append(this.nsfw);
        t.append(", spoiler=");
        t.append(this.spoiler);
        t.append(", original_content=");
        t.append(this.original_content);
        t.append(", flair=");
        t.append(this.flair);
        t.append(", number_rte_images=");
        t.append(this.number_rte_images);
        t.append(", number_rte_videos=");
        t.append(this.number_rte_videos);
        t.append("}");
        return t.toString();
    }
    
    public void write(final e e) throws IOException {
        PostDraft.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<PostDraft>
    {
        private String author_id;
        private Integer body_text_length;
        private Long created_timestamp;
        private String flair;
        private String id;
        private Boolean nsfw;
        private Integer number_rte_images;
        private Integer number_rte_videos;
        private Boolean original_content;
        private Boolean spoiler;
        private Integer title_length;
        private String type;
        private Integer url_length;
        
        public Builder() {
        }
        
        public Builder(final PostDraft postDraft) {
            this.id = postDraft.id;
            this.type = postDraft.type;
            this.author_id = postDraft.author_id;
            this.created_timestamp = postDraft.created_timestamp;
            this.title_length = postDraft.title_length;
            this.url_length = postDraft.url_length;
            this.body_text_length = postDraft.body_text_length;
            this.nsfw = postDraft.nsfw;
            this.spoiler = postDraft.spoiler;
            this.original_content = postDraft.original_content;
            this.flair = postDraft.flair;
            this.number_rte_images = postDraft.number_rte_images;
            this.number_rte_videos = postDraft.number_rte_videos;
        }
        
        public static String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static Boolean access$1000(final Builder builder) {
            return builder.original_content;
        }
        
        public static String access$1100(final Builder builder) {
            return builder.flair;
        }
        
        public static Integer access$1200(final Builder builder) {
            return builder.number_rte_images;
        }
        
        public static Integer access$1300(final Builder builder) {
            return builder.number_rte_videos;
        }
        
        public static String access$200(final Builder builder) {
            return builder.type;
        }
        
        public static String access$300(final Builder builder) {
            return builder.author_id;
        }
        
        public static Long access$400(final Builder builder) {
            return builder.created_timestamp;
        }
        
        public static Integer access$500(final Builder builder) {
            return builder.title_length;
        }
        
        public static Integer access$600(final Builder builder) {
            return builder.url_length;
        }
        
        public static Integer access$700(final Builder builder) {
            return builder.body_text_length;
        }
        
        public static Boolean access$800(final Builder builder) {
            return builder.nsfw;
        }
        
        public static Boolean access$900(final Builder builder) {
            return builder.spoiler;
        }
        
        public Builder author_id(final String author_id) {
            this.author_id = author_id;
            return this;
        }
        
        public Builder body_text_length(final Integer body_text_length) {
            this.body_text_length = body_text_length;
            return this;
        }
        
        public PostDraft build() {
            return new PostDraft(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder created_timestamp(final Long created_timestamp) {
            this.created_timestamp = created_timestamp;
            return this;
        }
        
        public Builder flair(final String flair) {
            this.flair = flair;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder nsfw(final Boolean nsfw) {
            this.nsfw = nsfw;
            return this;
        }
        
        public Builder number_rte_images(final Integer number_rte_images) {
            this.number_rte_images = number_rte_images;
            return this;
        }
        
        public Builder number_rte_videos(final Integer number_rte_videos) {
            this.number_rte_videos = number_rte_videos;
            return this;
        }
        
        public Builder original_content(final Boolean original_content) {
            this.original_content = original_content;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.type = null;
            this.author_id = null;
            this.created_timestamp = null;
            this.title_length = null;
            this.url_length = null;
            this.body_text_length = null;
            this.nsfw = null;
            this.spoiler = null;
            this.original_content = null;
            this.flair = null;
            this.number_rte_images = null;
            this.number_rte_videos = null;
        }
        
        public Builder spoiler(final Boolean spoiler) {
            this.spoiler = spoiler;
            return this;
        }
        
        public Builder title_length(final Integer title_length) {
            this.title_length = title_length;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
        
        public Builder url_length(final Integer url_length) {
            this.url_length = url_length;
            return this;
        }
    }
    
    public static final class PostDraftAdapter implements a<PostDraft, Builder>
    {
        private PostDraftAdapter() {
        }
        
        public PostDraftAdapter(final PostDraft$1 object) {
            this();
        }
        
        public PostDraft read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public PostDraft read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        ht.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 8) {
                            builder.number_rte_videos(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 8) {
                            builder.number_rte_images(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 11) {
                            builder.flair(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 2) {
                            builder.original_content(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 2) {
                            builder.spoiler(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 2) {
                            builder.nsfw(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 8) {
                            builder.body_text_length(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 8) {
                            builder.url_length(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 8) {
                            builder.title_length(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 10) {
                            builder.created_timestamp(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.author_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.I();
            return builder.build();
        }
        
        public /* bridge */ Object read(final e e) throws ThriftException, IOException {
            return this.read(e);
        }
        
        public /* bridge */ Object read(final e e, final b b) throws ThriftException, IOException {
            return this.read(e, (Builder)b);
        }
        
        public void write(final e e, final PostDraft postDraft) throws IOException {
            e.X();
            if (postDraft.id != null) {
                e.O(1, (byte)11);
                e.W(postDraft.id);
                e.P();
            }
            if (postDraft.type != null) {
                e.O(2, (byte)11);
                e.W(postDraft.type);
                e.P();
            }
            if (postDraft.author_id != null) {
                e.O(3, (byte)11);
                e.W(postDraft.author_id);
                e.P();
            }
            if (postDraft.created_timestamp != null) {
                e.O(4, (byte)10);
                k.w(postDraft.created_timestamp, e);
            }
            if (postDraft.title_length != null) {
                e.O(5, (byte)8);
                aq2.a.x(postDraft.title_length, e);
            }
            if (postDraft.url_length != null) {
                e.O(6, (byte)8);
                aq2.a.x(postDraft.url_length, e);
            }
            if (postDraft.body_text_length != null) {
                e.O(7, (byte)8);
                aq2.a.x(postDraft.body_text_length, e);
            }
            if (postDraft.nsfw != null) {
                e.O(8, (byte)2);
                android.support.v4.media.a.A(postDraft.nsfw, e);
            }
            if (postDraft.spoiler != null) {
                e.O(9, (byte)2);
                android.support.v4.media.a.A(postDraft.spoiler, e);
            }
            if (postDraft.original_content != null) {
                e.O(10, (byte)2);
                android.support.v4.media.a.A(postDraft.original_content, e);
            }
            if (postDraft.flair != null) {
                e.O(11, (byte)11);
                e.W(postDraft.flair);
                e.P();
            }
            if (postDraft.number_rte_images != null) {
                e.O(12, (byte)8);
                aq2.a.x(postDraft.number_rte_images, e);
            }
            if (postDraft.number_rte_videos != null) {
                e.O(13, (byte)8);
                aq2.a.x(postDraft.number_rte_videos, e);
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (PostDraft)o);
        }
    }
}
