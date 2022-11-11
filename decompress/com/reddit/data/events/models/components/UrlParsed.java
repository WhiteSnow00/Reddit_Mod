// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class UrlParsed
{
    public static final a<UrlParsed, UrlParsed.UrlParsed$Builder> ADAPTER;
    public final String shared_hash;
    public final Long shared_timestamp;
    public final String utm_campaign;
    public final String utm_content;
    public final String utm_medium;
    public final String utm_name;
    public final String utm_source;
    public final String utm_term;
    
    static {
        ADAPTER = (a)new UrlParsed.UrlParsed$UrlParsedAdapter((UrlParsed$1)null);
    }
    
    private UrlParsed(final UrlParsed.UrlParsed$Builder urlParsed$Builder) {
        this.shared_timestamp = UrlParsed.UrlParsed$Builder.access$100(urlParsed$Builder);
        this.utm_source = UrlParsed.UrlParsed$Builder.access$200(urlParsed$Builder);
        this.utm_name = UrlParsed.UrlParsed$Builder.access$300(urlParsed$Builder);
        this.shared_hash = UrlParsed.UrlParsed$Builder.access$400(urlParsed$Builder);
        this.utm_campaign = UrlParsed.UrlParsed$Builder.access$500(urlParsed$Builder);
        this.utm_content = UrlParsed.UrlParsed$Builder.access$600(urlParsed$Builder);
        this.utm_medium = UrlParsed.UrlParsed$Builder.access$700(urlParsed$Builder);
        this.utm_term = UrlParsed.UrlParsed$Builder.access$800(urlParsed$Builder);
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
        if (!(o instanceof UrlParsed)) {
            return false;
        }
        final UrlParsed urlParsed = (UrlParsed)o;
        final Long shared_timestamp = this.shared_timestamp;
        final Long shared_timestamp2 = urlParsed.shared_timestamp;
        if (shared_timestamp == shared_timestamp2 || (shared_timestamp != null && shared_timestamp.equals(shared_timestamp2))) {
            final String utm_source = this.utm_source;
            final String utm_source2 = urlParsed.utm_source;
            if (utm_source == utm_source2 || (utm_source != null && utm_source.equals(utm_source2))) {
                final String utm_name = this.utm_name;
                final String utm_name2 = urlParsed.utm_name;
                if (utm_name == utm_name2 || (utm_name != null && utm_name.equals(utm_name2))) {
                    final String shared_hash = this.shared_hash;
                    final String shared_hash2 = urlParsed.shared_hash;
                    if (shared_hash == shared_hash2 || (shared_hash != null && shared_hash.equals(shared_hash2))) {
                        final String utm_campaign = this.utm_campaign;
                        final String utm_campaign2 = urlParsed.utm_campaign;
                        if (utm_campaign == utm_campaign2 || (utm_campaign != null && utm_campaign.equals(utm_campaign2))) {
                            final String utm_content = this.utm_content;
                            final String utm_content2 = urlParsed.utm_content;
                            if (utm_content == utm_content2 || (utm_content != null && utm_content.equals(utm_content2))) {
                                final String utm_medium = this.utm_medium;
                                final String utm_medium2 = urlParsed.utm_medium;
                                if (utm_medium == utm_medium2 || (utm_medium != null && utm_medium.equals(utm_medium2))) {
                                    final String utm_term = this.utm_term;
                                    final String utm_term2 = urlParsed.utm_term;
                                    boolean b2 = b;
                                    if (utm_term == utm_term2) {
                                        return b2;
                                    }
                                    if (utm_term != null && utm_term.equals(utm_term2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final Long shared_timestamp = this.shared_timestamp;
        int hashCode = 0;
        int hashCode2;
        if (shared_timestamp == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = shared_timestamp.hashCode();
        }
        final String utm_source = this.utm_source;
        int hashCode3;
        if (utm_source == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = utm_source.hashCode();
        }
        final String utm_name = this.utm_name;
        int hashCode4;
        if (utm_name == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = utm_name.hashCode();
        }
        final String shared_hash = this.shared_hash;
        int hashCode5;
        if (shared_hash == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = shared_hash.hashCode();
        }
        final String utm_campaign = this.utm_campaign;
        int hashCode6;
        if (utm_campaign == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = utm_campaign.hashCode();
        }
        final String utm_content = this.utm_content;
        int hashCode7;
        if (utm_content == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = utm_content.hashCode();
        }
        final String utm_medium = this.utm_medium;
        int hashCode8;
        if (utm_medium == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = utm_medium.hashCode();
        }
        final String utm_term = this.utm_term;
        if (utm_term != null) {
            hashCode = utm_term.hashCode();
        }
        return ((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("UrlParsed{shared_timestamp=");
        r.append(this.shared_timestamp);
        r.append(", utm_source=");
        r.append(this.utm_source);
        r.append(", utm_name=");
        r.append(this.utm_name);
        r.append(", shared_hash=");
        r.append(this.shared_hash);
        r.append(", utm_campaign=");
        r.append(this.utm_campaign);
        r.append(", utm_content=");
        r.append(this.utm_content);
        r.append(", utm_medium=");
        r.append(this.utm_medium);
        r.append(", utm_term=");
        return a.o(r, this.utm_term, "}");
    }
    
    public void write(final e e) throws IOException {
        UrlParsed.ADAPTER.write(e, (Object)this);
    }
}
