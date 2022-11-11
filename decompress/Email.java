// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Email
{
    public static final a<Email, Builder> ADAPTER;
    public final String header_text;
    public final String listing_source;
    public final Boolean post_has_thumbnail;
    public final String preview_text;
    public final String subject_line;
    public final String type;
    
    static {
        ADAPTER = (a)new EmailAdapter(null);
    }
    
    private Email(final Builder builder) {
        this.subject_line = Builder.access$100(builder);
        this.preview_text = Builder.access$200(builder);
        this.type = Builder.access$300(builder);
        this.header_text = Builder.access$400(builder);
        this.post_has_thumbnail = Builder.access$500(builder);
        this.listing_source = Builder.access$600(builder);
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
        if (!(o instanceof Email)) {
            return false;
        }
        final Email email = (Email)o;
        final String subject_line = this.subject_line;
        final String subject_line2 = email.subject_line;
        if (subject_line == subject_line2 || (subject_line != null && subject_line.equals(subject_line2))) {
            final String preview_text = this.preview_text;
            final String preview_text2 = email.preview_text;
            if (preview_text == preview_text2 || (preview_text != null && preview_text.equals(preview_text2))) {
                final String type = this.type;
                final String type2 = email.type;
                if (type == type2 || (type != null && type.equals(type2))) {
                    final String header_text = this.header_text;
                    final String header_text2 = email.header_text;
                    if (header_text == header_text2 || (header_text != null && header_text.equals(header_text2))) {
                        final Boolean post_has_thumbnail = this.post_has_thumbnail;
                        final Boolean post_has_thumbnail2 = email.post_has_thumbnail;
                        if (post_has_thumbnail == post_has_thumbnail2 || (post_has_thumbnail != null && post_has_thumbnail.equals(post_has_thumbnail2))) {
                            final String listing_source = this.listing_source;
                            final String listing_source2 = email.listing_source;
                            boolean b2 = b;
                            if (listing_source == listing_source2) {
                                return b2;
                            }
                            if (listing_source != null && listing_source.equals(listing_source2)) {
                                b2 = b;
                                return b2;
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
        final String subject_line = this.subject_line;
        int hashCode = 0;
        int hashCode2;
        if (subject_line == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = subject_line.hashCode();
        }
        final String preview_text = this.preview_text;
        int hashCode3;
        if (preview_text == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = preview_text.hashCode();
        }
        final String type = this.type;
        int hashCode4;
        if (type == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = type.hashCode();
        }
        final String header_text = this.header_text;
        int hashCode5;
        if (header_text == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = header_text.hashCode();
        }
        final Boolean post_has_thumbnail = this.post_has_thumbnail;
        int hashCode6;
        if (post_has_thumbnail == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = post_has_thumbnail.hashCode();
        }
        final String listing_source = this.listing_source;
        if (listing_source != null) {
            hashCode = listing_source.hashCode();
        }
        return ((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Email{subject_line=");
        k.append(this.subject_line);
        k.append(", preview_text=");
        k.append(this.preview_text);
        k.append(", type=");
        k.append(this.type);
        k.append(", header_text=");
        k.append(this.header_text);
        k.append(", post_has_thumbnail=");
        k.append(this.post_has_thumbnail);
        k.append(", listing_source=");
        return b.j(k, this.listing_source, "}");
    }
    
    public void write(final e e) throws IOException {
        Email.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Email>
    {
        private String header_text;
        private String listing_source;
        private Boolean post_has_thumbnail;
        private String preview_text;
        private String subject_line;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final Email email) {
            this.subject_line = email.subject_line;
            this.preview_text = email.preview_text;
            this.type = email.type;
            this.header_text = email.header_text;
            this.post_has_thumbnail = email.post_has_thumbnail;
            this.listing_source = email.listing_source;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.subject_line;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.preview_text;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.type;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.header_text;
        }
        
        public static /* synthetic */ Boolean access$500(final Builder builder) {
            return builder.post_has_thumbnail;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.listing_source;
        }
        
        public Email build() {
            return new Email(this, null);
        }
        
        public Builder header_text(final String header_text) {
            this.header_text = header_text;
            return this;
        }
        
        public Builder listing_source(final String listing_source) {
            this.listing_source = listing_source;
            return this;
        }
        
        public Builder post_has_thumbnail(final Boolean post_has_thumbnail) {
            this.post_has_thumbnail = post_has_thumbnail;
            return this;
        }
        
        public Builder preview_text(final String preview_text) {
            this.preview_text = preview_text;
            return this;
        }
        
        public void reset() {
            this.subject_line = null;
            this.preview_text = null;
            this.type = null;
            this.header_text = null;
            this.post_has_thumbnail = null;
            this.listing_source = null;
        }
        
        public Builder subject_line(final String subject_line) {
            this.subject_line = subject_line;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class EmailAdapter implements a<Email, Builder>
    {
        private EmailAdapter() {
        }
        
        public Email read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Email read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.listing_source(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 2) {
                            builder.post_has_thumbnail(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.header_text(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.preview_text(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.subject_line(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Email email) throws IOException {
            e.a0();
            if (email.subject_line != null) {
                e.N(1, (byte)11);
                e.Z(email.subject_line);
                e.O();
            }
            if (email.preview_text != null) {
                e.N(2, (byte)11);
                e.Z(email.preview_text);
                e.O();
            }
            if (email.type != null) {
                e.N(3, (byte)11);
                e.Z(email.type);
                e.O();
            }
            if (email.header_text != null) {
                e.N(4, (byte)11);
                e.Z(email.header_text);
                e.O();
            }
            if (email.post_has_thumbnail != null) {
                e.N(5, (byte)2);
                d.z(email.post_has_thumbnail, e);
            }
            if (email.listing_source != null) {
                e.N(6, (byte)11);
                e.Z(email.listing_source);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
