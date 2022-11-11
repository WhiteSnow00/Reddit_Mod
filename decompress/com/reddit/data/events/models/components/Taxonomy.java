// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import al0.g7;
import java.util.Collections;
import java.util.List;
import et.a;

public final class Taxonomy
{
    public static final a<Taxonomy, Taxonomy.Taxonomy$Builder> ADAPTER;
    public final String allowlist_status;
    public final List<String> mature_themes;
    public final List<String> primary_topics;
    public final String rating;
    public final String subreddit_id;
    public final String subreddit_name;
    public final String subreddit_whitelist_status;
    public final String version;
    
    static {
        ADAPTER = (a)new Taxonomy.Taxonomy$TaxonomyAdapter((Taxonomy$1)null);
    }
    
    private Taxonomy(final Taxonomy.Taxonomy$Builder taxonomy$Builder) {
        this.subreddit_id = Taxonomy.Taxonomy$Builder.access$100(taxonomy$Builder);
        this.subreddit_name = Taxonomy.Taxonomy$Builder.access$200(taxonomy$Builder);
        this.subreddit_whitelist_status = Taxonomy.Taxonomy$Builder.access$300(taxonomy$Builder);
        this.version = Taxonomy.Taxonomy$Builder.access$400(taxonomy$Builder);
        this.rating = Taxonomy.Taxonomy$Builder.access$500(taxonomy$Builder);
        this.allowlist_status = Taxonomy.Taxonomy$Builder.access$600(taxonomy$Builder);
        final List access$700 = Taxonomy.Taxonomy$Builder.access$700(taxonomy$Builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$700 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Taxonomy.Taxonomy$Builder.access$700(taxonomy$Builder));
        }
        this.primary_topics = unmodifiableList;
        List<String> unmodifiableList2;
        if (Taxonomy.Taxonomy$Builder.access$800(taxonomy$Builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Taxonomy.Taxonomy$Builder.access$800(taxonomy$Builder));
        }
        this.mature_themes = unmodifiableList2;
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
        if (!(o instanceof Taxonomy)) {
            return false;
        }
        final Taxonomy taxonomy = (Taxonomy)o;
        final String subreddit_id = this.subreddit_id;
        final String subreddit_id2 = taxonomy.subreddit_id;
        if (subreddit_id == subreddit_id2 || (subreddit_id != null && subreddit_id.equals(subreddit_id2))) {
            final String subreddit_name = this.subreddit_name;
            final String subreddit_name2 = taxonomy.subreddit_name;
            if (subreddit_name == subreddit_name2 || (subreddit_name != null && subreddit_name.equals(subreddit_name2))) {
                final String subreddit_whitelist_status = this.subreddit_whitelist_status;
                final String subreddit_whitelist_status2 = taxonomy.subreddit_whitelist_status;
                if (subreddit_whitelist_status == subreddit_whitelist_status2 || (subreddit_whitelist_status != null && subreddit_whitelist_status.equals(subreddit_whitelist_status2))) {
                    final String version = this.version;
                    final String version2 = taxonomy.version;
                    if (version == version2 || (version != null && version.equals(version2))) {
                        final String rating = this.rating;
                        final String rating2 = taxonomy.rating;
                        if (rating == rating2 || (rating != null && rating.equals(rating2))) {
                            final String allowlist_status = this.allowlist_status;
                            final String allowlist_status2 = taxonomy.allowlist_status;
                            if (allowlist_status == allowlist_status2 || (allowlist_status != null && allowlist_status.equals(allowlist_status2))) {
                                final List<String> primary_topics = this.primary_topics;
                                final List<String> primary_topics2 = taxonomy.primary_topics;
                                if (primary_topics == primary_topics2 || (primary_topics != null && primary_topics.equals(primary_topics2))) {
                                    final List<String> mature_themes = this.mature_themes;
                                    final List<String> mature_themes2 = taxonomy.mature_themes;
                                    boolean b2 = b;
                                    if (mature_themes == mature_themes2) {
                                        return b2;
                                    }
                                    if (mature_themes != null && mature_themes.equals(mature_themes2)) {
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
        final String subreddit_id = this.subreddit_id;
        int hashCode = 0;
        int hashCode2;
        if (subreddit_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = subreddit_id.hashCode();
        }
        final String subreddit_name = this.subreddit_name;
        int hashCode3;
        if (subreddit_name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = subreddit_name.hashCode();
        }
        final String subreddit_whitelist_status = this.subreddit_whitelist_status;
        int hashCode4;
        if (subreddit_whitelist_status == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = subreddit_whitelist_status.hashCode();
        }
        final String version = this.version;
        int hashCode5;
        if (version == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = version.hashCode();
        }
        final String rating = this.rating;
        int hashCode6;
        if (rating == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = rating.hashCode();
        }
        final String allowlist_status = this.allowlist_status;
        int hashCode7;
        if (allowlist_status == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = allowlist_status.hashCode();
        }
        final List<String> primary_topics = this.primary_topics;
        int hashCode8;
        if (primary_topics == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = primary_topics.hashCode();
        }
        final List<String> mature_themes = this.mature_themes;
        if (mature_themes != null) {
            hashCode = mature_themes.hashCode();
        }
        return ((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Taxonomy{subreddit_id=");
        r.append(this.subreddit_id);
        r.append(", subreddit_name=");
        r.append(this.subreddit_name);
        r.append(", subreddit_whitelist_status=");
        r.append(this.subreddit_whitelist_status);
        r.append(", version=");
        r.append(this.version);
        r.append(", rating=");
        r.append(this.rating);
        r.append(", allowlist_status=");
        r.append(this.allowlist_status);
        r.append(", primary_topics=");
        r.append(this.primary_topics);
        r.append(", mature_themes=");
        return g7.k(r, (List)this.mature_themes, "}");
    }
    
    public void write(final e e) throws IOException {
        Taxonomy.ADAPTER.write(e, (Object)this);
    }
}
