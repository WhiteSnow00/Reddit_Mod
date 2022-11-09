// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import jt.a;

public final class Session
{
    public static final a<Session, Session.Session$Builder> ADAPTER;
    public final Boolean anonymous_browsing_mode;
    public final Long created_timestamp;
    public final String id;
    public final String referrer_domain;
    public final String referrer_url;
    public final String type;
    public final String version;
    
    static {
        ADAPTER = (a)new Session.Session$SessionAdapter((Session$1)null);
    }
    
    private Session(final Session.Session$Builder session$Builder) {
        this.id = Session.Session$Builder.access$100(session$Builder);
        this.referrer_url = Session.Session$Builder.access$200(session$Builder);
        this.referrer_domain = Session.Session$Builder.access$300(session$Builder);
        this.version = Session.Session$Builder.access$400(session$Builder);
        this.type = Session.Session$Builder.access$500(session$Builder);
        this.created_timestamp = Session.Session$Builder.access$600(session$Builder);
        this.anonymous_browsing_mode = Session.Session$Builder.access$700(session$Builder);
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
        if (!(o instanceof Session)) {
            return false;
        }
        final Session session = (Session)o;
        final String id = this.id;
        final String id2 = session.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String referrer_url = this.referrer_url;
            final String referrer_url2 = session.referrer_url;
            if (referrer_url == referrer_url2 || (referrer_url != null && referrer_url.equals(referrer_url2))) {
                final String referrer_domain = this.referrer_domain;
                final String referrer_domain2 = session.referrer_domain;
                if (referrer_domain == referrer_domain2 || (referrer_domain != null && referrer_domain.equals(referrer_domain2))) {
                    final String version = this.version;
                    final String version2 = session.version;
                    if (version == version2 || (version != null && version.equals(version2))) {
                        final String type = this.type;
                        final String type2 = session.type;
                        if (type == type2 || (type != null && type.equals(type2))) {
                            final Long created_timestamp = this.created_timestamp;
                            final Long created_timestamp2 = session.created_timestamp;
                            if (created_timestamp == created_timestamp2 || (created_timestamp != null && created_timestamp.equals(created_timestamp2))) {
                                final Boolean anonymous_browsing_mode = this.anonymous_browsing_mode;
                                final Boolean anonymous_browsing_mode2 = session.anonymous_browsing_mode;
                                boolean b2 = b;
                                if (anonymous_browsing_mode == anonymous_browsing_mode2) {
                                    return b2;
                                }
                                if (anonymous_browsing_mode != null && anonymous_browsing_mode.equals(anonymous_browsing_mode2)) {
                                    b2 = b;
                                    return b2;
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
        final String referrer_url = this.referrer_url;
        int hashCode3;
        if (referrer_url == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = referrer_url.hashCode();
        }
        final String referrer_domain = this.referrer_domain;
        int hashCode4;
        if (referrer_domain == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = referrer_domain.hashCode();
        }
        final String version = this.version;
        int hashCode5;
        if (version == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = version.hashCode();
        }
        final String type = this.type;
        int hashCode6;
        if (type == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = type.hashCode();
        }
        final Long created_timestamp = this.created_timestamp;
        int hashCode7;
        if (created_timestamp == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = created_timestamp.hashCode();
        }
        final Boolean anonymous_browsing_mode = this.anonymous_browsing_mode;
        if (anonymous_browsing_mode != null) {
            hashCode = anonymous_browsing_mode.hashCode();
        }
        return (((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Session{id=");
        k.append(this.id);
        k.append(", referrer_url=");
        k.append(this.referrer_url);
        k.append(", referrer_domain=");
        k.append(this.referrer_domain);
        k.append(", version=");
        k.append(this.version);
        k.append(", type=");
        k.append(this.type);
        k.append(", created_timestamp=");
        k.append(this.created_timestamp);
        k.append(", anonymous_browsing_mode=");
        k.append(this.anonymous_browsing_mode);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        Session.ADAPTER.write(e, (Object)this);
    }
}
