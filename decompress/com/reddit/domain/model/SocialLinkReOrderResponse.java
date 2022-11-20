// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import p1.h;
import ng2.e;
import com.reddit.domain.model.sociallink.SocialLink;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/SocialLinkReOrderResponse;", "", "ok", "", "socialLinks", "", "Lcom/reddit/domain/model/sociallink/SocialLink;", "(ZLjava/util/List;)V", "getOk", "()Z", "getSocialLinks", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SocialLinkReOrderResponse
{
    private final boolean ok;
    private final List<SocialLink> socialLinks;
    
    public SocialLinkReOrderResponse(final boolean ok, final List<SocialLink> socialLinks) {
        e.f((Object)socialLinks, "socialLinks");
        this.ok = ok;
        this.socialLinks = socialLinks;
    }
    
    public static SocialLinkReOrderResponse copy$default(final SocialLinkReOrderResponse socialLinkReOrderResponse, boolean ok, List socialLinks, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            ok = socialLinkReOrderResponse.ok;
        }
        if ((n & 0x2) != 0x0) {
            socialLinks = socialLinkReOrderResponse.socialLinks;
        }
        return socialLinkReOrderResponse.copy(ok, socialLinks);
    }
    
    public final boolean component1() {
        return this.ok;
    }
    
    public final List<SocialLink> component2() {
        return this.socialLinks;
    }
    
    public final SocialLinkReOrderResponse copy(final boolean b, final List<SocialLink> list) {
        e.f((Object)list, "socialLinks");
        return new SocialLinkReOrderResponse(b, list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SocialLinkReOrderResponse)) {
            return false;
        }
        final SocialLinkReOrderResponse socialLinkReOrderResponse = (SocialLinkReOrderResponse)o;
        return this.ok == socialLinkReOrderResponse.ok && e.a((Object)this.socialLinks, (Object)socialLinkReOrderResponse.socialLinks);
    }
    
    public final boolean getOk() {
        return this.ok;
    }
    
    public final List<SocialLink> getSocialLinks() {
        return this.socialLinks;
    }
    
    @Override
    public int hashCode() {
        int ok;
        if ((ok = (this.ok ? 1 : 0)) != 0) {
            ok = 1;
        }
        return this.socialLinks.hashCode() + ok * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("SocialLinkReOrderResponse(ok=");
        t.append(this.ok);
        t.append(", socialLinks=");
        return h.d(t, (List)this.socialLinks, ')');
    }
}
