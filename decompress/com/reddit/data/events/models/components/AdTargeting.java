// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class AdTargeting
{
    public static final a<AdTargeting, AdTargeting.AdTargeting$Builder> ADAPTER;
    public final String advanced;
    public final List<String> communities;
    public final List<String> custom_audience_ids;
    public final List<String> devices_json;
    public final List<String> excluded_communities;
    public final List<String> excluded_custom_audience_ids;
    public final List<String> excluded_geolocations;
    public final List<String> excluded_interests;
    public final List<String> excluded_keywords;
    public final Boolean expand_targeting;
    public final List<String> geolocations;
    public final List<String> interests;
    public final List<String> placements_json;
    
    static {
        ADAPTER = (a)new AdTargeting.AdTargeting$AdTargetingAdapter((AdTargeting$1)null);
    }
    
    private AdTargeting(final AdTargeting.AdTargeting$Builder adTargeting$Builder) {
        final List access$100 = AdTargeting.AdTargeting$Builder.access$100(adTargeting$Builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$100 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)AdTargeting.AdTargeting$Builder.access$100(adTargeting$Builder));
        }
        this.geolocations = unmodifiableList;
        List<String> unmodifiableList2;
        if (AdTargeting.AdTargeting$Builder.access$200(adTargeting$Builder) == null) {
            unmodifiableList2 = null;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)AdTargeting.AdTargeting$Builder.access$200(adTargeting$Builder));
        }
        this.excluded_geolocations = unmodifiableList2;
        List<String> unmodifiableList3;
        if (AdTargeting.AdTargeting$Builder.access$300(adTargeting$Builder) == null) {
            unmodifiableList3 = null;
        }
        else {
            unmodifiableList3 = Collections.unmodifiableList((List<? extends String>)AdTargeting.AdTargeting$Builder.access$300(adTargeting$Builder));
        }
        this.excluded_keywords = unmodifiableList3;
        List<String> unmodifiableList4;
        if (AdTargeting.AdTargeting$Builder.access$400(adTargeting$Builder) == null) {
            unmodifiableList4 = null;
        }
        else {
            unmodifiableList4 = Collections.unmodifiableList((List<? extends String>)AdTargeting.AdTargeting$Builder.access$400(adTargeting$Builder));
        }
        this.interests = unmodifiableList4;
        List<String> unmodifiableList5;
        if (AdTargeting.AdTargeting$Builder.access$500(adTargeting$Builder) == null) {
            unmodifiableList5 = null;
        }
        else {
            unmodifiableList5 = Collections.unmodifiableList((List<? extends String>)AdTargeting.AdTargeting$Builder.access$500(adTargeting$Builder));
        }
        this.excluded_interests = unmodifiableList5;
        List<String> unmodifiableList6;
        if (AdTargeting.AdTargeting$Builder.access$600(adTargeting$Builder) == null) {
            unmodifiableList6 = null;
        }
        else {
            unmodifiableList6 = Collections.unmodifiableList((List<? extends String>)AdTargeting.AdTargeting$Builder.access$600(adTargeting$Builder));
        }
        this.communities = unmodifiableList6;
        List<String> unmodifiableList7;
        if (AdTargeting.AdTargeting$Builder.access$700(adTargeting$Builder) == null) {
            unmodifiableList7 = null;
        }
        else {
            unmodifiableList7 = Collections.unmodifiableList((List<? extends String>)AdTargeting.AdTargeting$Builder.access$700(adTargeting$Builder));
        }
        this.excluded_communities = unmodifiableList7;
        List<String> unmodifiableList8;
        if (AdTargeting.AdTargeting$Builder.access$800(adTargeting$Builder) == null) {
            unmodifiableList8 = null;
        }
        else {
            unmodifiableList8 = Collections.unmodifiableList((List<? extends String>)AdTargeting.AdTargeting$Builder.access$800(adTargeting$Builder));
        }
        this.devices_json = unmodifiableList8;
        List<String> unmodifiableList9;
        if (AdTargeting.AdTargeting$Builder.access$900(adTargeting$Builder) == null) {
            unmodifiableList9 = null;
        }
        else {
            unmodifiableList9 = Collections.unmodifiableList((List<? extends String>)AdTargeting.AdTargeting$Builder.access$900(adTargeting$Builder));
        }
        this.placements_json = unmodifiableList9;
        this.advanced = AdTargeting.AdTargeting$Builder.access$1000(adTargeting$Builder);
        List<String> unmodifiableList10;
        if (AdTargeting.AdTargeting$Builder.access$1100(adTargeting$Builder) == null) {
            unmodifiableList10 = null;
        }
        else {
            unmodifiableList10 = Collections.unmodifiableList((List<? extends String>)AdTargeting.AdTargeting$Builder.access$1100(adTargeting$Builder));
        }
        this.custom_audience_ids = unmodifiableList10;
        List<String> unmodifiableList11;
        if (AdTargeting.AdTargeting$Builder.access$1200(adTargeting$Builder) == null) {
            unmodifiableList11 = list;
        }
        else {
            unmodifiableList11 = Collections.unmodifiableList((List<? extends String>)AdTargeting.AdTargeting$Builder.access$1200(adTargeting$Builder));
        }
        this.excluded_custom_audience_ids = unmodifiableList11;
        this.expand_targeting = AdTargeting.AdTargeting$Builder.access$1300(adTargeting$Builder);
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
        if (!(o instanceof AdTargeting)) {
            return false;
        }
        final AdTargeting adTargeting = (AdTargeting)o;
        final List<String> geolocations = this.geolocations;
        final List<String> geolocations2 = adTargeting.geolocations;
        if (geolocations == geolocations2 || (geolocations != null && geolocations.equals(geolocations2))) {
            final List<String> excluded_geolocations = this.excluded_geolocations;
            final List<String> excluded_geolocations2 = adTargeting.excluded_geolocations;
            if (excluded_geolocations == excluded_geolocations2 || (excluded_geolocations != null && excluded_geolocations.equals(excluded_geolocations2))) {
                final List<String> excluded_keywords = this.excluded_keywords;
                final List<String> excluded_keywords2 = adTargeting.excluded_keywords;
                if (excluded_keywords == excluded_keywords2 || (excluded_keywords != null && excluded_keywords.equals(excluded_keywords2))) {
                    final List<String> interests = this.interests;
                    final List<String> interests2 = adTargeting.interests;
                    if (interests == interests2 || (interests != null && interests.equals(interests2))) {
                        final List<String> excluded_interests = this.excluded_interests;
                        final List<String> excluded_interests2 = adTargeting.excluded_interests;
                        if (excluded_interests == excluded_interests2 || (excluded_interests != null && excluded_interests.equals(excluded_interests2))) {
                            final List<String> communities = this.communities;
                            final List<String> communities2 = adTargeting.communities;
                            if (communities == communities2 || (communities != null && communities.equals(communities2))) {
                                final List<String> excluded_communities = this.excluded_communities;
                                final List<String> excluded_communities2 = adTargeting.excluded_communities;
                                if (excluded_communities == excluded_communities2 || (excluded_communities != null && excluded_communities.equals(excluded_communities2))) {
                                    final List<String> devices_json = this.devices_json;
                                    final List<String> devices_json2 = adTargeting.devices_json;
                                    if (devices_json == devices_json2 || (devices_json != null && devices_json.equals(devices_json2))) {
                                        final List<String> placements_json = this.placements_json;
                                        final List<String> placements_json2 = adTargeting.placements_json;
                                        if (placements_json == placements_json2 || (placements_json != null && placements_json.equals(placements_json2))) {
                                            final String advanced = this.advanced;
                                            final String advanced2 = adTargeting.advanced;
                                            if (advanced == advanced2 || (advanced != null && advanced.equals(advanced2))) {
                                                final List<String> custom_audience_ids = this.custom_audience_ids;
                                                final List<String> custom_audience_ids2 = adTargeting.custom_audience_ids;
                                                if (custom_audience_ids == custom_audience_ids2 || (custom_audience_ids != null && custom_audience_ids.equals(custom_audience_ids2))) {
                                                    final List<String> excluded_custom_audience_ids = this.excluded_custom_audience_ids;
                                                    final List<String> excluded_custom_audience_ids2 = adTargeting.excluded_custom_audience_ids;
                                                    if (excluded_custom_audience_ids == excluded_custom_audience_ids2 || (excluded_custom_audience_ids != null && excluded_custom_audience_ids.equals(excluded_custom_audience_ids2))) {
                                                        final Boolean expand_targeting = this.expand_targeting;
                                                        final Boolean expand_targeting2 = adTargeting.expand_targeting;
                                                        boolean b2 = b;
                                                        if (expand_targeting == expand_targeting2) {
                                                            return b2;
                                                        }
                                                        if (expand_targeting != null && expand_targeting.equals(expand_targeting2)) {
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
        final List<String> geolocations = this.geolocations;
        int hashCode = 0;
        int hashCode2;
        if (geolocations == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = geolocations.hashCode();
        }
        final List<String> excluded_geolocations = this.excluded_geolocations;
        int hashCode3;
        if (excluded_geolocations == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = excluded_geolocations.hashCode();
        }
        final List<String> excluded_keywords = this.excluded_keywords;
        int hashCode4;
        if (excluded_keywords == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = excluded_keywords.hashCode();
        }
        final List<String> interests = this.interests;
        int hashCode5;
        if (interests == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = interests.hashCode();
        }
        final List<String> excluded_interests = this.excluded_interests;
        int hashCode6;
        if (excluded_interests == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = excluded_interests.hashCode();
        }
        final List<String> communities = this.communities;
        int hashCode7;
        if (communities == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = communities.hashCode();
        }
        final List<String> excluded_communities = this.excluded_communities;
        int hashCode8;
        if (excluded_communities == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = excluded_communities.hashCode();
        }
        final List<String> devices_json = this.devices_json;
        int hashCode9;
        if (devices_json == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = devices_json.hashCode();
        }
        final List<String> placements_json = this.placements_json;
        int hashCode10;
        if (placements_json == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = placements_json.hashCode();
        }
        final String advanced = this.advanced;
        int hashCode11;
        if (advanced == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = advanced.hashCode();
        }
        final List<String> custom_audience_ids = this.custom_audience_ids;
        int hashCode12;
        if (custom_audience_ids == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = custom_audience_ids.hashCode();
        }
        final List<String> excluded_custom_audience_ids = this.excluded_custom_audience_ids;
        int hashCode13;
        if (excluded_custom_audience_ids == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = excluded_custom_audience_ids.hashCode();
        }
        final Boolean expand_targeting = this.expand_targeting;
        if (expand_targeting != null) {
            hashCode = expand_targeting.hashCode();
        }
        return (((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AdTargeting{geolocations=");
        k.append(this.geolocations);
        k.append(", excluded_geolocations=");
        k.append(this.excluded_geolocations);
        k.append(", excluded_keywords=");
        k.append(this.excluded_keywords);
        k.append(", interests=");
        k.append(this.interests);
        k.append(", excluded_interests=");
        k.append(this.excluded_interests);
        k.append(", communities=");
        k.append(this.communities);
        k.append(", excluded_communities=");
        k.append(this.excluded_communities);
        k.append(", devices_json=");
        k.append(this.devices_json);
        k.append(", placements_json=");
        k.append(this.placements_json);
        k.append(", advanced=");
        k.append(this.advanced);
        k.append(", custom_audience_ids=");
        k.append(this.custom_audience_ids);
        k.append(", excluded_custom_audience_ids=");
        k.append(this.excluded_custom_audience_ids);
        k.append(", expand_targeting=");
        k.append(this.expand_targeting);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        AdTargeting.ADAPTER.write(e, (Object)this);
    }
}
