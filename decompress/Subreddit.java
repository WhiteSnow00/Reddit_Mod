// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import java.util.Collections;
import java.util.List;
import et.a;

public final class Subreddit
{
    public static final a<Subreddit, Subreddit.Subreddit$Builder> ADAPTER;
    public final String access_type;
    public final String category_name;
    public final String id;
    public final String name;
    public final Boolean nsfw;
    public final Integer number_coins;
    public final String post_difficulty_rating;
    public final String public_description;
    public final Boolean quarantined;
    public final Integer subscriber_count;
    public final List<String> topic_tag_contents;
    public final List<String> topic_tag_ids;
    public final String topic_tag_primary_id;
    public final List<String> topic_tag_types;
    public final String whitelist_status;
    
    static {
        ADAPTER = (a)new Subreddit.Subreddit$SubredditAdapter((Subreddit$1)null);
    }
    
    private Subreddit(final Subreddit.Subreddit$Builder subreddit$Builder) {
        this.id = Subreddit.Subreddit$Builder.access$100(subreddit$Builder);
        this.name = Subreddit.Subreddit$Builder.access$200(subreddit$Builder);
        this.category_name = Subreddit.Subreddit$Builder.access$300(subreddit$Builder);
        this.whitelist_status = Subreddit.Subreddit$Builder.access$400(subreddit$Builder);
        this.access_type = Subreddit.Subreddit$Builder.access$500(subreddit$Builder);
        this.quarantined = Subreddit.Subreddit$Builder.access$600(subreddit$Builder);
        this.nsfw = Subreddit.Subreddit$Builder.access$700(subreddit$Builder);
        final List access$800 = Subreddit.Subreddit$Builder.access$800(subreddit$Builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$800 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Subreddit.Subreddit$Builder.access$800(subreddit$Builder));
        }
        this.topic_tag_ids = unmodifiableList;
        List<String> unmodifiableList2;
        if (Subreddit.Subreddit$Builder.access$900(subreddit$Builder) == null) {
            unmodifiableList2 = null;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Subreddit.Subreddit$Builder.access$900(subreddit$Builder));
        }
        this.topic_tag_contents = unmodifiableList2;
        List<String> unmodifiableList3;
        if (Subreddit.Subreddit$Builder.access$1000(subreddit$Builder) == null) {
            unmodifiableList3 = list;
        }
        else {
            unmodifiableList3 = Collections.unmodifiableList((List<? extends String>)Subreddit.Subreddit$Builder.access$1000(subreddit$Builder));
        }
        this.topic_tag_types = unmodifiableList3;
        this.number_coins = Subreddit.Subreddit$Builder.access$1100(subreddit$Builder);
        this.public_description = Subreddit.Subreddit$Builder.access$1200(subreddit$Builder);
        this.post_difficulty_rating = Subreddit.Subreddit$Builder.access$1300(subreddit$Builder);
        this.topic_tag_primary_id = Subreddit.Subreddit$Builder.access$1400(subreddit$Builder);
        this.subscriber_count = Subreddit.Subreddit$Builder.access$1500(subreddit$Builder);
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
        if (!(o instanceof Subreddit)) {
            return false;
        }
        final Subreddit subreddit = (Subreddit)o;
        final String id = this.id;
        final String id2 = subreddit.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String name = this.name;
            final String name2 = subreddit.name;
            if (name == name2 || (name != null && name.equals(name2))) {
                final String category_name = this.category_name;
                final String category_name2 = subreddit.category_name;
                if (category_name == category_name2 || (category_name != null && category_name.equals(category_name2))) {
                    final String whitelist_status = this.whitelist_status;
                    final String whitelist_status2 = subreddit.whitelist_status;
                    if (whitelist_status == whitelist_status2 || (whitelist_status != null && whitelist_status.equals(whitelist_status2))) {
                        final String access_type = this.access_type;
                        final String access_type2 = subreddit.access_type;
                        if (access_type == access_type2 || (access_type != null && access_type.equals(access_type2))) {
                            final Boolean quarantined = this.quarantined;
                            final Boolean quarantined2 = subreddit.quarantined;
                            if (quarantined == quarantined2 || (quarantined != null && quarantined.equals(quarantined2))) {
                                final Boolean nsfw = this.nsfw;
                                final Boolean nsfw2 = subreddit.nsfw;
                                if (nsfw == nsfw2 || (nsfw != null && nsfw.equals(nsfw2))) {
                                    final List<String> topic_tag_ids = this.topic_tag_ids;
                                    final List<String> topic_tag_ids2 = subreddit.topic_tag_ids;
                                    if (topic_tag_ids == topic_tag_ids2 || (topic_tag_ids != null && topic_tag_ids.equals(topic_tag_ids2))) {
                                        final List<String> topic_tag_contents = this.topic_tag_contents;
                                        final List<String> topic_tag_contents2 = subreddit.topic_tag_contents;
                                        if (topic_tag_contents == topic_tag_contents2 || (topic_tag_contents != null && topic_tag_contents.equals(topic_tag_contents2))) {
                                            final List<String> topic_tag_types = this.topic_tag_types;
                                            final List<String> topic_tag_types2 = subreddit.topic_tag_types;
                                            if (topic_tag_types == topic_tag_types2 || (topic_tag_types != null && topic_tag_types.equals(topic_tag_types2))) {
                                                final Integer number_coins = this.number_coins;
                                                final Integer number_coins2 = subreddit.number_coins;
                                                if (number_coins == number_coins2 || (number_coins != null && number_coins.equals(number_coins2))) {
                                                    final String public_description = this.public_description;
                                                    final String public_description2 = subreddit.public_description;
                                                    if (public_description == public_description2 || (public_description != null && public_description.equals(public_description2))) {
                                                        final String post_difficulty_rating = this.post_difficulty_rating;
                                                        final String post_difficulty_rating2 = subreddit.post_difficulty_rating;
                                                        if (post_difficulty_rating == post_difficulty_rating2 || (post_difficulty_rating != null && post_difficulty_rating.equals(post_difficulty_rating2))) {
                                                            final String topic_tag_primary_id = this.topic_tag_primary_id;
                                                            final String topic_tag_primary_id2 = subreddit.topic_tag_primary_id;
                                                            if (topic_tag_primary_id == topic_tag_primary_id2 || (topic_tag_primary_id != null && topic_tag_primary_id.equals(topic_tag_primary_id2))) {
                                                                final Integer subscriber_count = this.subscriber_count;
                                                                final Integer subscriber_count2 = subreddit.subscriber_count;
                                                                boolean b2 = b;
                                                                if (subscriber_count == subscriber_count2) {
                                                                    return b2;
                                                                }
                                                                if (subscriber_count != null && subscriber_count.equals(subscriber_count2)) {
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
        final String name = this.name;
        int hashCode3;
        if (name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = name.hashCode();
        }
        final String category_name = this.category_name;
        int hashCode4;
        if (category_name == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = category_name.hashCode();
        }
        final String whitelist_status = this.whitelist_status;
        int hashCode5;
        if (whitelist_status == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = whitelist_status.hashCode();
        }
        final String access_type = this.access_type;
        int hashCode6;
        if (access_type == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = access_type.hashCode();
        }
        final Boolean quarantined = this.quarantined;
        int hashCode7;
        if (quarantined == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = quarantined.hashCode();
        }
        final Boolean nsfw = this.nsfw;
        int hashCode8;
        if (nsfw == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = nsfw.hashCode();
        }
        final List<String> topic_tag_ids = this.topic_tag_ids;
        int hashCode9;
        if (topic_tag_ids == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = topic_tag_ids.hashCode();
        }
        final List<String> topic_tag_contents = this.topic_tag_contents;
        int hashCode10;
        if (topic_tag_contents == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = topic_tag_contents.hashCode();
        }
        final List<String> topic_tag_types = this.topic_tag_types;
        int hashCode11;
        if (topic_tag_types == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = topic_tag_types.hashCode();
        }
        final Integer number_coins = this.number_coins;
        int hashCode12;
        if (number_coins == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = number_coins.hashCode();
        }
        final String public_description = this.public_description;
        int hashCode13;
        if (public_description == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = public_description.hashCode();
        }
        final String post_difficulty_rating = this.post_difficulty_rating;
        int hashCode14;
        if (post_difficulty_rating == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = post_difficulty_rating.hashCode();
        }
        final String topic_tag_primary_id = this.topic_tag_primary_id;
        int hashCode15;
        if (topic_tag_primary_id == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = topic_tag_primary_id.hashCode();
        }
        final Integer subscriber_count = this.subscriber_count;
        if (subscriber_count != null) {
            hashCode = subscriber_count.hashCode();
        }
        return (((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Subreddit{id=");
        r.append(this.id);
        r.append(", name=");
        r.append(this.name);
        r.append(", category_name=");
        r.append(this.category_name);
        r.append(", whitelist_status=");
        r.append(this.whitelist_status);
        r.append(", access_type=");
        r.append(this.access_type);
        r.append(", quarantined=");
        r.append(this.quarantined);
        r.append(", nsfw=");
        r.append(this.nsfw);
        r.append(", topic_tag_ids=");
        r.append(this.topic_tag_ids);
        r.append(", topic_tag_contents=");
        r.append(this.topic_tag_contents);
        r.append(", topic_tag_types=");
        r.append(this.topic_tag_types);
        r.append(", number_coins=");
        r.append(this.number_coins);
        r.append(", public_description=");
        r.append(this.public_description);
        r.append(", post_difficulty_rating=");
        r.append(this.post_difficulty_rating);
        r.append(", topic_tag_primary_id=");
        r.append(this.topic_tag_primary_id);
        r.append(", subscriber_count=");
        r.append(this.subscriber_count);
        r.append("}");
        return r.toString();
    }
    
    public void write(final e e) throws IOException {
        Subreddit.ADAPTER.write(e, (Object)this);
    }
}
