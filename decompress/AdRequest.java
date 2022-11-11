// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class AdRequest
{
    public static final a<AdRequest, AdRequest.AdRequest$Builder> ADAPTER;
    public final Boolean first_chunk;
    public final Long number_min_distance;
    public final String placement;
    public final String platform;
    public final List<String> post_links;
    public final List<String> post_links_above;
    public final List<String> post_links_below;
    public final List<String> slots;
    public final String top_comment_id;
    
    static {
        ADAPTER = (a)new AdRequest.AdRequest$AdRequestAdapter((AdRequest$1)null);
    }
    
    private AdRequest(final AdRequest.AdRequest$Builder adRequest$Builder) {
        this.number_min_distance = AdRequest.AdRequest$Builder.access$100(adRequest$Builder);
        this.first_chunk = AdRequest.AdRequest$Builder.access$200(adRequest$Builder);
        final List access$300 = AdRequest.AdRequest$Builder.access$300(adRequest$Builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$300 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)AdRequest.AdRequest$Builder.access$300(adRequest$Builder));
        }
        this.post_links = unmodifiableList;
        this.placement = AdRequest.AdRequest$Builder.access$400(adRequest$Builder);
        this.platform = AdRequest.AdRequest$Builder.access$500(adRequest$Builder);
        List<String> unmodifiableList2;
        if (AdRequest.AdRequest$Builder.access$600(adRequest$Builder) == null) {
            unmodifiableList2 = null;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)AdRequest.AdRequest$Builder.access$600(adRequest$Builder));
        }
        this.slots = unmodifiableList2;
        List<String> unmodifiableList3;
        if (AdRequest.AdRequest$Builder.access$700(adRequest$Builder) == null) {
            unmodifiableList3 = null;
        }
        else {
            unmodifiableList3 = Collections.unmodifiableList((List<? extends String>)AdRequest.AdRequest$Builder.access$700(adRequest$Builder));
        }
        this.post_links_above = unmodifiableList3;
        List<String> unmodifiableList4;
        if (AdRequest.AdRequest$Builder.access$800(adRequest$Builder) == null) {
            unmodifiableList4 = list;
        }
        else {
            unmodifiableList4 = Collections.unmodifiableList((List<? extends String>)AdRequest.AdRequest$Builder.access$800(adRequest$Builder));
        }
        this.post_links_below = unmodifiableList4;
        this.top_comment_id = AdRequest.AdRequest$Builder.access$900(adRequest$Builder);
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
        if (!(o instanceof AdRequest)) {
            return false;
        }
        final AdRequest adRequest = (AdRequest)o;
        final Long number_min_distance = this.number_min_distance;
        final Long number_min_distance2 = adRequest.number_min_distance;
        if (number_min_distance == number_min_distance2 || (number_min_distance != null && number_min_distance.equals(number_min_distance2))) {
            final Boolean first_chunk = this.first_chunk;
            final Boolean first_chunk2 = adRequest.first_chunk;
            if (first_chunk == first_chunk2 || (first_chunk != null && first_chunk.equals(first_chunk2))) {
                final List<String> post_links = this.post_links;
                final List<String> post_links2 = adRequest.post_links;
                if (post_links == post_links2 || (post_links != null && post_links.equals(post_links2))) {
                    final String placement = this.placement;
                    final String placement2 = adRequest.placement;
                    if (placement == placement2 || (placement != null && placement.equals(placement2))) {
                        final String platform = this.platform;
                        final String platform2 = adRequest.platform;
                        if (platform == platform2 || (platform != null && platform.equals(platform2))) {
                            final List<String> slots = this.slots;
                            final List<String> slots2 = adRequest.slots;
                            if (slots == slots2 || (slots != null && slots.equals(slots2))) {
                                final List<String> post_links_above = this.post_links_above;
                                final List<String> post_links_above2 = adRequest.post_links_above;
                                if (post_links_above == post_links_above2 || (post_links_above != null && post_links_above.equals(post_links_above2))) {
                                    final List<String> post_links_below = this.post_links_below;
                                    final List<String> post_links_below2 = adRequest.post_links_below;
                                    if (post_links_below == post_links_below2 || (post_links_below != null && post_links_below.equals(post_links_below2))) {
                                        final String top_comment_id = this.top_comment_id;
                                        final String top_comment_id2 = adRequest.top_comment_id;
                                        boolean b2 = b;
                                        if (top_comment_id == top_comment_id2) {
                                            return b2;
                                        }
                                        if (top_comment_id != null && top_comment_id.equals(top_comment_id2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final Long number_min_distance = this.number_min_distance;
        int hashCode = 0;
        int hashCode2;
        if (number_min_distance == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = number_min_distance.hashCode();
        }
        final Boolean first_chunk = this.first_chunk;
        int hashCode3;
        if (first_chunk == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = first_chunk.hashCode();
        }
        final List<String> post_links = this.post_links;
        int hashCode4;
        if (post_links == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = post_links.hashCode();
        }
        final String placement = this.placement;
        int hashCode5;
        if (placement == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = placement.hashCode();
        }
        final String platform = this.platform;
        int hashCode6;
        if (platform == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = platform.hashCode();
        }
        final List<String> slots = this.slots;
        int hashCode7;
        if (slots == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = slots.hashCode();
        }
        final List<String> post_links_above = this.post_links_above;
        int hashCode8;
        if (post_links_above == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = post_links_above.hashCode();
        }
        final List<String> post_links_below = this.post_links_below;
        int hashCode9;
        if (post_links_below == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = post_links_below.hashCode();
        }
        final String top_comment_id = this.top_comment_id;
        if (top_comment_id != null) {
            hashCode = top_comment_id.hashCode();
        }
        return (((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AdRequest{number_min_distance=");
        k.append(this.number_min_distance);
        k.append(", first_chunk=");
        k.append(this.first_chunk);
        k.append(", post_links=");
        k.append(this.post_links);
        k.append(", placement=");
        k.append(this.placement);
        k.append(", platform=");
        k.append(this.platform);
        k.append(", slots=");
        k.append(this.slots);
        k.append(", post_links_above=");
        k.append(this.post_links_above);
        k.append(", post_links_below=");
        k.append(this.post_links_below);
        k.append(", top_comment_id=");
        return b.j(k, this.top_comment_id, "}");
    }
    
    public void write(final e e) throws IOException {
        AdRequest.ADAPTER.write(e, (Object)this);
    }
}
