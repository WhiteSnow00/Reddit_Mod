// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import ft.c;
import b5.k;
import java.util.ArrayList;
import et.b;
import java.io.IOException;
import ft.e;
import java.util.Collections;
import java.util.List;
import et.a;

public final class NCMECReport
{
    public static final a<NCMECReport, Builder> ADAPTER;
    public final String account_added_note;
    public final Long account_created_timestamp;
    public final Boolean account_registration_proxy;
    public final String classification_type;
    public final Boolean content_is_reddit_hosted;
    public final Boolean content_publicly_available;
    public final String content_url;
    public final Boolean email_verified;
    public final Long email_verified_timestamp;
    public final Boolean file_viewed_by_admin;
    public final String filename;
    public final List<String> gallery_images_reported;
    public final Integer id;
    public final Boolean is_gallery;
    public final Boolean is_live_stream;
    public final String permalink;
    public final String post_added_note;
    public final Long post_created_timestamp;
    public final String post_id;
    public final Boolean post_possible_proxy;
    public final String report_added_note;
    public final String user_id;
    
    static {
        ADAPTER = (a)new NCMECReportAdapter(null);
    }
    
    private NCMECReport(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.classification_type = Builder.access$200(builder);
        this.post_id = Builder.access$300(builder);
        this.file_viewed_by_admin = Builder.access$400(builder);
        this.user_id = Builder.access$500(builder);
        this.email_verified = Builder.access$600(builder);
        this.email_verified_timestamp = Builder.access$700(builder);
        this.account_created_timestamp = Builder.access$800(builder);
        this.account_registration_proxy = Builder.access$900(builder);
        this.account_added_note = Builder.access$1000(builder);
        this.permalink = Builder.access$1100(builder);
        this.content_url = Builder.access$1200(builder);
        this.content_is_reddit_hosted = Builder.access$1300(builder);
        this.post_created_timestamp = Builder.access$1400(builder);
        this.post_possible_proxy = Builder.access$1500(builder);
        this.filename = Builder.access$1600(builder);
        this.content_publicly_available = Builder.access$1700(builder);
        this.report_added_note = Builder.access$1800(builder);
        this.post_added_note = Builder.access$1900(builder);
        this.is_live_stream = Builder.access$2000(builder);
        this.is_gallery = Builder.access$2100(builder);
        List<String> unmodifiableList;
        if (Builder.access$2200(builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$2200(builder));
        }
        this.gallery_images_reported = unmodifiableList;
    }
    
    public NCMECReport(final Builder builder, final NCMECReport$1 object) {
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
        if (!(o instanceof NCMECReport)) {
            return false;
        }
        final NCMECReport ncmecReport = (NCMECReport)o;
        final Integer id = this.id;
        final Integer id2 = ncmecReport.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String classification_type = this.classification_type;
            final String classification_type2 = ncmecReport.classification_type;
            if (classification_type == classification_type2 || (classification_type != null && classification_type.equals(classification_type2))) {
                final String post_id = this.post_id;
                final String post_id2 = ncmecReport.post_id;
                if (post_id == post_id2 || (post_id != null && post_id.equals(post_id2))) {
                    final Boolean file_viewed_by_admin = this.file_viewed_by_admin;
                    final Boolean file_viewed_by_admin2 = ncmecReport.file_viewed_by_admin;
                    if (file_viewed_by_admin == file_viewed_by_admin2 || (file_viewed_by_admin != null && file_viewed_by_admin.equals(file_viewed_by_admin2))) {
                        final String user_id = this.user_id;
                        final String user_id2 = ncmecReport.user_id;
                        if (user_id == user_id2 || (user_id != null && user_id.equals(user_id2))) {
                            final Boolean email_verified = this.email_verified;
                            final Boolean email_verified2 = ncmecReport.email_verified;
                            if (email_verified == email_verified2 || (email_verified != null && email_verified.equals(email_verified2))) {
                                final Long email_verified_timestamp = this.email_verified_timestamp;
                                final Long email_verified_timestamp2 = ncmecReport.email_verified_timestamp;
                                if (email_verified_timestamp == email_verified_timestamp2 || (email_verified_timestamp != null && email_verified_timestamp.equals(email_verified_timestamp2))) {
                                    final Long account_created_timestamp = this.account_created_timestamp;
                                    final Long account_created_timestamp2 = ncmecReport.account_created_timestamp;
                                    if (account_created_timestamp == account_created_timestamp2 || (account_created_timestamp != null && account_created_timestamp.equals(account_created_timestamp2))) {
                                        final Boolean account_registration_proxy = this.account_registration_proxy;
                                        final Boolean account_registration_proxy2 = ncmecReport.account_registration_proxy;
                                        if (account_registration_proxy == account_registration_proxy2 || (account_registration_proxy != null && account_registration_proxy.equals(account_registration_proxy2))) {
                                            final String account_added_note = this.account_added_note;
                                            final String account_added_note2 = ncmecReport.account_added_note;
                                            if (account_added_note == account_added_note2 || (account_added_note != null && account_added_note.equals(account_added_note2))) {
                                                final String permalink = this.permalink;
                                                final String permalink2 = ncmecReport.permalink;
                                                if (permalink == permalink2 || (permalink != null && permalink.equals(permalink2))) {
                                                    final String content_url = this.content_url;
                                                    final String content_url2 = ncmecReport.content_url;
                                                    if (content_url == content_url2 || (content_url != null && content_url.equals(content_url2))) {
                                                        final Boolean content_is_reddit_hosted = this.content_is_reddit_hosted;
                                                        final Boolean content_is_reddit_hosted2 = ncmecReport.content_is_reddit_hosted;
                                                        if (content_is_reddit_hosted == content_is_reddit_hosted2 || (content_is_reddit_hosted != null && content_is_reddit_hosted.equals(content_is_reddit_hosted2))) {
                                                            final Long post_created_timestamp = this.post_created_timestamp;
                                                            final Long post_created_timestamp2 = ncmecReport.post_created_timestamp;
                                                            if (post_created_timestamp == post_created_timestamp2 || (post_created_timestamp != null && post_created_timestamp.equals(post_created_timestamp2))) {
                                                                final Boolean post_possible_proxy = this.post_possible_proxy;
                                                                final Boolean post_possible_proxy2 = ncmecReport.post_possible_proxy;
                                                                if (post_possible_proxy == post_possible_proxy2 || (post_possible_proxy != null && post_possible_proxy.equals(post_possible_proxy2))) {
                                                                    final String filename = this.filename;
                                                                    final String filename2 = ncmecReport.filename;
                                                                    if (filename == filename2 || (filename != null && filename.equals(filename2))) {
                                                                        final Boolean content_publicly_available = this.content_publicly_available;
                                                                        final Boolean content_publicly_available2 = ncmecReport.content_publicly_available;
                                                                        if (content_publicly_available == content_publicly_available2 || (content_publicly_available != null && content_publicly_available.equals(content_publicly_available2))) {
                                                                            final String report_added_note = this.report_added_note;
                                                                            final String report_added_note2 = ncmecReport.report_added_note;
                                                                            if (report_added_note == report_added_note2 || (report_added_note != null && report_added_note.equals(report_added_note2))) {
                                                                                final String post_added_note = this.post_added_note;
                                                                                final String post_added_note2 = ncmecReport.post_added_note;
                                                                                if (post_added_note == post_added_note2 || (post_added_note != null && post_added_note.equals(post_added_note2))) {
                                                                                    final Boolean is_live_stream = this.is_live_stream;
                                                                                    final Boolean is_live_stream2 = ncmecReport.is_live_stream;
                                                                                    if (is_live_stream == is_live_stream2 || (is_live_stream != null && is_live_stream.equals(is_live_stream2))) {
                                                                                        final Boolean is_gallery = this.is_gallery;
                                                                                        final Boolean is_gallery2 = ncmecReport.is_gallery;
                                                                                        if (is_gallery == is_gallery2 || (is_gallery != null && is_gallery.equals(is_gallery2))) {
                                                                                            final List<String> gallery_images_reported = this.gallery_images_reported;
                                                                                            final List<String> gallery_images_reported2 = ncmecReport.gallery_images_reported;
                                                                                            boolean b2 = b;
                                                                                            if (gallery_images_reported == gallery_images_reported2) {
                                                                                                return b2;
                                                                                            }
                                                                                            if (gallery_images_reported != null && gallery_images_reported.equals(gallery_images_reported2)) {
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
        final Integer id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String classification_type = this.classification_type;
        int hashCode3;
        if (classification_type == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = classification_type.hashCode();
        }
        final String post_id = this.post_id;
        int hashCode4;
        if (post_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = post_id.hashCode();
        }
        final Boolean file_viewed_by_admin = this.file_viewed_by_admin;
        int hashCode5;
        if (file_viewed_by_admin == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = file_viewed_by_admin.hashCode();
        }
        final String user_id = this.user_id;
        int hashCode6;
        if (user_id == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = user_id.hashCode();
        }
        final Boolean email_verified = this.email_verified;
        int hashCode7;
        if (email_verified == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = email_verified.hashCode();
        }
        final Long email_verified_timestamp = this.email_verified_timestamp;
        int hashCode8;
        if (email_verified_timestamp == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = email_verified_timestamp.hashCode();
        }
        final Long account_created_timestamp = this.account_created_timestamp;
        int hashCode9;
        if (account_created_timestamp == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = account_created_timestamp.hashCode();
        }
        final Boolean account_registration_proxy = this.account_registration_proxy;
        int hashCode10;
        if (account_registration_proxy == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = account_registration_proxy.hashCode();
        }
        final String account_added_note = this.account_added_note;
        int hashCode11;
        if (account_added_note == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = account_added_note.hashCode();
        }
        final String permalink = this.permalink;
        int hashCode12;
        if (permalink == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = permalink.hashCode();
        }
        final String content_url = this.content_url;
        int hashCode13;
        if (content_url == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = content_url.hashCode();
        }
        final Boolean content_is_reddit_hosted = this.content_is_reddit_hosted;
        int hashCode14;
        if (content_is_reddit_hosted == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = content_is_reddit_hosted.hashCode();
        }
        final Long post_created_timestamp = this.post_created_timestamp;
        int hashCode15;
        if (post_created_timestamp == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = post_created_timestamp.hashCode();
        }
        final Boolean post_possible_proxy = this.post_possible_proxy;
        int hashCode16;
        if (post_possible_proxy == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = post_possible_proxy.hashCode();
        }
        final String filename = this.filename;
        int hashCode17;
        if (filename == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = filename.hashCode();
        }
        final Boolean content_publicly_available = this.content_publicly_available;
        int hashCode18;
        if (content_publicly_available == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = content_publicly_available.hashCode();
        }
        final String report_added_note = this.report_added_note;
        int hashCode19;
        if (report_added_note == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = report_added_note.hashCode();
        }
        final String post_added_note = this.post_added_note;
        int hashCode20;
        if (post_added_note == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = post_added_note.hashCode();
        }
        final Boolean is_live_stream = this.is_live_stream;
        int hashCode21;
        if (is_live_stream == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = is_live_stream.hashCode();
        }
        final Boolean is_gallery = this.is_gallery;
        int hashCode22;
        if (is_gallery == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = is_gallery.hashCode();
        }
        final List<String> gallery_images_reported = this.gallery_images_reported;
        if (gallery_images_reported != null) {
            hashCode = gallery_images_reported.hashCode();
        }
        return ((((((((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode18) * -2128831035 ^ hashCode19) * -2128831035 ^ hashCode20) * -2128831035 ^ hashCode21) * -2128831035 ^ hashCode22) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("NCMECReport{id=");
        t.append(this.id);
        t.append(", classification_type=");
        t.append(this.classification_type);
        t.append(", post_id=");
        t.append(this.post_id);
        t.append(", file_viewed_by_admin=");
        t.append(this.file_viewed_by_admin);
        t.append(", user_id=");
        t.append(this.user_id);
        t.append(", email_verified=");
        t.append(this.email_verified);
        t.append(", email_verified_timestamp=");
        t.append(this.email_verified_timestamp);
        t.append(", account_created_timestamp=");
        t.append(this.account_created_timestamp);
        t.append(", account_registration_proxy=");
        t.append(this.account_registration_proxy);
        t.append(", account_added_note=");
        t.append(this.account_added_note);
        t.append(", permalink=");
        t.append(this.permalink);
        t.append(", content_url=");
        t.append(this.content_url);
        t.append(", content_is_reddit_hosted=");
        t.append(this.content_is_reddit_hosted);
        t.append(", post_created_timestamp=");
        t.append(this.post_created_timestamp);
        t.append(", post_possible_proxy=");
        t.append(this.post_possible_proxy);
        t.append(", filename=");
        t.append(this.filename);
        t.append(", content_publicly_available=");
        t.append(this.content_publicly_available);
        t.append(", report_added_note=");
        t.append(this.report_added_note);
        t.append(", post_added_note=");
        t.append(this.post_added_note);
        t.append(", is_live_stream=");
        t.append(this.is_live_stream);
        t.append(", is_gallery=");
        t.append(this.is_gallery);
        t.append(", gallery_images_reported=");
        return a.s(t, (List)this.gallery_images_reported, "}");
    }
    
    public void write(final e e) throws IOException {
        NCMECReport.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<NCMECReport>
    {
        private String account_added_note;
        private Long account_created_timestamp;
        private Boolean account_registration_proxy;
        private String classification_type;
        private Boolean content_is_reddit_hosted;
        private Boolean content_publicly_available;
        private String content_url;
        private Boolean email_verified;
        private Long email_verified_timestamp;
        private Boolean file_viewed_by_admin;
        private String filename;
        private List<String> gallery_images_reported;
        private Integer id;
        private Boolean is_gallery;
        private Boolean is_live_stream;
        private String permalink;
        private String post_added_note;
        private Long post_created_timestamp;
        private String post_id;
        private Boolean post_possible_proxy;
        private String report_added_note;
        private String user_id;
        
        public Builder() {
        }
        
        public Builder(final NCMECReport ncmecReport) {
            this.id = ncmecReport.id;
            this.classification_type = ncmecReport.classification_type;
            this.post_id = ncmecReport.post_id;
            this.file_viewed_by_admin = ncmecReport.file_viewed_by_admin;
            this.user_id = ncmecReport.user_id;
            this.email_verified = ncmecReport.email_verified;
            this.email_verified_timestamp = ncmecReport.email_verified_timestamp;
            this.account_created_timestamp = ncmecReport.account_created_timestamp;
            this.account_registration_proxy = ncmecReport.account_registration_proxy;
            this.account_added_note = ncmecReport.account_added_note;
            this.permalink = ncmecReport.permalink;
            this.content_url = ncmecReport.content_url;
            this.content_is_reddit_hosted = ncmecReport.content_is_reddit_hosted;
            this.post_created_timestamp = ncmecReport.post_created_timestamp;
            this.post_possible_proxy = ncmecReport.post_possible_proxy;
            this.filename = ncmecReport.filename;
            this.content_publicly_available = ncmecReport.content_publicly_available;
            this.report_added_note = ncmecReport.report_added_note;
            this.post_added_note = ncmecReport.post_added_note;
            this.is_live_stream = ncmecReport.is_live_stream;
            this.is_gallery = ncmecReport.is_gallery;
            this.gallery_images_reported = ncmecReport.gallery_images_reported;
        }
        
        public static Integer access$100(final Builder builder) {
            return builder.id;
        }
        
        public static String access$1000(final Builder builder) {
            return builder.account_added_note;
        }
        
        public static String access$1100(final Builder builder) {
            return builder.permalink;
        }
        
        public static String access$1200(final Builder builder) {
            return builder.content_url;
        }
        
        public static Boolean access$1300(final Builder builder) {
            return builder.content_is_reddit_hosted;
        }
        
        public static Long access$1400(final Builder builder) {
            return builder.post_created_timestamp;
        }
        
        public static Boolean access$1500(final Builder builder) {
            return builder.post_possible_proxy;
        }
        
        public static String access$1600(final Builder builder) {
            return builder.filename;
        }
        
        public static Boolean access$1700(final Builder builder) {
            return builder.content_publicly_available;
        }
        
        public static String access$1800(final Builder builder) {
            return builder.report_added_note;
        }
        
        public static String access$1900(final Builder builder) {
            return builder.post_added_note;
        }
        
        public static String access$200(final Builder builder) {
            return builder.classification_type;
        }
        
        public static Boolean access$2000(final Builder builder) {
            return builder.is_live_stream;
        }
        
        public static Boolean access$2100(final Builder builder) {
            return builder.is_gallery;
        }
        
        public static List access$2200(final Builder builder) {
            return builder.gallery_images_reported;
        }
        
        public static String access$300(final Builder builder) {
            return builder.post_id;
        }
        
        public static Boolean access$400(final Builder builder) {
            return builder.file_viewed_by_admin;
        }
        
        public static String access$500(final Builder builder) {
            return builder.user_id;
        }
        
        public static Boolean access$600(final Builder builder) {
            return builder.email_verified;
        }
        
        public static Long access$700(final Builder builder) {
            return builder.email_verified_timestamp;
        }
        
        public static Long access$800(final Builder builder) {
            return builder.account_created_timestamp;
        }
        
        public static Boolean access$900(final Builder builder) {
            return builder.account_registration_proxy;
        }
        
        public Builder account_added_note(final String account_added_note) {
            this.account_added_note = account_added_note;
            return this;
        }
        
        public Builder account_created_timestamp(final Long account_created_timestamp) {
            this.account_created_timestamp = account_created_timestamp;
            return this;
        }
        
        public Builder account_registration_proxy(final Boolean account_registration_proxy) {
            this.account_registration_proxy = account_registration_proxy;
            return this;
        }
        
        public NCMECReport build() {
            return new NCMECReport(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder classification_type(final String classification_type) {
            this.classification_type = classification_type;
            return this;
        }
        
        public Builder content_is_reddit_hosted(final Boolean content_is_reddit_hosted) {
            this.content_is_reddit_hosted = content_is_reddit_hosted;
            return this;
        }
        
        public Builder content_publicly_available(final Boolean content_publicly_available) {
            this.content_publicly_available = content_publicly_available;
            return this;
        }
        
        public Builder content_url(final String content_url) {
            this.content_url = content_url;
            return this;
        }
        
        public Builder email_verified(final Boolean email_verified) {
            this.email_verified = email_verified;
            return this;
        }
        
        public Builder email_verified_timestamp(final Long email_verified_timestamp) {
            this.email_verified_timestamp = email_verified_timestamp;
            return this;
        }
        
        public Builder file_viewed_by_admin(final Boolean file_viewed_by_admin) {
            this.file_viewed_by_admin = file_viewed_by_admin;
            return this;
        }
        
        public Builder filename(final String filename) {
            this.filename = filename;
            return this;
        }
        
        public Builder gallery_images_reported(final List<String> gallery_images_reported) {
            this.gallery_images_reported = gallery_images_reported;
            return this;
        }
        
        public Builder id(final Integer id) {
            this.id = id;
            return this;
        }
        
        public Builder is_gallery(final Boolean is_gallery) {
            this.is_gallery = is_gallery;
            return this;
        }
        
        public Builder is_live_stream(final Boolean is_live_stream) {
            this.is_live_stream = is_live_stream;
            return this;
        }
        
        public Builder permalink(final String permalink) {
            this.permalink = permalink;
            return this;
        }
        
        public Builder post_added_note(final String post_added_note) {
            this.post_added_note = post_added_note;
            return this;
        }
        
        public Builder post_created_timestamp(final Long post_created_timestamp) {
            this.post_created_timestamp = post_created_timestamp;
            return this;
        }
        
        public Builder post_id(final String post_id) {
            this.post_id = post_id;
            return this;
        }
        
        public Builder post_possible_proxy(final Boolean post_possible_proxy) {
            this.post_possible_proxy = post_possible_proxy;
            return this;
        }
        
        public Builder report_added_note(final String report_added_note) {
            this.report_added_note = report_added_note;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.classification_type = null;
            this.post_id = null;
            this.file_viewed_by_admin = null;
            this.user_id = null;
            this.email_verified = null;
            this.email_verified_timestamp = null;
            this.account_created_timestamp = null;
            this.account_registration_proxy = null;
            this.account_added_note = null;
            this.permalink = null;
            this.content_url = null;
            this.content_is_reddit_hosted = null;
            this.post_created_timestamp = null;
            this.post_possible_proxy = null;
            this.filename = null;
            this.content_publicly_available = null;
            this.report_added_note = null;
            this.post_added_note = null;
            this.is_live_stream = null;
            this.is_gallery = null;
            this.gallery_images_reported = null;
        }
        
        public Builder user_id(final String user_id) {
            this.user_id = user_id;
            return this;
        }
    }
    
    public static final class NCMECReportAdapter implements a<NCMECReport, Builder>
    {
        private NCMECReportAdapter() {
        }
        
        public NCMECReportAdapter(final NCMECReport$1 object) {
            this();
        }
        
        public NCMECReport read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public NCMECReport read(final e e, final Builder builder) throws IOException {
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
                    case 22: {
                        if (a == 15) {
                            final c w = e.w();
                            final ArrayList list = new ArrayList(w.b);
                            for (int i = 0; i < w.b; i = k.f(e, list, i, 1)) {}
                            e.x();
                            builder.gallery_images_reported((List<String>)list);
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 21: {
                        if (a == 2) {
                            builder.is_gallery(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 20: {
                        if (a == 2) {
                            builder.is_live_stream(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 19: {
                        if (a == 11) {
                            builder.post_added_note(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 18: {
                        if (a == 11) {
                            builder.report_added_note(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 17: {
                        if (a == 2) {
                            builder.content_publicly_available(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 16: {
                        if (a == 11) {
                            builder.filename(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 15: {
                        if (a == 2) {
                            builder.post_possible_proxy(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 14: {
                        if (a == 10) {
                            builder.post_created_timestamp(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 2) {
                            builder.content_is_reddit_hosted(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 11) {
                            builder.content_url(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 11) {
                            builder.permalink(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 11) {
                            builder.account_added_note(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 2) {
                            builder.account_registration_proxy(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 10) {
                            builder.account_created_timestamp(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 10) {
                            builder.email_verified_timestamp(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 2) {
                            builder.email_verified(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.user_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 2) {
                            builder.file_viewed_by_admin(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.post_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.classification_type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 8) {
                            builder.id(e.t());
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
        
        public void write(final e e, final NCMECReport ncmecReport) throws IOException {
            e.X();
            if (ncmecReport.id != null) {
                e.O(1, (byte)8);
                aq2.a.x(ncmecReport.id, e);
            }
            if (ncmecReport.classification_type != null) {
                e.O(2, (byte)11);
                e.W(ncmecReport.classification_type);
                e.P();
            }
            if (ncmecReport.post_id != null) {
                e.O(3, (byte)11);
                e.W(ncmecReport.post_id);
                e.P();
            }
            if (ncmecReport.file_viewed_by_admin != null) {
                e.O(4, (byte)2);
                android.support.v4.media.a.A(ncmecReport.file_viewed_by_admin, e);
            }
            if (ncmecReport.user_id != null) {
                e.O(5, (byte)11);
                e.W(ncmecReport.user_id);
                e.P();
            }
            if (ncmecReport.email_verified != null) {
                e.O(6, (byte)2);
                android.support.v4.media.a.A(ncmecReport.email_verified, e);
            }
            if (ncmecReport.email_verified_timestamp != null) {
                e.O(7, (byte)10);
                k.w(ncmecReport.email_verified_timestamp, e);
            }
            if (ncmecReport.account_created_timestamp != null) {
                e.O(8, (byte)10);
                k.w(ncmecReport.account_created_timestamp, e);
            }
            if (ncmecReport.account_registration_proxy != null) {
                e.O(9, (byte)2);
                android.support.v4.media.a.A(ncmecReport.account_registration_proxy, e);
            }
            if (ncmecReport.account_added_note != null) {
                e.O(10, (byte)11);
                e.W(ncmecReport.account_added_note);
                e.P();
            }
            if (ncmecReport.permalink != null) {
                e.O(11, (byte)11);
                e.W(ncmecReport.permalink);
                e.P();
            }
            if (ncmecReport.content_url != null) {
                e.O(12, (byte)11);
                e.W(ncmecReport.content_url);
                e.P();
            }
            if (ncmecReport.content_is_reddit_hosted != null) {
                e.O(13, (byte)2);
                android.support.v4.media.a.A(ncmecReport.content_is_reddit_hosted, e);
            }
            if (ncmecReport.post_created_timestamp != null) {
                e.O(14, (byte)10);
                k.w(ncmecReport.post_created_timestamp, e);
            }
            if (ncmecReport.post_possible_proxy != null) {
                e.O(15, (byte)2);
                android.support.v4.media.a.A(ncmecReport.post_possible_proxy, e);
            }
            if (ncmecReport.filename != null) {
                e.O(16, (byte)11);
                e.W(ncmecReport.filename);
                e.P();
            }
            if (ncmecReport.content_publicly_available != null) {
                e.O(17, (byte)2);
                android.support.v4.media.a.A(ncmecReport.content_publicly_available, e);
            }
            if (ncmecReport.report_added_note != null) {
                e.O(18, (byte)11);
                e.W(ncmecReport.report_added_note);
                e.P();
            }
            if (ncmecReport.post_added_note != null) {
                e.O(19, (byte)11);
                e.W(ncmecReport.post_added_note);
                e.P();
            }
            if (ncmecReport.is_live_stream != null) {
                e.O(20, (byte)2);
                android.support.v4.media.a.A(ncmecReport.is_live_stream, e);
            }
            if (ncmecReport.is_gallery != null) {
                e.O(21, (byte)2);
                android.support.v4.media.a.A(ncmecReport.is_gallery, e);
            }
            if (ncmecReport.gallery_images_reported != null) {
                e.O(22, (byte)15);
                e.U((byte)11, ncmecReport.gallery_images_reported.size());
                final Iterator<String> iterator = ncmecReport.gallery_images_reported.iterator();
                while (iterator.hasNext()) {
                    e.W((String)iterator.next());
                }
                e.V();
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (NCMECReport)o);
        }
    }
}
