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

public final class Post
{
    public static final a<Post, Builder> ADAPTER;
    public final Long age;
    public final Boolean archived;
    public final String author_id;
    public final String body_text;
    public final String comment_type;
    public final Long content_duration;
    public final Long created_timestamp;
    public final String crosspost_root_id;
    public final String domain;
    public final String flair;
    public final List<String> hvts;
    public final String id;
    public final String impression_id;
    public final Boolean is_automated;
    public final Boolean is_event;
    public final Boolean is_scheduled;
    public final String language;
    public final String language_source;
    public final Boolean nsfw;
    public final Long number_comments;
    public final Long number_gildings;
    public final Long number_posts_from_ad;
    public final Boolean original_content;
    public final Long post_set_count;
    public final Boolean promoted;
    public final String recommendation_source;
    public final String recommendation_source_subreddit_id;
    public final String recommendation_source_subreddit_name;
    public final Long score;
    public final Boolean spoiler;
    public final Long submit_scheduled_timestamp;
    public final String subreddit_id;
    public final String subreddit_name;
    public final String title;
    public final String top_awarded_type;
    public final String type;
    public final Double upvote_ratio;
    public final String url;
    public final Long views;
    
    static {
        ADAPTER = (a)new PostAdapter(null);
    }
    
    private Post(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.type = Builder.access$200(builder);
        this.title = Builder.access$300(builder);
        this.nsfw = Builder.access$400(builder);
        this.spoiler = Builder.access$500(builder);
        this.url = Builder.access$600(builder);
        this.domain = Builder.access$700(builder);
        this.body_text = Builder.access$800(builder);
        this.created_timestamp = Builder.access$900(builder);
        this.promoted = Builder.access$1000(builder);
        this.author_id = Builder.access$1100(builder);
        this.content_duration = Builder.access$1200(builder);
        this.archived = Builder.access$1300(builder);
        this.crosspost_root_id = Builder.access$1400(builder);
        this.number_gildings = Builder.access$1500(builder);
        this.original_content = Builder.access$1600(builder);
        this.flair = Builder.access$1700(builder);
        this.score = Builder.access$1800(builder);
        this.upvote_ratio = Builder.access$1900(builder);
        this.impression_id = Builder.access$2000(builder);
        this.number_posts_from_ad = Builder.access$2100(builder);
        this.is_event = Builder.access$2200(builder);
        this.is_scheduled = Builder.access$2300(builder);
        this.submit_scheduled_timestamp = Builder.access$2400(builder);
        this.is_automated = Builder.access$2500(builder);
        this.comment_type = Builder.access$2600(builder);
        this.number_comments = Builder.access$2700(builder);
        this.subreddit_id = Builder.access$2800(builder);
        this.subreddit_name = Builder.access$2900(builder);
        this.top_awarded_type = Builder.access$3000(builder);
        this.recommendation_source = Builder.access$3100(builder);
        this.recommendation_source_subreddit_id = Builder.access$3200(builder);
        this.recommendation_source_subreddit_name = Builder.access$3300(builder);
        List<String> unmodifiableList;
        if (Builder.access$3400(builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$3400(builder));
        }
        this.hvts = unmodifiableList;
        this.age = Builder.access$3500(builder);
        this.views = Builder.access$3600(builder);
        this.language = Builder.access$3700(builder);
        this.language_source = Builder.access$3800(builder);
        this.post_set_count = Builder.access$3900(builder);
    }
    
    public Post(final Builder builder, final Post$1 object) {
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
        if (!(o instanceof Post)) {
            return false;
        }
        final Post post = (Post)o;
        final String id = this.id;
        final String id2 = post.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String type = this.type;
            final String type2 = post.type;
            if (type == type2 || (type != null && type.equals(type2))) {
                final String title = this.title;
                final String title2 = post.title;
                if (title == title2 || (title != null && title.equals(title2))) {
                    final Boolean nsfw = this.nsfw;
                    final Boolean nsfw2 = post.nsfw;
                    if (nsfw == nsfw2 || (nsfw != null && nsfw.equals(nsfw2))) {
                        final Boolean spoiler = this.spoiler;
                        final Boolean spoiler2 = post.spoiler;
                        if (spoiler == spoiler2 || (spoiler != null && spoiler.equals(spoiler2))) {
                            final String url = this.url;
                            final String url2 = post.url;
                            if (url == url2 || (url != null && url.equals(url2))) {
                                final String domain = this.domain;
                                final String domain2 = post.domain;
                                if (domain == domain2 || (domain != null && domain.equals(domain2))) {
                                    final String body_text = this.body_text;
                                    final String body_text2 = post.body_text;
                                    if (body_text == body_text2 || (body_text != null && body_text.equals(body_text2))) {
                                        final Long created_timestamp = this.created_timestamp;
                                        final Long created_timestamp2 = post.created_timestamp;
                                        if (created_timestamp == created_timestamp2 || (created_timestamp != null && created_timestamp.equals(created_timestamp2))) {
                                            final Boolean promoted = this.promoted;
                                            final Boolean promoted2 = post.promoted;
                                            if (promoted == promoted2 || (promoted != null && promoted.equals(promoted2))) {
                                                final String author_id = this.author_id;
                                                final String author_id2 = post.author_id;
                                                if (author_id == author_id2 || (author_id != null && author_id.equals(author_id2))) {
                                                    final Long content_duration = this.content_duration;
                                                    final Long content_duration2 = post.content_duration;
                                                    if (content_duration == content_duration2 || (content_duration != null && content_duration.equals(content_duration2))) {
                                                        final Boolean archived = this.archived;
                                                        final Boolean archived2 = post.archived;
                                                        if (archived == archived2 || (archived != null && archived.equals(archived2))) {
                                                            final String crosspost_root_id = this.crosspost_root_id;
                                                            final String crosspost_root_id2 = post.crosspost_root_id;
                                                            if (crosspost_root_id == crosspost_root_id2 || (crosspost_root_id != null && crosspost_root_id.equals(crosspost_root_id2))) {
                                                                final Long number_gildings = this.number_gildings;
                                                                final Long number_gildings2 = post.number_gildings;
                                                                if (number_gildings == number_gildings2 || (number_gildings != null && number_gildings.equals(number_gildings2))) {
                                                                    final Boolean original_content = this.original_content;
                                                                    final Boolean original_content2 = post.original_content;
                                                                    if (original_content == original_content2 || (original_content != null && original_content.equals(original_content2))) {
                                                                        final String flair = this.flair;
                                                                        final String flair2 = post.flair;
                                                                        if (flair == flair2 || (flair != null && flair.equals(flair2))) {
                                                                            final Long score = this.score;
                                                                            final Long score2 = post.score;
                                                                            if (score == score2 || (score != null && score.equals(score2))) {
                                                                                final Double upvote_ratio = this.upvote_ratio;
                                                                                final Double upvote_ratio2 = post.upvote_ratio;
                                                                                if (upvote_ratio == upvote_ratio2 || (upvote_ratio != null && upvote_ratio.equals(upvote_ratio2))) {
                                                                                    final String impression_id = this.impression_id;
                                                                                    final String impression_id2 = post.impression_id;
                                                                                    if (impression_id == impression_id2 || (impression_id != null && impression_id.equals(impression_id2))) {
                                                                                        final Long number_posts_from_ad = this.number_posts_from_ad;
                                                                                        final Long number_posts_from_ad2 = post.number_posts_from_ad;
                                                                                        if (number_posts_from_ad == number_posts_from_ad2 || (number_posts_from_ad != null && number_posts_from_ad.equals(number_posts_from_ad2))) {
                                                                                            final Boolean is_event = this.is_event;
                                                                                            final Boolean is_event2 = post.is_event;
                                                                                            if (is_event == is_event2 || (is_event != null && is_event.equals(is_event2))) {
                                                                                                final Boolean is_scheduled = this.is_scheduled;
                                                                                                final Boolean is_scheduled2 = post.is_scheduled;
                                                                                                if (is_scheduled == is_scheduled2 || (is_scheduled != null && is_scheduled.equals(is_scheduled2))) {
                                                                                                    final Long submit_scheduled_timestamp = this.submit_scheduled_timestamp;
                                                                                                    final Long submit_scheduled_timestamp2 = post.submit_scheduled_timestamp;
                                                                                                    if (submit_scheduled_timestamp == submit_scheduled_timestamp2 || (submit_scheduled_timestamp != null && submit_scheduled_timestamp.equals(submit_scheduled_timestamp2))) {
                                                                                                        final Boolean is_automated = this.is_automated;
                                                                                                        final Boolean is_automated2 = post.is_automated;
                                                                                                        if (is_automated == is_automated2 || (is_automated != null && is_automated.equals(is_automated2))) {
                                                                                                            final String comment_type = this.comment_type;
                                                                                                            final String comment_type2 = post.comment_type;
                                                                                                            if (comment_type == comment_type2 || (comment_type != null && comment_type.equals(comment_type2))) {
                                                                                                                final Long number_comments = this.number_comments;
                                                                                                                final Long number_comments2 = post.number_comments;
                                                                                                                if (number_comments == number_comments2 || (number_comments != null && number_comments.equals(number_comments2))) {
                                                                                                                    final String subreddit_id = this.subreddit_id;
                                                                                                                    final String subreddit_id2 = post.subreddit_id;
                                                                                                                    if (subreddit_id == subreddit_id2 || (subreddit_id != null && subreddit_id.equals(subreddit_id2))) {
                                                                                                                        final String subreddit_name = this.subreddit_name;
                                                                                                                        final String subreddit_name2 = post.subreddit_name;
                                                                                                                        if (subreddit_name == subreddit_name2 || (subreddit_name != null && subreddit_name.equals(subreddit_name2))) {
                                                                                                                            final String top_awarded_type = this.top_awarded_type;
                                                                                                                            final String top_awarded_type2 = post.top_awarded_type;
                                                                                                                            if (top_awarded_type == top_awarded_type2 || (top_awarded_type != null && top_awarded_type.equals(top_awarded_type2))) {
                                                                                                                                final String recommendation_source = this.recommendation_source;
                                                                                                                                final String recommendation_source2 = post.recommendation_source;
                                                                                                                                if (recommendation_source == recommendation_source2 || (recommendation_source != null && recommendation_source.equals(recommendation_source2))) {
                                                                                                                                    final String recommendation_source_subreddit_id = this.recommendation_source_subreddit_id;
                                                                                                                                    final String recommendation_source_subreddit_id2 = post.recommendation_source_subreddit_id;
                                                                                                                                    if (recommendation_source_subreddit_id == recommendation_source_subreddit_id2 || (recommendation_source_subreddit_id != null && recommendation_source_subreddit_id.equals(recommendation_source_subreddit_id2))) {
                                                                                                                                        final String recommendation_source_subreddit_name = this.recommendation_source_subreddit_name;
                                                                                                                                        final String recommendation_source_subreddit_name2 = post.recommendation_source_subreddit_name;
                                                                                                                                        if (recommendation_source_subreddit_name == recommendation_source_subreddit_name2 || (recommendation_source_subreddit_name != null && recommendation_source_subreddit_name.equals(recommendation_source_subreddit_name2))) {
                                                                                                                                            final List<String> hvts = this.hvts;
                                                                                                                                            final List<String> hvts2 = post.hvts;
                                                                                                                                            if (hvts == hvts2 || (hvts != null && hvts.equals(hvts2))) {
                                                                                                                                                final Long age = this.age;
                                                                                                                                                final Long age2 = post.age;
                                                                                                                                                if (age == age2 || (age != null && age.equals(age2))) {
                                                                                                                                                    final Long views = this.views;
                                                                                                                                                    final Long views2 = post.views;
                                                                                                                                                    if (views == views2 || (views != null && views.equals(views2))) {
                                                                                                                                                        final String language = this.language;
                                                                                                                                                        final String language2 = post.language;
                                                                                                                                                        if (language == language2 || (language != null && language.equals(language2))) {
                                                                                                                                                            final String language_source = this.language_source;
                                                                                                                                                            final String language_source2 = post.language_source;
                                                                                                                                                            if (language_source == language_source2 || (language_source != null && language_source.equals(language_source2))) {
                                                                                                                                                                final Long post_set_count = this.post_set_count;
                                                                                                                                                                final Long post_set_count2 = post.post_set_count;
                                                                                                                                                                boolean b2 = b;
                                                                                                                                                                if (post_set_count == post_set_count2) {
                                                                                                                                                                    return b2;
                                                                                                                                                                }
                                                                                                                                                                if (post_set_count != null && post_set_count.equals(post_set_count2)) {
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
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String type = this.type;
        int hashCode3;
        if (type == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = type.hashCode();
        }
        final String title = this.title;
        int hashCode4;
        if (title == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = title.hashCode();
        }
        final Boolean nsfw = this.nsfw;
        int hashCode5;
        if (nsfw == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = nsfw.hashCode();
        }
        final Boolean spoiler = this.spoiler;
        int hashCode6;
        if (spoiler == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = spoiler.hashCode();
        }
        final String url = this.url;
        int hashCode7;
        if (url == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = url.hashCode();
        }
        final String domain = this.domain;
        int hashCode8;
        if (domain == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = domain.hashCode();
        }
        final String body_text = this.body_text;
        int hashCode9;
        if (body_text == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = body_text.hashCode();
        }
        final Long created_timestamp = this.created_timestamp;
        int hashCode10;
        if (created_timestamp == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = created_timestamp.hashCode();
        }
        final Boolean promoted = this.promoted;
        int hashCode11;
        if (promoted == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = promoted.hashCode();
        }
        final String author_id = this.author_id;
        int hashCode12;
        if (author_id == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = author_id.hashCode();
        }
        final Long content_duration = this.content_duration;
        int hashCode13;
        if (content_duration == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = content_duration.hashCode();
        }
        final Boolean archived = this.archived;
        int hashCode14;
        if (archived == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = archived.hashCode();
        }
        final String crosspost_root_id = this.crosspost_root_id;
        int hashCode15;
        if (crosspost_root_id == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = crosspost_root_id.hashCode();
        }
        final Long number_gildings = this.number_gildings;
        int hashCode16;
        if (number_gildings == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = number_gildings.hashCode();
        }
        final Boolean original_content = this.original_content;
        int hashCode17;
        if (original_content == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = original_content.hashCode();
        }
        final String flair = this.flair;
        int hashCode18;
        if (flair == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = flair.hashCode();
        }
        final Long score = this.score;
        int hashCode19;
        if (score == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = score.hashCode();
        }
        final Double upvote_ratio = this.upvote_ratio;
        int hashCode20;
        if (upvote_ratio == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = upvote_ratio.hashCode();
        }
        final String impression_id = this.impression_id;
        int hashCode21;
        if (impression_id == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = impression_id.hashCode();
        }
        final Long number_posts_from_ad = this.number_posts_from_ad;
        int hashCode22;
        if (number_posts_from_ad == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = number_posts_from_ad.hashCode();
        }
        final Boolean is_event = this.is_event;
        int hashCode23;
        if (is_event == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = is_event.hashCode();
        }
        final Boolean is_scheduled = this.is_scheduled;
        int hashCode24;
        if (is_scheduled == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = is_scheduled.hashCode();
        }
        final Long submit_scheduled_timestamp = this.submit_scheduled_timestamp;
        int hashCode25;
        if (submit_scheduled_timestamp == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = submit_scheduled_timestamp.hashCode();
        }
        final Boolean is_automated = this.is_automated;
        int hashCode26;
        if (is_automated == null) {
            hashCode26 = 0;
        }
        else {
            hashCode26 = is_automated.hashCode();
        }
        final String comment_type = this.comment_type;
        int hashCode27;
        if (comment_type == null) {
            hashCode27 = 0;
        }
        else {
            hashCode27 = comment_type.hashCode();
        }
        final Long number_comments = this.number_comments;
        int hashCode28;
        if (number_comments == null) {
            hashCode28 = 0;
        }
        else {
            hashCode28 = number_comments.hashCode();
        }
        final String subreddit_id = this.subreddit_id;
        int hashCode29;
        if (subreddit_id == null) {
            hashCode29 = 0;
        }
        else {
            hashCode29 = subreddit_id.hashCode();
        }
        final String subreddit_name = this.subreddit_name;
        int hashCode30;
        if (subreddit_name == null) {
            hashCode30 = 0;
        }
        else {
            hashCode30 = subreddit_name.hashCode();
        }
        final String top_awarded_type = this.top_awarded_type;
        int hashCode31;
        if (top_awarded_type == null) {
            hashCode31 = 0;
        }
        else {
            hashCode31 = top_awarded_type.hashCode();
        }
        final String recommendation_source = this.recommendation_source;
        int hashCode32;
        if (recommendation_source == null) {
            hashCode32 = 0;
        }
        else {
            hashCode32 = recommendation_source.hashCode();
        }
        final String recommendation_source_subreddit_id = this.recommendation_source_subreddit_id;
        int hashCode33;
        if (recommendation_source_subreddit_id == null) {
            hashCode33 = 0;
        }
        else {
            hashCode33 = recommendation_source_subreddit_id.hashCode();
        }
        final String recommendation_source_subreddit_name = this.recommendation_source_subreddit_name;
        int hashCode34;
        if (recommendation_source_subreddit_name == null) {
            hashCode34 = 0;
        }
        else {
            hashCode34 = recommendation_source_subreddit_name.hashCode();
        }
        final List<String> hvts = this.hvts;
        int hashCode35;
        if (hvts == null) {
            hashCode35 = 0;
        }
        else {
            hashCode35 = hvts.hashCode();
        }
        final Long age = this.age;
        int hashCode36;
        if (age == null) {
            hashCode36 = 0;
        }
        else {
            hashCode36 = age.hashCode();
        }
        final Long views = this.views;
        int hashCode37;
        if (views == null) {
            hashCode37 = 0;
        }
        else {
            hashCode37 = views.hashCode();
        }
        final String language = this.language;
        int hashCode38;
        if (language == null) {
            hashCode38 = 0;
        }
        else {
            hashCode38 = language.hashCode();
        }
        final String language_source = this.language_source;
        int hashCode39;
        if (language_source == null) {
            hashCode39 = 0;
        }
        else {
            hashCode39 = language_source.hashCode();
        }
        final Long post_set_count = this.post_set_count;
        if (post_set_count != null) {
            hashCode = post_set_count.hashCode();
        }
        return (((((((((((((((((((((((((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode18) * -2128831035 ^ hashCode19) * -2128831035 ^ hashCode20) * -2128831035 ^ hashCode21) * -2128831035 ^ hashCode22) * -2128831035 ^ hashCode23) * -2128831035 ^ hashCode24) * -2128831035 ^ hashCode25) * -2128831035 ^ hashCode26) * -2128831035 ^ hashCode27) * -2128831035 ^ hashCode28) * -2128831035 ^ hashCode29) * -2128831035 ^ hashCode30) * -2128831035 ^ hashCode31) * -2128831035 ^ hashCode32) * -2128831035 ^ hashCode33) * -2128831035 ^ hashCode34) * -2128831035 ^ hashCode35) * -2128831035 ^ hashCode36) * -2128831035 ^ hashCode37) * -2128831035 ^ hashCode38) * -2128831035 ^ hashCode39) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Post{id=");
        t.append(this.id);
        t.append(", type=");
        t.append(this.type);
        t.append(", title=");
        t.append(this.title);
        t.append(", nsfw=");
        t.append(this.nsfw);
        t.append(", spoiler=");
        t.append(this.spoiler);
        t.append(", url=");
        t.append(this.url);
        t.append(", domain=");
        t.append(this.domain);
        t.append(", body_text=");
        t.append(this.body_text);
        t.append(", created_timestamp=");
        t.append(this.created_timestamp);
        t.append(", promoted=");
        t.append(this.promoted);
        t.append(", author_id=");
        t.append(this.author_id);
        t.append(", content_duration=");
        t.append(this.content_duration);
        t.append(", archived=");
        t.append(this.archived);
        t.append(", crosspost_root_id=");
        t.append(this.crosspost_root_id);
        t.append(", number_gildings=");
        t.append(this.number_gildings);
        t.append(", original_content=");
        t.append(this.original_content);
        t.append(", flair=");
        t.append(this.flair);
        t.append(", score=");
        t.append(this.score);
        t.append(", upvote_ratio=");
        t.append(this.upvote_ratio);
        t.append(", impression_id=");
        t.append(this.impression_id);
        t.append(", number_posts_from_ad=");
        t.append(this.number_posts_from_ad);
        t.append(", is_event=");
        t.append(this.is_event);
        t.append(", is_scheduled=");
        t.append(this.is_scheduled);
        t.append(", submit_scheduled_timestamp=");
        t.append(this.submit_scheduled_timestamp);
        t.append(", is_automated=");
        t.append(this.is_automated);
        t.append(", comment_type=");
        t.append(this.comment_type);
        t.append(", number_comments=");
        t.append(this.number_comments);
        t.append(", subreddit_id=");
        t.append(this.subreddit_id);
        t.append(", subreddit_name=");
        t.append(this.subreddit_name);
        t.append(", top_awarded_type=");
        t.append(this.top_awarded_type);
        t.append(", recommendation_source=");
        t.append(this.recommendation_source);
        t.append(", recommendation_source_subreddit_id=");
        t.append(this.recommendation_source_subreddit_id);
        t.append(", recommendation_source_subreddit_name=");
        t.append(this.recommendation_source_subreddit_name);
        t.append(", hvts=");
        t.append(this.hvts);
        t.append(", age=");
        t.append(this.age);
        t.append(", views=");
        t.append(this.views);
        t.append(", language=");
        t.append(this.language);
        t.append(", language_source=");
        t.append(this.language_source);
        t.append(", post_set_count=");
        return d.l(t, this.post_set_count, "}");
    }
    
    public void write(final e e) throws IOException {
        Post.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Post>
    {
        private Long age;
        private Boolean archived;
        private String author_id;
        private String body_text;
        private String comment_type;
        private Long content_duration;
        private Long created_timestamp;
        private String crosspost_root_id;
        private String domain;
        private String flair;
        private List<String> hvts;
        private String id;
        private String impression_id;
        private Boolean is_automated;
        private Boolean is_event;
        private Boolean is_scheduled;
        private String language;
        private String language_source;
        private Boolean nsfw;
        private Long number_comments;
        private Long number_gildings;
        private Long number_posts_from_ad;
        private Boolean original_content;
        private Long post_set_count;
        private Boolean promoted;
        private String recommendation_source;
        private String recommendation_source_subreddit_id;
        private String recommendation_source_subreddit_name;
        private Long score;
        private Boolean spoiler;
        private Long submit_scheduled_timestamp;
        private String subreddit_id;
        private String subreddit_name;
        private String title;
        private String top_awarded_type;
        private String type;
        private Double upvote_ratio;
        private String url;
        private Long views;
        
        public Builder() {
        }
        
        public Builder(final Post post) {
            this.id = post.id;
            this.type = post.type;
            this.title = post.title;
            this.nsfw = post.nsfw;
            this.spoiler = post.spoiler;
            this.url = post.url;
            this.domain = post.domain;
            this.body_text = post.body_text;
            this.created_timestamp = post.created_timestamp;
            this.promoted = post.promoted;
            this.author_id = post.author_id;
            this.content_duration = post.content_duration;
            this.archived = post.archived;
            this.crosspost_root_id = post.crosspost_root_id;
            this.number_gildings = post.number_gildings;
            this.original_content = post.original_content;
            this.flair = post.flair;
            this.score = post.score;
            this.upvote_ratio = post.upvote_ratio;
            this.impression_id = post.impression_id;
            this.number_posts_from_ad = post.number_posts_from_ad;
            this.is_event = post.is_event;
            this.is_scheduled = post.is_scheduled;
            this.submit_scheduled_timestamp = post.submit_scheduled_timestamp;
            this.is_automated = post.is_automated;
            this.comment_type = post.comment_type;
            this.number_comments = post.number_comments;
            this.subreddit_id = post.subreddit_id;
            this.subreddit_name = post.subreddit_name;
            this.top_awarded_type = post.top_awarded_type;
            this.recommendation_source = post.recommendation_source;
            this.recommendation_source_subreddit_id = post.recommendation_source_subreddit_id;
            this.recommendation_source_subreddit_name = post.recommendation_source_subreddit_name;
            this.hvts = post.hvts;
            this.age = post.age;
            this.views = post.views;
            this.language = post.language;
            this.language_source = post.language_source;
            this.post_set_count = post.post_set_count;
        }
        
        public static String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static Boolean access$1000(final Builder builder) {
            return builder.promoted;
        }
        
        public static String access$1100(final Builder builder) {
            return builder.author_id;
        }
        
        public static Long access$1200(final Builder builder) {
            return builder.content_duration;
        }
        
        public static Boolean access$1300(final Builder builder) {
            return builder.archived;
        }
        
        public static String access$1400(final Builder builder) {
            return builder.crosspost_root_id;
        }
        
        public static Long access$1500(final Builder builder) {
            return builder.number_gildings;
        }
        
        public static Boolean access$1600(final Builder builder) {
            return builder.original_content;
        }
        
        public static String access$1700(final Builder builder) {
            return builder.flair;
        }
        
        public static Long access$1800(final Builder builder) {
            return builder.score;
        }
        
        public static Double access$1900(final Builder builder) {
            return builder.upvote_ratio;
        }
        
        public static String access$200(final Builder builder) {
            return builder.type;
        }
        
        public static String access$2000(final Builder builder) {
            return builder.impression_id;
        }
        
        public static Long access$2100(final Builder builder) {
            return builder.number_posts_from_ad;
        }
        
        public static Boolean access$2200(final Builder builder) {
            return builder.is_event;
        }
        
        public static Boolean access$2300(final Builder builder) {
            return builder.is_scheduled;
        }
        
        public static Long access$2400(final Builder builder) {
            return builder.submit_scheduled_timestamp;
        }
        
        public static Boolean access$2500(final Builder builder) {
            return builder.is_automated;
        }
        
        public static String access$2600(final Builder builder) {
            return builder.comment_type;
        }
        
        public static Long access$2700(final Builder builder) {
            return builder.number_comments;
        }
        
        public static String access$2800(final Builder builder) {
            return builder.subreddit_id;
        }
        
        public static String access$2900(final Builder builder) {
            return builder.subreddit_name;
        }
        
        public static String access$300(final Builder builder) {
            return builder.title;
        }
        
        public static String access$3000(final Builder builder) {
            return builder.top_awarded_type;
        }
        
        public static String access$3100(final Builder builder) {
            return builder.recommendation_source;
        }
        
        public static String access$3200(final Builder builder) {
            return builder.recommendation_source_subreddit_id;
        }
        
        public static String access$3300(final Builder builder) {
            return builder.recommendation_source_subreddit_name;
        }
        
        public static List access$3400(final Builder builder) {
            return builder.hvts;
        }
        
        public static Long access$3500(final Builder builder) {
            return builder.age;
        }
        
        public static Long access$3600(final Builder builder) {
            return builder.views;
        }
        
        public static String access$3700(final Builder builder) {
            return builder.language;
        }
        
        public static String access$3800(final Builder builder) {
            return builder.language_source;
        }
        
        public static Long access$3900(final Builder builder) {
            return builder.post_set_count;
        }
        
        public static Boolean access$400(final Builder builder) {
            return builder.nsfw;
        }
        
        public static Boolean access$500(final Builder builder) {
            return builder.spoiler;
        }
        
        public static String access$600(final Builder builder) {
            return builder.url;
        }
        
        public static String access$700(final Builder builder) {
            return builder.domain;
        }
        
        public static String access$800(final Builder builder) {
            return builder.body_text;
        }
        
        public static Long access$900(final Builder builder) {
            return builder.created_timestamp;
        }
        
        public Builder age(final Long age) {
            this.age = age;
            return this;
        }
        
        public Builder archived(final Boolean archived) {
            this.archived = archived;
            return this;
        }
        
        public Builder author_id(final String author_id) {
            this.author_id = author_id;
            return this;
        }
        
        public Builder body_text(final String body_text) {
            this.body_text = body_text;
            return this;
        }
        
        public Post build() {
            return new Post(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder comment_type(final String comment_type) {
            this.comment_type = comment_type;
            return this;
        }
        
        public Builder content_duration(final Long content_duration) {
            this.content_duration = content_duration;
            return this;
        }
        
        public Builder created_timestamp(final Long created_timestamp) {
            this.created_timestamp = created_timestamp;
            return this;
        }
        
        public Builder crosspost_root_id(final String crosspost_root_id) {
            this.crosspost_root_id = crosspost_root_id;
            return this;
        }
        
        public Builder domain(final String domain) {
            this.domain = domain;
            return this;
        }
        
        public Builder flair(final String flair) {
            this.flair = flair;
            return this;
        }
        
        public Builder hvts(final List<String> hvts) {
            this.hvts = hvts;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder impression_id(final String impression_id) {
            this.impression_id = impression_id;
            return this;
        }
        
        public Builder is_automated(final Boolean is_automated) {
            this.is_automated = is_automated;
            return this;
        }
        
        public Builder is_event(final Boolean is_event) {
            this.is_event = is_event;
            return this;
        }
        
        public Builder is_scheduled(final Boolean is_scheduled) {
            this.is_scheduled = is_scheduled;
            return this;
        }
        
        public Builder language(final String language) {
            this.language = language;
            return this;
        }
        
        public Builder language_source(final String language_source) {
            this.language_source = language_source;
            return this;
        }
        
        public Builder nsfw(final Boolean nsfw) {
            this.nsfw = nsfw;
            return this;
        }
        
        public Builder number_comments(final Long number_comments) {
            this.number_comments = number_comments;
            return this;
        }
        
        public Builder number_gildings(final Long number_gildings) {
            this.number_gildings = number_gildings;
            return this;
        }
        
        public Builder number_posts_from_ad(final Long number_posts_from_ad) {
            this.number_posts_from_ad = number_posts_from_ad;
            return this;
        }
        
        public Builder original_content(final Boolean original_content) {
            this.original_content = original_content;
            return this;
        }
        
        public Builder post_set_count(final Long post_set_count) {
            this.post_set_count = post_set_count;
            return this;
        }
        
        public Builder promoted(final Boolean promoted) {
            this.promoted = promoted;
            return this;
        }
        
        public Builder recommendation_source(final String recommendation_source) {
            this.recommendation_source = recommendation_source;
            return this;
        }
        
        public Builder recommendation_source_subreddit_id(final String recommendation_source_subreddit_id) {
            this.recommendation_source_subreddit_id = recommendation_source_subreddit_id;
            return this;
        }
        
        public Builder recommendation_source_subreddit_name(final String recommendation_source_subreddit_name) {
            this.recommendation_source_subreddit_name = recommendation_source_subreddit_name;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.type = null;
            this.title = null;
            this.nsfw = null;
            this.spoiler = null;
            this.url = null;
            this.domain = null;
            this.body_text = null;
            this.created_timestamp = null;
            this.promoted = null;
            this.author_id = null;
            this.content_duration = null;
            this.archived = null;
            this.crosspost_root_id = null;
            this.number_gildings = null;
            this.original_content = null;
            this.flair = null;
            this.score = null;
            this.upvote_ratio = null;
            this.impression_id = null;
            this.number_posts_from_ad = null;
            this.is_event = null;
            this.is_scheduled = null;
            this.submit_scheduled_timestamp = null;
            this.is_automated = null;
            this.comment_type = null;
            this.number_comments = null;
            this.subreddit_id = null;
            this.subreddit_name = null;
            this.top_awarded_type = null;
            this.recommendation_source = null;
            this.recommendation_source_subreddit_id = null;
            this.recommendation_source_subreddit_name = null;
            this.hvts = null;
            this.age = null;
            this.views = null;
            this.language = null;
            this.language_source = null;
            this.post_set_count = null;
        }
        
        public Builder score(final Long score) {
            this.score = score;
            return this;
        }
        
        public Builder spoiler(final Boolean spoiler) {
            this.spoiler = spoiler;
            return this;
        }
        
        public Builder submit_scheduled_timestamp(final Long submit_scheduled_timestamp) {
            this.submit_scheduled_timestamp = submit_scheduled_timestamp;
            return this;
        }
        
        public Builder subreddit_id(final String subreddit_id) {
            this.subreddit_id = subreddit_id;
            return this;
        }
        
        public Builder subreddit_name(final String subreddit_name) {
            this.subreddit_name = subreddit_name;
            return this;
        }
        
        public Builder title(final String title) {
            this.title = title;
            return this;
        }
        
        public Builder top_awarded_type(final String top_awarded_type) {
            this.top_awarded_type = top_awarded_type;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
        
        public Builder upvote_ratio(final Double upvote_ratio) {
            this.upvote_ratio = upvote_ratio;
            return this;
        }
        
        public Builder url(final String url) {
            this.url = url;
            return this;
        }
        
        public Builder views(final Long views) {
            this.views = views;
            return this;
        }
    }
    
    public static final class PostAdapter implements a<Post, Builder>
    {
        private PostAdapter() {
        }
        
        public PostAdapter(final Post$1 object) {
            this();
        }
        
        public Post read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Post read(final e e, final Builder builder) throws IOException {
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
                    case 39: {
                        if (a == 10) {
                            builder.post_set_count(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 38: {
                        if (a == 11) {
                            builder.language_source(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 37: {
                        if (a == 11) {
                            builder.language(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 36: {
                        if (a == 10) {
                            builder.views(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 35: {
                        if (a == 10) {
                            builder.age(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 34: {
                        if (a == 15) {
                            final c w = e.w();
                            final ArrayList list = new ArrayList(w.b);
                            for (int i = 0; i < w.b; i = k.f(e, list, i, 1)) {}
                            e.x();
                            builder.hvts((List<String>)list);
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 33: {
                        if (a == 11) {
                            builder.recommendation_source_subreddit_name(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 32: {
                        if (a == 11) {
                            builder.recommendation_source_subreddit_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 31: {
                        if (a == 11) {
                            builder.recommendation_source(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 30: {
                        if (a == 11) {
                            builder.top_awarded_type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 29: {
                        if (a == 11) {
                            builder.subreddit_name(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 28: {
                        if (a == 11) {
                            builder.subreddit_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 27: {
                        if (a == 10) {
                            builder.number_comments(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 26: {
                        if (a == 11) {
                            builder.comment_type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 25: {
                        if (a == 2) {
                            builder.is_automated(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 24: {
                        if (a == 10) {
                            builder.submit_scheduled_timestamp(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 23: {
                        if (a == 2) {
                            builder.is_scheduled(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 22: {
                        if (a == 2) {
                            builder.is_event(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 21: {
                        if (a == 10) {
                            builder.number_posts_from_ad(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 20: {
                        if (a == 11) {
                            builder.impression_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 19: {
                        if (a == 4) {
                            builder.upvote_ratio(e.h());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 18: {
                        if (a == 10) {
                            builder.score(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 17: {
                        if (a == 11) {
                            builder.flair(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 16: {
                        if (a == 2) {
                            builder.original_content(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 15: {
                        if (a == 10) {
                            builder.number_gildings(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 14: {
                        if (a == 11) {
                            builder.crosspost_root_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 2) {
                            builder.archived(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 10) {
                            builder.content_duration(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 11) {
                            builder.author_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 2) {
                            builder.promoted(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 10) {
                            builder.created_timestamp(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.body_text(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.domain(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.url(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 2) {
                            builder.spoiler(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 2) {
                            builder.nsfw(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.title(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.id(e.F());
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
        
        public void write(final e e, final Post post) throws IOException {
            e.X();
            if (post.id != null) {
                e.O(1, (byte)11);
                e.W(post.id);
                e.P();
            }
            if (post.type != null) {
                e.O(2, (byte)11);
                e.W(post.type);
                e.P();
            }
            if (post.title != null) {
                e.O(3, (byte)11);
                e.W(post.title);
                e.P();
            }
            if (post.nsfw != null) {
                e.O(4, (byte)2);
                android.support.v4.media.a.A(post.nsfw, e);
            }
            if (post.spoiler != null) {
                e.O(5, (byte)2);
                android.support.v4.media.a.A(post.spoiler, e);
            }
            if (post.url != null) {
                e.O(6, (byte)11);
                e.W(post.url);
                e.P();
            }
            if (post.domain != null) {
                e.O(7, (byte)11);
                e.W(post.domain);
                e.P();
            }
            if (post.body_text != null) {
                e.O(8, (byte)11);
                e.W(post.body_text);
                e.P();
            }
            if (post.created_timestamp != null) {
                e.O(9, (byte)10);
                k.w(post.created_timestamp, e);
            }
            if (post.promoted != null) {
                e.O(10, (byte)2);
                android.support.v4.media.a.A(post.promoted, e);
            }
            if (post.author_id != null) {
                e.O(11, (byte)11);
                e.W(post.author_id);
                e.P();
            }
            if (post.content_duration != null) {
                e.O(12, (byte)10);
                k.w(post.content_duration, e);
            }
            if (post.archived != null) {
                e.O(13, (byte)2);
                android.support.v4.media.a.A(post.archived, e);
            }
            if (post.crosspost_root_id != null) {
                e.O(14, (byte)11);
                e.W(post.crosspost_root_id);
                e.P();
            }
            if (post.number_gildings != null) {
                e.O(15, (byte)10);
                k.w(post.number_gildings, e);
            }
            if (post.original_content != null) {
                e.O(16, (byte)2);
                android.support.v4.media.a.A(post.original_content, e);
            }
            if (post.flair != null) {
                e.O(17, (byte)11);
                e.W(post.flair);
                e.P();
            }
            if (post.score != null) {
                e.O(18, (byte)10);
                k.w(post.score, e);
            }
            if (post.upvote_ratio != null) {
                e.O(19, (byte)4);
                d.z(post.upvote_ratio, e);
            }
            if (post.impression_id != null) {
                e.O(20, (byte)11);
                e.W(post.impression_id);
                e.P();
            }
            if (post.number_posts_from_ad != null) {
                e.O(21, (byte)10);
                k.w(post.number_posts_from_ad, e);
            }
            if (post.is_event != null) {
                e.O(22, (byte)2);
                android.support.v4.media.a.A(post.is_event, e);
            }
            if (post.is_scheduled != null) {
                e.O(23, (byte)2);
                android.support.v4.media.a.A(post.is_scheduled, e);
            }
            if (post.submit_scheduled_timestamp != null) {
                e.O(24, (byte)10);
                k.w(post.submit_scheduled_timestamp, e);
            }
            if (post.is_automated != null) {
                e.O(25, (byte)2);
                android.support.v4.media.a.A(post.is_automated, e);
            }
            if (post.comment_type != null) {
                e.O(26, (byte)11);
                e.W(post.comment_type);
                e.P();
            }
            if (post.number_comments != null) {
                e.O(27, (byte)10);
                k.w(post.number_comments, e);
            }
            if (post.subreddit_id != null) {
                e.O(28, (byte)11);
                e.W(post.subreddit_id);
                e.P();
            }
            if (post.subreddit_name != null) {
                e.O(29, (byte)11);
                e.W(post.subreddit_name);
                e.P();
            }
            if (post.top_awarded_type != null) {
                e.O(30, (byte)11);
                e.W(post.top_awarded_type);
                e.P();
            }
            if (post.recommendation_source != null) {
                e.O(31, (byte)11);
                e.W(post.recommendation_source);
                e.P();
            }
            if (post.recommendation_source_subreddit_id != null) {
                e.O(32, (byte)11);
                e.W(post.recommendation_source_subreddit_id);
                e.P();
            }
            if (post.recommendation_source_subreddit_name != null) {
                e.O(33, (byte)11);
                e.W(post.recommendation_source_subreddit_name);
                e.P();
            }
            if (post.hvts != null) {
                e.O(34, (byte)15);
                e.U((byte)11, post.hvts.size());
                final Iterator<String> iterator = post.hvts.iterator();
                while (iterator.hasNext()) {
                    e.W((String)iterator.next());
                }
                e.V();
                e.P();
            }
            if (post.age != null) {
                e.O(35, (byte)10);
                k.w(post.age, e);
            }
            if (post.views != null) {
                e.O(36, (byte)10);
                k.w(post.views, e);
            }
            if (post.language != null) {
                e.O(37, (byte)11);
                e.W(post.language);
                e.P();
            }
            if (post.language_source != null) {
                e.O(38, (byte)11);
                e.W(post.language_source);
                e.P();
            }
            if (post.post_set_count != null) {
                e.O(39, (byte)10);
                k.w(post.post_set_count, e);
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Post)o);
        }
    }
}
