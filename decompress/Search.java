// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import java.util.Collections;
import java.util.List;
import et.a;

public final class Search
{
    public static final a<Search, Search.Search$Builder> ADAPTER;
    public final List<String> author_names_filter;
    public final List<String> comment_ids;
    public final String custom_feed_id;
    public final String error_string;
    public final String filters;
    public final String impression_id;
    public final List<String> links;
    public final String meta_flair_id;
    public final String meta_flair_name;
    public final String model_responses;
    public final Boolean nsfw;
    public final String nsfw_reason;
    public final Long number_comments;
    public final Long number_links;
    public final Long number_subreddits;
    public final Long number_users;
    public final String origin_element;
    public final String origin_page_type;
    public final Boolean partial_results;
    public final String post_flair_name;
    public final String post_id;
    public final List<String> protocol_name;
    public final String query;
    public final String query_id;
    public final String range;
    public final String sort;
    public final String structure_type;
    public final String subreddit_id;
    public final List<String> subreddit_ids;
    public final String subreddit_name;
    public final String trends;
    public final Boolean typeahead_active;
    public final List<String> user_ids;
    
    static {
        ADAPTER = (a)new Search.Search$SearchAdapter((Search$1)null);
    }
    
    private Search(final Search.Search$Builder search$Builder) {
        this.query = Search.Search$Builder.access$100(search$Builder);
        this.sort = Search.Search$Builder.access$200(search$Builder);
        this.range = Search.Search$Builder.access$300(search$Builder);
        this.typeahead_active = Search.Search$Builder.access$400(search$Builder);
        this.subreddit_id = Search.Search$Builder.access$500(search$Builder);
        this.subreddit_name = Search.Search$Builder.access$600(search$Builder);
        this.post_flair_name = Search.Search$Builder.access$700(search$Builder);
        this.meta_flair_id = Search.Search$Builder.access$800(search$Builder);
        this.meta_flair_name = Search.Search$Builder.access$900(search$Builder);
        this.origin_page_type = Search.Search$Builder.access$1000(search$Builder);
        this.origin_element = Search.Search$Builder.access$1100(search$Builder);
        this.number_links = Search.Search$Builder.access$1200(search$Builder);
        final List access$1300 = Search.Search$Builder.access$1300(search$Builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$1300 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Search.Search$Builder.access$1300(search$Builder));
        }
        this.links = unmodifiableList;
        this.nsfw_reason = Search.Search$Builder.access$1400(search$Builder);
        this.structure_type = Search.Search$Builder.access$1500(search$Builder);
        this.query_id = Search.Search$Builder.access$1600(search$Builder);
        List<String> unmodifiableList2;
        if (Search.Search$Builder.access$1700(search$Builder) == null) {
            unmodifiableList2 = null;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Search.Search$Builder.access$1700(search$Builder));
        }
        this.subreddit_ids = unmodifiableList2;
        this.number_subreddits = Search.Search$Builder.access$1800(search$Builder);
        this.number_comments = Search.Search$Builder.access$1900(search$Builder);
        List<String> unmodifiableList3;
        if (Search.Search$Builder.access$2000(search$Builder) == null) {
            unmodifiableList3 = null;
        }
        else {
            unmodifiableList3 = Collections.unmodifiableList((List<? extends String>)Search.Search$Builder.access$2000(search$Builder));
        }
        this.comment_ids = unmodifiableList3;
        this.post_id = Search.Search$Builder.access$2100(search$Builder);
        List<String> unmodifiableList4;
        if (Search.Search$Builder.access$2200(search$Builder) == null) {
            unmodifiableList4 = null;
        }
        else {
            unmodifiableList4 = Collections.unmodifiableList((List<? extends String>)Search.Search$Builder.access$2200(search$Builder));
        }
        this.author_names_filter = unmodifiableList4;
        List<String> unmodifiableList5;
        if (Search.Search$Builder.access$2300(search$Builder) == null) {
            unmodifiableList5 = null;
        }
        else {
            unmodifiableList5 = Collections.unmodifiableList((List<? extends String>)Search.Search$Builder.access$2300(search$Builder));
        }
        this.user_ids = unmodifiableList5;
        this.number_users = Search.Search$Builder.access$2400(search$Builder);
        List<String> unmodifiableList6;
        if (Search.Search$Builder.access$2500(search$Builder) == null) {
            unmodifiableList6 = list;
        }
        else {
            unmodifiableList6 = Collections.unmodifiableList((List<? extends String>)Search.Search$Builder.access$2500(search$Builder));
        }
        this.protocol_name = unmodifiableList6;
        this.partial_results = Search.Search$Builder.access$2600(search$Builder);
        this.nsfw = Search.Search$Builder.access$2700(search$Builder);
        this.impression_id = Search.Search$Builder.access$2800(search$Builder);
        this.filters = Search.Search$Builder.access$2900(search$Builder);
        this.error_string = Search.Search$Builder.access$3000(search$Builder);
        this.trends = Search.Search$Builder.access$3100(search$Builder);
        this.custom_feed_id = Search.Search$Builder.access$3200(search$Builder);
        this.model_responses = Search.Search$Builder.access$3300(search$Builder);
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
        if (!(o instanceof Search)) {
            return false;
        }
        final Search search = (Search)o;
        final String query = this.query;
        final String query2 = search.query;
        if (query == query2 || (query != null && query.equals(query2))) {
            final String sort = this.sort;
            final String sort2 = search.sort;
            if (sort == sort2 || (sort != null && sort.equals(sort2))) {
                final String range = this.range;
                final String range2 = search.range;
                if (range == range2 || (range != null && range.equals(range2))) {
                    final Boolean typeahead_active = this.typeahead_active;
                    final Boolean typeahead_active2 = search.typeahead_active;
                    if (typeahead_active == typeahead_active2 || (typeahead_active != null && typeahead_active.equals(typeahead_active2))) {
                        final String subreddit_id = this.subreddit_id;
                        final String subreddit_id2 = search.subreddit_id;
                        if (subreddit_id == subreddit_id2 || (subreddit_id != null && subreddit_id.equals(subreddit_id2))) {
                            final String subreddit_name = this.subreddit_name;
                            final String subreddit_name2 = search.subreddit_name;
                            if (subreddit_name == subreddit_name2 || (subreddit_name != null && subreddit_name.equals(subreddit_name2))) {
                                final String post_flair_name = this.post_flair_name;
                                final String post_flair_name2 = search.post_flair_name;
                                if (post_flair_name == post_flair_name2 || (post_flair_name != null && post_flair_name.equals(post_flair_name2))) {
                                    final String meta_flair_id = this.meta_flair_id;
                                    final String meta_flair_id2 = search.meta_flair_id;
                                    if (meta_flair_id == meta_flair_id2 || (meta_flair_id != null && meta_flair_id.equals(meta_flair_id2))) {
                                        final String meta_flair_name = this.meta_flair_name;
                                        final String meta_flair_name2 = search.meta_flair_name;
                                        if (meta_flair_name == meta_flair_name2 || (meta_flair_name != null && meta_flair_name.equals(meta_flair_name2))) {
                                            final String origin_page_type = this.origin_page_type;
                                            final String origin_page_type2 = search.origin_page_type;
                                            if (origin_page_type == origin_page_type2 || (origin_page_type != null && origin_page_type.equals(origin_page_type2))) {
                                                final String origin_element = this.origin_element;
                                                final String origin_element2 = search.origin_element;
                                                if (origin_element == origin_element2 || (origin_element != null && origin_element.equals(origin_element2))) {
                                                    final Long number_links = this.number_links;
                                                    final Long number_links2 = search.number_links;
                                                    if (number_links == number_links2 || (number_links != null && number_links.equals(number_links2))) {
                                                        final List<String> links = this.links;
                                                        final List<String> links2 = search.links;
                                                        if (links == links2 || (links != null && links.equals(links2))) {
                                                            final String nsfw_reason = this.nsfw_reason;
                                                            final String nsfw_reason2 = search.nsfw_reason;
                                                            if (nsfw_reason == nsfw_reason2 || (nsfw_reason != null && nsfw_reason.equals(nsfw_reason2))) {
                                                                final String structure_type = this.structure_type;
                                                                final String structure_type2 = search.structure_type;
                                                                if (structure_type == structure_type2 || (structure_type != null && structure_type.equals(structure_type2))) {
                                                                    final String query_id = this.query_id;
                                                                    final String query_id2 = search.query_id;
                                                                    if (query_id == query_id2 || (query_id != null && query_id.equals(query_id2))) {
                                                                        final List<String> subreddit_ids = this.subreddit_ids;
                                                                        final List<String> subreddit_ids2 = search.subreddit_ids;
                                                                        if (subreddit_ids == subreddit_ids2 || (subreddit_ids != null && subreddit_ids.equals(subreddit_ids2))) {
                                                                            final Long number_subreddits = this.number_subreddits;
                                                                            final Long number_subreddits2 = search.number_subreddits;
                                                                            if (number_subreddits == number_subreddits2 || (number_subreddits != null && number_subreddits.equals(number_subreddits2))) {
                                                                                final Long number_comments = this.number_comments;
                                                                                final Long number_comments2 = search.number_comments;
                                                                                if (number_comments == number_comments2 || (number_comments != null && number_comments.equals(number_comments2))) {
                                                                                    final List<String> comment_ids = this.comment_ids;
                                                                                    final List<String> comment_ids2 = search.comment_ids;
                                                                                    if (comment_ids == comment_ids2 || (comment_ids != null && comment_ids.equals(comment_ids2))) {
                                                                                        final String post_id = this.post_id;
                                                                                        final String post_id2 = search.post_id;
                                                                                        if (post_id == post_id2 || (post_id != null && post_id.equals(post_id2))) {
                                                                                            final List<String> author_names_filter = this.author_names_filter;
                                                                                            final List<String> author_names_filter2 = search.author_names_filter;
                                                                                            if (author_names_filter == author_names_filter2 || (author_names_filter != null && author_names_filter.equals(author_names_filter2))) {
                                                                                                final List<String> user_ids = this.user_ids;
                                                                                                final List<String> user_ids2 = search.user_ids;
                                                                                                if (user_ids == user_ids2 || (user_ids != null && user_ids.equals(user_ids2))) {
                                                                                                    final Long number_users = this.number_users;
                                                                                                    final Long number_users2 = search.number_users;
                                                                                                    if (number_users == number_users2 || (number_users != null && number_users.equals(number_users2))) {
                                                                                                        final List<String> protocol_name = this.protocol_name;
                                                                                                        final List<String> protocol_name2 = search.protocol_name;
                                                                                                        if (protocol_name == protocol_name2 || (protocol_name != null && protocol_name.equals(protocol_name2))) {
                                                                                                            final Boolean partial_results = this.partial_results;
                                                                                                            final Boolean partial_results2 = search.partial_results;
                                                                                                            if (partial_results == partial_results2 || (partial_results != null && partial_results.equals(partial_results2))) {
                                                                                                                final Boolean nsfw = this.nsfw;
                                                                                                                final Boolean nsfw2 = search.nsfw;
                                                                                                                if (nsfw == nsfw2 || (nsfw != null && nsfw.equals(nsfw2))) {
                                                                                                                    final String impression_id = this.impression_id;
                                                                                                                    final String impression_id2 = search.impression_id;
                                                                                                                    if (impression_id == impression_id2 || (impression_id != null && impression_id.equals(impression_id2))) {
                                                                                                                        final String filters = this.filters;
                                                                                                                        final String filters2 = search.filters;
                                                                                                                        if (filters == filters2 || (filters != null && filters.equals(filters2))) {
                                                                                                                            final String error_string = this.error_string;
                                                                                                                            final String error_string2 = search.error_string;
                                                                                                                            if (error_string == error_string2 || (error_string != null && error_string.equals(error_string2))) {
                                                                                                                                final String trends = this.trends;
                                                                                                                                final String trends2 = search.trends;
                                                                                                                                if (trends == trends2 || (trends != null && trends.equals(trends2))) {
                                                                                                                                    final String custom_feed_id = this.custom_feed_id;
                                                                                                                                    final String custom_feed_id2 = search.custom_feed_id;
                                                                                                                                    if (custom_feed_id == custom_feed_id2 || (custom_feed_id != null && custom_feed_id.equals(custom_feed_id2))) {
                                                                                                                                        final String model_responses = this.model_responses;
                                                                                                                                        final String model_responses2 = search.model_responses;
                                                                                                                                        boolean b2 = b;
                                                                                                                                        if (model_responses == model_responses2) {
                                                                                                                                            return b2;
                                                                                                                                        }
                                                                                                                                        if (model_responses != null && model_responses.equals(model_responses2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final String query = this.query;
        int hashCode = 0;
        int hashCode2;
        if (query == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = query.hashCode();
        }
        final String sort = this.sort;
        int hashCode3;
        if (sort == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = sort.hashCode();
        }
        final String range = this.range;
        int hashCode4;
        if (range == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = range.hashCode();
        }
        final Boolean typeahead_active = this.typeahead_active;
        int hashCode5;
        if (typeahead_active == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = typeahead_active.hashCode();
        }
        final String subreddit_id = this.subreddit_id;
        int hashCode6;
        if (subreddit_id == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = subreddit_id.hashCode();
        }
        final String subreddit_name = this.subreddit_name;
        int hashCode7;
        if (subreddit_name == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = subreddit_name.hashCode();
        }
        final String post_flair_name = this.post_flair_name;
        int hashCode8;
        if (post_flair_name == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = post_flair_name.hashCode();
        }
        final String meta_flair_id = this.meta_flair_id;
        int hashCode9;
        if (meta_flair_id == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = meta_flair_id.hashCode();
        }
        final String meta_flair_name = this.meta_flair_name;
        int hashCode10;
        if (meta_flair_name == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = meta_flair_name.hashCode();
        }
        final String origin_page_type = this.origin_page_type;
        int hashCode11;
        if (origin_page_type == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = origin_page_type.hashCode();
        }
        final String origin_element = this.origin_element;
        int hashCode12;
        if (origin_element == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = origin_element.hashCode();
        }
        final Long number_links = this.number_links;
        int hashCode13;
        if (number_links == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = number_links.hashCode();
        }
        final List<String> links = this.links;
        int hashCode14;
        if (links == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = links.hashCode();
        }
        final String nsfw_reason = this.nsfw_reason;
        int hashCode15;
        if (nsfw_reason == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = nsfw_reason.hashCode();
        }
        final String structure_type = this.structure_type;
        int hashCode16;
        if (structure_type == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = structure_type.hashCode();
        }
        final String query_id = this.query_id;
        int hashCode17;
        if (query_id == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = query_id.hashCode();
        }
        final List<String> subreddit_ids = this.subreddit_ids;
        int hashCode18;
        if (subreddit_ids == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = subreddit_ids.hashCode();
        }
        final Long number_subreddits = this.number_subreddits;
        int hashCode19;
        if (number_subreddits == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = number_subreddits.hashCode();
        }
        final Long number_comments = this.number_comments;
        int hashCode20;
        if (number_comments == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = number_comments.hashCode();
        }
        final List<String> comment_ids = this.comment_ids;
        int hashCode21;
        if (comment_ids == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = comment_ids.hashCode();
        }
        final String post_id = this.post_id;
        int hashCode22;
        if (post_id == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = post_id.hashCode();
        }
        final List<String> author_names_filter = this.author_names_filter;
        int hashCode23;
        if (author_names_filter == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = author_names_filter.hashCode();
        }
        final List<String> user_ids = this.user_ids;
        int hashCode24;
        if (user_ids == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = user_ids.hashCode();
        }
        final Long number_users = this.number_users;
        int hashCode25;
        if (number_users == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = number_users.hashCode();
        }
        final List<String> protocol_name = this.protocol_name;
        int hashCode26;
        if (protocol_name == null) {
            hashCode26 = 0;
        }
        else {
            hashCode26 = protocol_name.hashCode();
        }
        final Boolean partial_results = this.partial_results;
        int hashCode27;
        if (partial_results == null) {
            hashCode27 = 0;
        }
        else {
            hashCode27 = partial_results.hashCode();
        }
        final Boolean nsfw = this.nsfw;
        int hashCode28;
        if (nsfw == null) {
            hashCode28 = 0;
        }
        else {
            hashCode28 = nsfw.hashCode();
        }
        final String impression_id = this.impression_id;
        int hashCode29;
        if (impression_id == null) {
            hashCode29 = 0;
        }
        else {
            hashCode29 = impression_id.hashCode();
        }
        final String filters = this.filters;
        int hashCode30;
        if (filters == null) {
            hashCode30 = 0;
        }
        else {
            hashCode30 = filters.hashCode();
        }
        final String error_string = this.error_string;
        int hashCode31;
        if (error_string == null) {
            hashCode31 = 0;
        }
        else {
            hashCode31 = error_string.hashCode();
        }
        final String trends = this.trends;
        int hashCode32;
        if (trends == null) {
            hashCode32 = 0;
        }
        else {
            hashCode32 = trends.hashCode();
        }
        final String custom_feed_id = this.custom_feed_id;
        int hashCode33;
        if (custom_feed_id == null) {
            hashCode33 = 0;
        }
        else {
            hashCode33 = custom_feed_id.hashCode();
        }
        final String model_responses = this.model_responses;
        if (model_responses != null) {
            hashCode = model_responses.hashCode();
        }
        return (((((((((((((((((((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode18) * -2128831035 ^ hashCode19) * -2128831035 ^ hashCode20) * -2128831035 ^ hashCode21) * -2128831035 ^ hashCode22) * -2128831035 ^ hashCode23) * -2128831035 ^ hashCode24) * -2128831035 ^ hashCode25) * -2128831035 ^ hashCode26) * -2128831035 ^ hashCode27) * -2128831035 ^ hashCode28) * -2128831035 ^ hashCode29) * -2128831035 ^ hashCode30) * -2128831035 ^ hashCode31) * -2128831035 ^ hashCode32) * -2128831035 ^ hashCode33) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Search{query=");
        r.append(this.query);
        r.append(", sort=");
        r.append(this.sort);
        r.append(", range=");
        r.append(this.range);
        r.append(", typeahead_active=");
        r.append(this.typeahead_active);
        r.append(", subreddit_id=");
        r.append(this.subreddit_id);
        r.append(", subreddit_name=");
        r.append(this.subreddit_name);
        r.append(", post_flair_name=");
        r.append(this.post_flair_name);
        r.append(", meta_flair_id=");
        r.append(this.meta_flair_id);
        r.append(", meta_flair_name=");
        r.append(this.meta_flair_name);
        r.append(", origin_page_type=");
        r.append(this.origin_page_type);
        r.append(", origin_element=");
        r.append(this.origin_element);
        r.append(", number_links=");
        r.append(this.number_links);
        r.append(", links=");
        r.append(this.links);
        r.append(", nsfw_reason=");
        r.append(this.nsfw_reason);
        r.append(", structure_type=");
        r.append(this.structure_type);
        r.append(", query_id=");
        r.append(this.query_id);
        r.append(", subreddit_ids=");
        r.append(this.subreddit_ids);
        r.append(", number_subreddits=");
        r.append(this.number_subreddits);
        r.append(", number_comments=");
        r.append(this.number_comments);
        r.append(", comment_ids=");
        r.append(this.comment_ids);
        r.append(", post_id=");
        r.append(this.post_id);
        r.append(", author_names_filter=");
        r.append(this.author_names_filter);
        r.append(", user_ids=");
        r.append(this.user_ids);
        r.append(", number_users=");
        r.append(this.number_users);
        r.append(", protocol_name=");
        r.append(this.protocol_name);
        r.append(", partial_results=");
        r.append(this.partial_results);
        r.append(", nsfw=");
        r.append(this.nsfw);
        r.append(", impression_id=");
        r.append(this.impression_id);
        r.append(", filters=");
        r.append(this.filters);
        r.append(", error_string=");
        r.append(this.error_string);
        r.append(", trends=");
        r.append(this.trends);
        r.append(", custom_feed_id=");
        r.append(this.custom_feed_id);
        r.append(", model_responses=");
        return a.o(r, this.model_responses, "}");
    }
    
    public void write(final e e) throws IOException {
        Search.ADAPTER.write(e, (Object)this);
    }
}
