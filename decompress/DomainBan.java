// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class DomainBan
{
    public static final a<DomainBan, Builder> ADAPTER;
    public final String ban_message;
    public final Boolean disable_approve;
    public final String inspector_exempt_regex;
    public final Boolean markdown;
    public final Boolean no_email;
    public final String regex;
    public final Boolean shame;
    public final String shame_message;
    public final Boolean submit_banned;
    public final String url;
    
    static {
        ADAPTER = (a)new DomainBanAdapter(null);
    }
    
    private DomainBan(final Builder builder) {
        this.url = Builder.access$100(builder);
        this.markdown = Builder.access$200(builder);
        this.no_email = Builder.access$300(builder);
        this.shame = Builder.access$400(builder);
        this.disable_approve = Builder.access$500(builder);
        this.ban_message = Builder.access$600(builder);
        this.shame_message = Builder.access$700(builder);
        this.regex = Builder.access$800(builder);
        this.inspector_exempt_regex = Builder.access$900(builder);
        this.submit_banned = Builder.access$1000(builder);
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
        if (!(o instanceof DomainBan)) {
            return false;
        }
        final DomainBan domainBan = (DomainBan)o;
        final String url = this.url;
        final String url2 = domainBan.url;
        if (url == url2 || (url != null && url.equals(url2))) {
            final Boolean markdown = this.markdown;
            final Boolean markdown2 = domainBan.markdown;
            if (markdown == markdown2 || (markdown != null && markdown.equals(markdown2))) {
                final Boolean no_email = this.no_email;
                final Boolean no_email2 = domainBan.no_email;
                if (no_email == no_email2 || (no_email != null && no_email.equals(no_email2))) {
                    final Boolean shame = this.shame;
                    final Boolean shame2 = domainBan.shame;
                    if (shame == shame2 || (shame != null && shame.equals(shame2))) {
                        final Boolean disable_approve = this.disable_approve;
                        final Boolean disable_approve2 = domainBan.disable_approve;
                        if (disable_approve == disable_approve2 || (disable_approve != null && disable_approve.equals(disable_approve2))) {
                            final String ban_message = this.ban_message;
                            final String ban_message2 = domainBan.ban_message;
                            if (ban_message == ban_message2 || (ban_message != null && ban_message.equals(ban_message2))) {
                                final String shame_message = this.shame_message;
                                final String shame_message2 = domainBan.shame_message;
                                if (shame_message == shame_message2 || (shame_message != null && shame_message.equals(shame_message2))) {
                                    final String regex = this.regex;
                                    final String regex2 = domainBan.regex;
                                    if (regex == regex2 || (regex != null && regex.equals(regex2))) {
                                        final String inspector_exempt_regex = this.inspector_exempt_regex;
                                        final String inspector_exempt_regex2 = domainBan.inspector_exempt_regex;
                                        if (inspector_exempt_regex == inspector_exempt_regex2 || (inspector_exempt_regex != null && inspector_exempt_regex.equals(inspector_exempt_regex2))) {
                                            final Boolean submit_banned = this.submit_banned;
                                            final Boolean submit_banned2 = domainBan.submit_banned;
                                            boolean b2 = b;
                                            if (submit_banned == submit_banned2) {
                                                return b2;
                                            }
                                            if (submit_banned != null && submit_banned.equals(submit_banned2)) {
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
        return false;
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
        final Boolean markdown = this.markdown;
        int hashCode3;
        if (markdown == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = markdown.hashCode();
        }
        final Boolean no_email = this.no_email;
        int hashCode4;
        if (no_email == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = no_email.hashCode();
        }
        final Boolean shame = this.shame;
        int hashCode5;
        if (shame == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = shame.hashCode();
        }
        final Boolean disable_approve = this.disable_approve;
        int hashCode6;
        if (disable_approve == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = disable_approve.hashCode();
        }
        final String ban_message = this.ban_message;
        int hashCode7;
        if (ban_message == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = ban_message.hashCode();
        }
        final String shame_message = this.shame_message;
        int hashCode8;
        if (shame_message == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = shame_message.hashCode();
        }
        final String regex = this.regex;
        int hashCode9;
        if (regex == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = regex.hashCode();
        }
        final String inspector_exempt_regex = this.inspector_exempt_regex;
        int hashCode10;
        if (inspector_exempt_regex == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = inspector_exempt_regex.hashCode();
        }
        final Boolean submit_banned = this.submit_banned;
        if (submit_banned != null) {
            hashCode = submit_banned.hashCode();
        }
        return ((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("DomainBan{url=");
        k.append(this.url);
        k.append(", markdown=");
        k.append(this.markdown);
        k.append(", no_email=");
        k.append(this.no_email);
        k.append(", shame=");
        k.append(this.shame);
        k.append(", disable_approve=");
        k.append(this.disable_approve);
        k.append(", ban_message=");
        k.append(this.ban_message);
        k.append(", shame_message=");
        k.append(this.shame_message);
        k.append(", regex=");
        k.append(this.regex);
        k.append(", inspector_exempt_regex=");
        k.append(this.inspector_exempt_regex);
        k.append(", submit_banned=");
        k.append(this.submit_banned);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        DomainBan.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<DomainBan>
    {
        private String ban_message;
        private Boolean disable_approve;
        private String inspector_exempt_regex;
        private Boolean markdown;
        private Boolean no_email;
        private String regex;
        private Boolean shame;
        private String shame_message;
        private Boolean submit_banned;
        private String url;
        
        public Builder() {
        }
        
        public Builder(final DomainBan domainBan) {
            this.url = domainBan.url;
            this.markdown = domainBan.markdown;
            this.no_email = domainBan.no_email;
            this.shame = domainBan.shame;
            this.disable_approve = domainBan.disable_approve;
            this.ban_message = domainBan.ban_message;
            this.shame_message = domainBan.shame_message;
            this.regex = domainBan.regex;
            this.inspector_exempt_regex = domainBan.inspector_exempt_regex;
            this.submit_banned = domainBan.submit_banned;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.url;
        }
        
        public static /* synthetic */ Boolean access$1000(final Builder builder) {
            return builder.submit_banned;
        }
        
        public static /* synthetic */ Boolean access$200(final Builder builder) {
            return builder.markdown;
        }
        
        public static /* synthetic */ Boolean access$300(final Builder builder) {
            return builder.no_email;
        }
        
        public static /* synthetic */ Boolean access$400(final Builder builder) {
            return builder.shame;
        }
        
        public static /* synthetic */ Boolean access$500(final Builder builder) {
            return builder.disable_approve;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.ban_message;
        }
        
        public static /* synthetic */ String access$700(final Builder builder) {
            return builder.shame_message;
        }
        
        public static /* synthetic */ String access$800(final Builder builder) {
            return builder.regex;
        }
        
        public static /* synthetic */ String access$900(final Builder builder) {
            return builder.inspector_exempt_regex;
        }
        
        public Builder ban_message(final String ban_message) {
            this.ban_message = ban_message;
            return this;
        }
        
        public DomainBan build() {
            return new DomainBan(this, null);
        }
        
        public Builder disable_approve(final Boolean disable_approve) {
            this.disable_approve = disable_approve;
            return this;
        }
        
        public Builder inspector_exempt_regex(final String inspector_exempt_regex) {
            this.inspector_exempt_regex = inspector_exempt_regex;
            return this;
        }
        
        public Builder markdown(final Boolean markdown) {
            this.markdown = markdown;
            return this;
        }
        
        public Builder no_email(final Boolean no_email) {
            this.no_email = no_email;
            return this;
        }
        
        public Builder regex(final String regex) {
            this.regex = regex;
            return this;
        }
        
        public void reset() {
            this.url = null;
            this.markdown = null;
            this.no_email = null;
            this.shame = null;
            this.disable_approve = null;
            this.ban_message = null;
            this.shame_message = null;
            this.regex = null;
            this.inspector_exempt_regex = null;
            this.submit_banned = null;
        }
        
        public Builder shame(final Boolean shame) {
            this.shame = shame;
            return this;
        }
        
        public Builder shame_message(final String shame_message) {
            this.shame_message = shame_message;
            return this;
        }
        
        public Builder submit_banned(final Boolean submit_banned) {
            this.submit_banned = submit_banned;
            return this;
        }
        
        public Builder url(final String url) {
            this.url = url;
            return this;
        }
    }
    
    public static final class DomainBanAdapter implements a<DomainBan, Builder>
    {
        private DomainBanAdapter() {
        }
        
        public DomainBan read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public DomainBan read(final e e, final Builder builder) throws IOException {
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
                    case 10: {
                        if (a == 2) {
                            builder.submit_banned(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 11) {
                            builder.inspector_exempt_regex(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.regex(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.shame_message(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.ban_message(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 2) {
                            builder.disable_approve(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 2) {
                            builder.shame(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 2) {
                            builder.no_email(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 2) {
                            builder.markdown(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.url(e.F());
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
        
        public void write(final e e, final DomainBan domainBan) throws IOException {
            e.a0();
            if (domainBan.url != null) {
                e.N(1, (byte)11);
                e.Z(domainBan.url);
                e.O();
            }
            if (domainBan.markdown != null) {
                e.N(2, (byte)2);
                d.z(domainBan.markdown, e);
            }
            if (domainBan.no_email != null) {
                e.N(3, (byte)2);
                d.z(domainBan.no_email, e);
            }
            if (domainBan.shame != null) {
                e.N(4, (byte)2);
                d.z(domainBan.shame, e);
            }
            if (domainBan.disable_approve != null) {
                e.N(5, (byte)2);
                d.z(domainBan.disable_approve, e);
            }
            if (domainBan.ban_message != null) {
                e.N(6, (byte)11);
                e.Z(domainBan.ban_message);
                e.O();
            }
            if (domainBan.shame_message != null) {
                e.N(7, (byte)11);
                e.Z(domainBan.shame_message);
                e.O();
            }
            if (domainBan.regex != null) {
                e.N(8, (byte)11);
                e.Z(domainBan.regex);
                e.O();
            }
            if (domainBan.inspector_exempt_regex != null) {
                e.N(9, (byte)11);
                e.Z(domainBan.inspector_exempt_regex);
                e.O();
            }
            if (domainBan.submit_banned != null) {
                e.N(10, (byte)2);
                d.z(domainBan.submit_banned, e);
            }
            e.P();
            e.b0();
        }
    }
}
