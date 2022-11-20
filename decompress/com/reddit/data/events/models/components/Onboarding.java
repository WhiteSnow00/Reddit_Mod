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

public final class Onboarding
{
    public static final a<Onboarding, Builder> ADAPTER;
    public final String action_source;
    public final Long captcha_num_screens;
    public final String category_id;
    public final String category_name;
    public final Long category_position;
    public final Long end_timestamp;
    public final String id;
    public final Boolean is_similar_subreddit;
    public final String landing_page;
    public final Long number_subreddits;
    public final Long number_subreddits_selected;
    public final Boolean passed_captcha;
    public final Long personalized_subreddits;
    public final Boolean pre_selected;
    public final String process_notes;
    public final Boolean recommended_user_name;
    public final String semantic_version;
    public final List<String> similar_subreddits;
    public final Long start_timestamp;
    public final String subreddit_id;
    public final Boolean subreddit_is_selected;
    public final String subreddit_name;
    public final Long subreddit_position;
    public final Long subreddits_already_selected;
    public final List<String> subreddits_selected;
    public final Boolean successful;
    public final String user_name;
    public final Boolean valid_email_submitted;
    
    static {
        ADAPTER = (a)new OnboardingAdapter(null);
    }
    
    private Onboarding(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.action_source = Builder.access$200(builder);
        this.process_notes = Builder.access$300(builder);
        this.number_subreddits_selected = Builder.access$400(builder);
        final List access$500 = Builder.access$500(builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$500 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$500(builder));
        }
        this.subreddits_selected = unmodifiableList;
        this.user_name = Builder.access$600(builder);
        this.recommended_user_name = Builder.access$700(builder);
        this.start_timestamp = Builder.access$800(builder);
        this.end_timestamp = Builder.access$900(builder);
        this.category_position = Builder.access$1000(builder);
        this.category_name = Builder.access$1100(builder);
        this.subreddit_name = Builder.access$1200(builder);
        this.subreddit_position = Builder.access$1300(builder);
        this.subreddit_is_selected = Builder.access$1400(builder);
        this.subreddits_already_selected = Builder.access$1500(builder);
        this.successful = Builder.access$1600(builder);
        this.semantic_version = Builder.access$1700(builder);
        this.landing_page = Builder.access$1800(builder);
        this.valid_email_submitted = Builder.access$1900(builder);
        this.pre_selected = Builder.access$2000(builder);
        this.passed_captcha = Builder.access$2100(builder);
        this.captcha_num_screens = Builder.access$2200(builder);
        this.personalized_subreddits = Builder.access$2300(builder);
        List<String> unmodifiableList2;
        if (Builder.access$2400(builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Builder.access$2400(builder));
        }
        this.similar_subreddits = unmodifiableList2;
        this.number_subreddits = Builder.access$2500(builder);
        this.is_similar_subreddit = Builder.access$2600(builder);
        this.category_id = Builder.access$2700(builder);
        this.subreddit_id = Builder.access$2800(builder);
    }
    
    public Onboarding(final Builder builder, final Onboarding$1 object) {
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
        if (!(o instanceof Onboarding)) {
            return false;
        }
        final Onboarding onboarding = (Onboarding)o;
        final String id = this.id;
        final String id2 = onboarding.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String action_source = this.action_source;
            final String action_source2 = onboarding.action_source;
            if (action_source == action_source2 || (action_source != null && action_source.equals(action_source2))) {
                final String process_notes = this.process_notes;
                final String process_notes2 = onboarding.process_notes;
                if (process_notes == process_notes2 || (process_notes != null && process_notes.equals(process_notes2))) {
                    final Long number_subreddits_selected = this.number_subreddits_selected;
                    final Long number_subreddits_selected2 = onboarding.number_subreddits_selected;
                    if (number_subreddits_selected == number_subreddits_selected2 || (number_subreddits_selected != null && number_subreddits_selected.equals(number_subreddits_selected2))) {
                        final List<String> subreddits_selected = this.subreddits_selected;
                        final List<String> subreddits_selected2 = onboarding.subreddits_selected;
                        if (subreddits_selected == subreddits_selected2 || (subreddits_selected != null && subreddits_selected.equals(subreddits_selected2))) {
                            final String user_name = this.user_name;
                            final String user_name2 = onboarding.user_name;
                            if (user_name == user_name2 || (user_name != null && user_name.equals(user_name2))) {
                                final Boolean recommended_user_name = this.recommended_user_name;
                                final Boolean recommended_user_name2 = onboarding.recommended_user_name;
                                if (recommended_user_name == recommended_user_name2 || (recommended_user_name != null && recommended_user_name.equals(recommended_user_name2))) {
                                    final Long start_timestamp = this.start_timestamp;
                                    final Long start_timestamp2 = onboarding.start_timestamp;
                                    if (start_timestamp == start_timestamp2 || (start_timestamp != null && start_timestamp.equals(start_timestamp2))) {
                                        final Long end_timestamp = this.end_timestamp;
                                        final Long end_timestamp2 = onboarding.end_timestamp;
                                        if (end_timestamp == end_timestamp2 || (end_timestamp != null && end_timestamp.equals(end_timestamp2))) {
                                            final Long category_position = this.category_position;
                                            final Long category_position2 = onboarding.category_position;
                                            if (category_position == category_position2 || (category_position != null && category_position.equals(category_position2))) {
                                                final String category_name = this.category_name;
                                                final String category_name2 = onboarding.category_name;
                                                if (category_name == category_name2 || (category_name != null && category_name.equals(category_name2))) {
                                                    final String subreddit_name = this.subreddit_name;
                                                    final String subreddit_name2 = onboarding.subreddit_name;
                                                    if (subreddit_name == subreddit_name2 || (subreddit_name != null && subreddit_name.equals(subreddit_name2))) {
                                                        final Long subreddit_position = this.subreddit_position;
                                                        final Long subreddit_position2 = onboarding.subreddit_position;
                                                        if (subreddit_position == subreddit_position2 || (subreddit_position != null && subreddit_position.equals(subreddit_position2))) {
                                                            final Boolean subreddit_is_selected = this.subreddit_is_selected;
                                                            final Boolean subreddit_is_selected2 = onboarding.subreddit_is_selected;
                                                            if (subreddit_is_selected == subreddit_is_selected2 || (subreddit_is_selected != null && subreddit_is_selected.equals(subreddit_is_selected2))) {
                                                                final Long subreddits_already_selected = this.subreddits_already_selected;
                                                                final Long subreddits_already_selected2 = onboarding.subreddits_already_selected;
                                                                if (subreddits_already_selected == subreddits_already_selected2 || (subreddits_already_selected != null && subreddits_already_selected.equals(subreddits_already_selected2))) {
                                                                    final Boolean successful = this.successful;
                                                                    final Boolean successful2 = onboarding.successful;
                                                                    if (successful == successful2 || (successful != null && successful.equals(successful2))) {
                                                                        final String semantic_version = this.semantic_version;
                                                                        final String semantic_version2 = onboarding.semantic_version;
                                                                        if (semantic_version == semantic_version2 || (semantic_version != null && semantic_version.equals(semantic_version2))) {
                                                                            final String landing_page = this.landing_page;
                                                                            final String landing_page2 = onboarding.landing_page;
                                                                            if (landing_page == landing_page2 || (landing_page != null && landing_page.equals(landing_page2))) {
                                                                                final Boolean valid_email_submitted = this.valid_email_submitted;
                                                                                final Boolean valid_email_submitted2 = onboarding.valid_email_submitted;
                                                                                if (valid_email_submitted == valid_email_submitted2 || (valid_email_submitted != null && valid_email_submitted.equals(valid_email_submitted2))) {
                                                                                    final Boolean pre_selected = this.pre_selected;
                                                                                    final Boolean pre_selected2 = onboarding.pre_selected;
                                                                                    if (pre_selected == pre_selected2 || (pre_selected != null && pre_selected.equals(pre_selected2))) {
                                                                                        final Boolean passed_captcha = this.passed_captcha;
                                                                                        final Boolean passed_captcha2 = onboarding.passed_captcha;
                                                                                        if (passed_captcha == passed_captcha2 || (passed_captcha != null && passed_captcha.equals(passed_captcha2))) {
                                                                                            final Long captcha_num_screens = this.captcha_num_screens;
                                                                                            final Long captcha_num_screens2 = onboarding.captcha_num_screens;
                                                                                            if (captcha_num_screens == captcha_num_screens2 || (captcha_num_screens != null && captcha_num_screens.equals(captcha_num_screens2))) {
                                                                                                final Long personalized_subreddits = this.personalized_subreddits;
                                                                                                final Long personalized_subreddits2 = onboarding.personalized_subreddits;
                                                                                                if (personalized_subreddits == personalized_subreddits2 || (personalized_subreddits != null && personalized_subreddits.equals(personalized_subreddits2))) {
                                                                                                    final List<String> similar_subreddits = this.similar_subreddits;
                                                                                                    final List<String> similar_subreddits2 = onboarding.similar_subreddits;
                                                                                                    if (similar_subreddits == similar_subreddits2 || (similar_subreddits != null && similar_subreddits.equals(similar_subreddits2))) {
                                                                                                        final Long number_subreddits = this.number_subreddits;
                                                                                                        final Long number_subreddits2 = onboarding.number_subreddits;
                                                                                                        if (number_subreddits == number_subreddits2 || (number_subreddits != null && number_subreddits.equals(number_subreddits2))) {
                                                                                                            final Boolean is_similar_subreddit = this.is_similar_subreddit;
                                                                                                            final Boolean is_similar_subreddit2 = onboarding.is_similar_subreddit;
                                                                                                            if (is_similar_subreddit == is_similar_subreddit2 || (is_similar_subreddit != null && is_similar_subreddit.equals(is_similar_subreddit2))) {
                                                                                                                final String category_id = this.category_id;
                                                                                                                final String category_id2 = onboarding.category_id;
                                                                                                                if (category_id == category_id2 || (category_id != null && category_id.equals(category_id2))) {
                                                                                                                    final String subreddit_id = this.subreddit_id;
                                                                                                                    final String subreddit_id2 = onboarding.subreddit_id;
                                                                                                                    boolean b2 = b;
                                                                                                                    if (subreddit_id == subreddit_id2) {
                                                                                                                        return b2;
                                                                                                                    }
                                                                                                                    if (subreddit_id != null && subreddit_id.equals(subreddit_id2)) {
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
        final String action_source = this.action_source;
        int hashCode3;
        if (action_source == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = action_source.hashCode();
        }
        final String process_notes = this.process_notes;
        int hashCode4;
        if (process_notes == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = process_notes.hashCode();
        }
        final Long number_subreddits_selected = this.number_subreddits_selected;
        int hashCode5;
        if (number_subreddits_selected == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = number_subreddits_selected.hashCode();
        }
        final List<String> subreddits_selected = this.subreddits_selected;
        int hashCode6;
        if (subreddits_selected == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = subreddits_selected.hashCode();
        }
        final String user_name = this.user_name;
        int hashCode7;
        if (user_name == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = user_name.hashCode();
        }
        final Boolean recommended_user_name = this.recommended_user_name;
        int hashCode8;
        if (recommended_user_name == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = recommended_user_name.hashCode();
        }
        final Long start_timestamp = this.start_timestamp;
        int hashCode9;
        if (start_timestamp == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = start_timestamp.hashCode();
        }
        final Long end_timestamp = this.end_timestamp;
        int hashCode10;
        if (end_timestamp == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = end_timestamp.hashCode();
        }
        final Long category_position = this.category_position;
        int hashCode11;
        if (category_position == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = category_position.hashCode();
        }
        final String category_name = this.category_name;
        int hashCode12;
        if (category_name == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = category_name.hashCode();
        }
        final String subreddit_name = this.subreddit_name;
        int hashCode13;
        if (subreddit_name == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = subreddit_name.hashCode();
        }
        final Long subreddit_position = this.subreddit_position;
        int hashCode14;
        if (subreddit_position == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = subreddit_position.hashCode();
        }
        final Boolean subreddit_is_selected = this.subreddit_is_selected;
        int hashCode15;
        if (subreddit_is_selected == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = subreddit_is_selected.hashCode();
        }
        final Long subreddits_already_selected = this.subreddits_already_selected;
        int hashCode16;
        if (subreddits_already_selected == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = subreddits_already_selected.hashCode();
        }
        final Boolean successful = this.successful;
        int hashCode17;
        if (successful == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = successful.hashCode();
        }
        final String semantic_version = this.semantic_version;
        int hashCode18;
        if (semantic_version == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = semantic_version.hashCode();
        }
        final String landing_page = this.landing_page;
        int hashCode19;
        if (landing_page == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = landing_page.hashCode();
        }
        final Boolean valid_email_submitted = this.valid_email_submitted;
        int hashCode20;
        if (valid_email_submitted == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = valid_email_submitted.hashCode();
        }
        final Boolean pre_selected = this.pre_selected;
        int hashCode21;
        if (pre_selected == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = pre_selected.hashCode();
        }
        final Boolean passed_captcha = this.passed_captcha;
        int hashCode22;
        if (passed_captcha == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = passed_captcha.hashCode();
        }
        final Long captcha_num_screens = this.captcha_num_screens;
        int hashCode23;
        if (captcha_num_screens == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = captcha_num_screens.hashCode();
        }
        final Long personalized_subreddits = this.personalized_subreddits;
        int hashCode24;
        if (personalized_subreddits == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = personalized_subreddits.hashCode();
        }
        final List<String> similar_subreddits = this.similar_subreddits;
        int hashCode25;
        if (similar_subreddits == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = similar_subreddits.hashCode();
        }
        final Long number_subreddits = this.number_subreddits;
        int hashCode26;
        if (number_subreddits == null) {
            hashCode26 = 0;
        }
        else {
            hashCode26 = number_subreddits.hashCode();
        }
        final Boolean is_similar_subreddit = this.is_similar_subreddit;
        int hashCode27;
        if (is_similar_subreddit == null) {
            hashCode27 = 0;
        }
        else {
            hashCode27 = is_similar_subreddit.hashCode();
        }
        final String category_id = this.category_id;
        int hashCode28;
        if (category_id == null) {
            hashCode28 = 0;
        }
        else {
            hashCode28 = category_id.hashCode();
        }
        final String subreddit_id = this.subreddit_id;
        if (subreddit_id != null) {
            hashCode = subreddit_id.hashCode();
        }
        return ((((((((((((((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode18) * -2128831035 ^ hashCode19) * -2128831035 ^ hashCode20) * -2128831035 ^ hashCode21) * -2128831035 ^ hashCode22) * -2128831035 ^ hashCode23) * -2128831035 ^ hashCode24) * -2128831035 ^ hashCode25) * -2128831035 ^ hashCode26) * -2128831035 ^ hashCode27) * -2128831035 ^ hashCode28) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Onboarding{id=");
        t.append(this.id);
        t.append(", action_source=");
        t.append(this.action_source);
        t.append(", process_notes=");
        t.append(this.process_notes);
        t.append(", number_subreddits_selected=");
        t.append(this.number_subreddits_selected);
        t.append(", subreddits_selected=");
        t.append(this.subreddits_selected);
        t.append(", user_name=");
        t.append(this.user_name);
        t.append(", recommended_user_name=");
        t.append(this.recommended_user_name);
        t.append(", start_timestamp=");
        t.append(this.start_timestamp);
        t.append(", end_timestamp=");
        t.append(this.end_timestamp);
        t.append(", category_position=");
        t.append(this.category_position);
        t.append(", category_name=");
        t.append(this.category_name);
        t.append(", subreddit_name=");
        t.append(this.subreddit_name);
        t.append(", subreddit_position=");
        t.append(this.subreddit_position);
        t.append(", subreddit_is_selected=");
        t.append(this.subreddit_is_selected);
        t.append(", subreddits_already_selected=");
        t.append(this.subreddits_already_selected);
        t.append(", successful=");
        t.append(this.successful);
        t.append(", semantic_version=");
        t.append(this.semantic_version);
        t.append(", landing_page=");
        t.append(this.landing_page);
        t.append(", valid_email_submitted=");
        t.append(this.valid_email_submitted);
        t.append(", pre_selected=");
        t.append(this.pre_selected);
        t.append(", passed_captcha=");
        t.append(this.passed_captcha);
        t.append(", captcha_num_screens=");
        t.append(this.captcha_num_screens);
        t.append(", personalized_subreddits=");
        t.append(this.personalized_subreddits);
        t.append(", similar_subreddits=");
        t.append(this.similar_subreddits);
        t.append(", number_subreddits=");
        t.append(this.number_subreddits);
        t.append(", is_similar_subreddit=");
        t.append(this.is_similar_subreddit);
        t.append(", category_id=");
        t.append(this.category_id);
        t.append(", subreddit_id=");
        return ph0.a.f(t, this.subreddit_id, "}");
    }
    
    public void write(final e e) throws IOException {
        Onboarding.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Onboarding>
    {
        private String action_source;
        private Long captcha_num_screens;
        private String category_id;
        private String category_name;
        private Long category_position;
        private Long end_timestamp;
        private String id;
        private Boolean is_similar_subreddit;
        private String landing_page;
        private Long number_subreddits;
        private Long number_subreddits_selected;
        private Boolean passed_captcha;
        private Long personalized_subreddits;
        private Boolean pre_selected;
        private String process_notes;
        private Boolean recommended_user_name;
        private String semantic_version;
        private List<String> similar_subreddits;
        private Long start_timestamp;
        private String subreddit_id;
        private Boolean subreddit_is_selected;
        private String subreddit_name;
        private Long subreddit_position;
        private Long subreddits_already_selected;
        private List<String> subreddits_selected;
        private Boolean successful;
        private String user_name;
        private Boolean valid_email_submitted;
        
        public Builder() {
        }
        
        public Builder(final Onboarding onboarding) {
            this.id = onboarding.id;
            this.action_source = onboarding.action_source;
            this.process_notes = onboarding.process_notes;
            this.number_subreddits_selected = onboarding.number_subreddits_selected;
            this.subreddits_selected = onboarding.subreddits_selected;
            this.user_name = onboarding.user_name;
            this.recommended_user_name = onboarding.recommended_user_name;
            this.start_timestamp = onboarding.start_timestamp;
            this.end_timestamp = onboarding.end_timestamp;
            this.category_position = onboarding.category_position;
            this.category_name = onboarding.category_name;
            this.subreddit_name = onboarding.subreddit_name;
            this.subreddit_position = onboarding.subreddit_position;
            this.subreddit_is_selected = onboarding.subreddit_is_selected;
            this.subreddits_already_selected = onboarding.subreddits_already_selected;
            this.successful = onboarding.successful;
            this.semantic_version = onboarding.semantic_version;
            this.landing_page = onboarding.landing_page;
            this.valid_email_submitted = onboarding.valid_email_submitted;
            this.pre_selected = onboarding.pre_selected;
            this.passed_captcha = onboarding.passed_captcha;
            this.captcha_num_screens = onboarding.captcha_num_screens;
            this.personalized_subreddits = onboarding.personalized_subreddits;
            this.similar_subreddits = onboarding.similar_subreddits;
            this.number_subreddits = onboarding.number_subreddits;
            this.is_similar_subreddit = onboarding.is_similar_subreddit;
            this.category_id = onboarding.category_id;
            this.subreddit_id = onboarding.subreddit_id;
        }
        
        public static String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static Long access$1000(final Builder builder) {
            return builder.category_position;
        }
        
        public static String access$1100(final Builder builder) {
            return builder.category_name;
        }
        
        public static String access$1200(final Builder builder) {
            return builder.subreddit_name;
        }
        
        public static Long access$1300(final Builder builder) {
            return builder.subreddit_position;
        }
        
        public static Boolean access$1400(final Builder builder) {
            return builder.subreddit_is_selected;
        }
        
        public static Long access$1500(final Builder builder) {
            return builder.subreddits_already_selected;
        }
        
        public static Boolean access$1600(final Builder builder) {
            return builder.successful;
        }
        
        public static String access$1700(final Builder builder) {
            return builder.semantic_version;
        }
        
        public static String access$1800(final Builder builder) {
            return builder.landing_page;
        }
        
        public static Boolean access$1900(final Builder builder) {
            return builder.valid_email_submitted;
        }
        
        public static String access$200(final Builder builder) {
            return builder.action_source;
        }
        
        public static Boolean access$2000(final Builder builder) {
            return builder.pre_selected;
        }
        
        public static Boolean access$2100(final Builder builder) {
            return builder.passed_captcha;
        }
        
        public static Long access$2200(final Builder builder) {
            return builder.captcha_num_screens;
        }
        
        public static Long access$2300(final Builder builder) {
            return builder.personalized_subreddits;
        }
        
        public static List access$2400(final Builder builder) {
            return builder.similar_subreddits;
        }
        
        public static Long access$2500(final Builder builder) {
            return builder.number_subreddits;
        }
        
        public static Boolean access$2600(final Builder builder) {
            return builder.is_similar_subreddit;
        }
        
        public static String access$2700(final Builder builder) {
            return builder.category_id;
        }
        
        public static String access$2800(final Builder builder) {
            return builder.subreddit_id;
        }
        
        public static String access$300(final Builder builder) {
            return builder.process_notes;
        }
        
        public static Long access$400(final Builder builder) {
            return builder.number_subreddits_selected;
        }
        
        public static List access$500(final Builder builder) {
            return builder.subreddits_selected;
        }
        
        public static String access$600(final Builder builder) {
            return builder.user_name;
        }
        
        public static Boolean access$700(final Builder builder) {
            return builder.recommended_user_name;
        }
        
        public static Long access$800(final Builder builder) {
            return builder.start_timestamp;
        }
        
        public static Long access$900(final Builder builder) {
            return builder.end_timestamp;
        }
        
        public Builder action_source(final String action_source) {
            this.action_source = action_source;
            return this;
        }
        
        public Onboarding build() {
            return new Onboarding(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder captcha_num_screens(final Long captcha_num_screens) {
            this.captcha_num_screens = captcha_num_screens;
            return this;
        }
        
        public Builder category_id(final String category_id) {
            this.category_id = category_id;
            return this;
        }
        
        public Builder category_name(final String category_name) {
            this.category_name = category_name;
            return this;
        }
        
        public Builder category_position(final Long category_position) {
            this.category_position = category_position;
            return this;
        }
        
        public Builder end_timestamp(final Long end_timestamp) {
            this.end_timestamp = end_timestamp;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder is_similar_subreddit(final Boolean is_similar_subreddit) {
            this.is_similar_subreddit = is_similar_subreddit;
            return this;
        }
        
        public Builder landing_page(final String landing_page) {
            this.landing_page = landing_page;
            return this;
        }
        
        public Builder number_subreddits(final Long number_subreddits) {
            this.number_subreddits = number_subreddits;
            return this;
        }
        
        public Builder number_subreddits_selected(final Long number_subreddits_selected) {
            this.number_subreddits_selected = number_subreddits_selected;
            return this;
        }
        
        public Builder passed_captcha(final Boolean passed_captcha) {
            this.passed_captcha = passed_captcha;
            return this;
        }
        
        public Builder personalized_subreddits(final Long personalized_subreddits) {
            this.personalized_subreddits = personalized_subreddits;
            return this;
        }
        
        public Builder pre_selected(final Boolean pre_selected) {
            this.pre_selected = pre_selected;
            return this;
        }
        
        public Builder process_notes(final String process_notes) {
            this.process_notes = process_notes;
            return this;
        }
        
        public Builder recommended_user_name(final Boolean recommended_user_name) {
            this.recommended_user_name = recommended_user_name;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.action_source = null;
            this.process_notes = null;
            this.number_subreddits_selected = null;
            this.subreddits_selected = null;
            this.user_name = null;
            this.recommended_user_name = null;
            this.start_timestamp = null;
            this.end_timestamp = null;
            this.category_position = null;
            this.category_name = null;
            this.subreddit_name = null;
            this.subreddit_position = null;
            this.subreddit_is_selected = null;
            this.subreddits_already_selected = null;
            this.successful = null;
            this.semantic_version = null;
            this.landing_page = null;
            this.valid_email_submitted = null;
            this.pre_selected = null;
            this.passed_captcha = null;
            this.captcha_num_screens = null;
            this.personalized_subreddits = null;
            this.similar_subreddits = null;
            this.number_subreddits = null;
            this.is_similar_subreddit = null;
            this.category_id = null;
            this.subreddit_id = null;
        }
        
        public Builder semantic_version(final String semantic_version) {
            this.semantic_version = semantic_version;
            return this;
        }
        
        public Builder similar_subreddits(final List<String> similar_subreddits) {
            this.similar_subreddits = similar_subreddits;
            return this;
        }
        
        public Builder start_timestamp(final Long start_timestamp) {
            this.start_timestamp = start_timestamp;
            return this;
        }
        
        public Builder subreddit_id(final String subreddit_id) {
            this.subreddit_id = subreddit_id;
            return this;
        }
        
        public Builder subreddit_is_selected(final Boolean subreddit_is_selected) {
            this.subreddit_is_selected = subreddit_is_selected;
            return this;
        }
        
        public Builder subreddit_name(final String subreddit_name) {
            this.subreddit_name = subreddit_name;
            return this;
        }
        
        public Builder subreddit_position(final Long subreddit_position) {
            this.subreddit_position = subreddit_position;
            return this;
        }
        
        public Builder subreddits_already_selected(final Long subreddits_already_selected) {
            this.subreddits_already_selected = subreddits_already_selected;
            return this;
        }
        
        public Builder subreddits_selected(final List<String> subreddits_selected) {
            this.subreddits_selected = subreddits_selected;
            return this;
        }
        
        public Builder successful(final Boolean successful) {
            this.successful = successful;
            return this;
        }
        
        public Builder user_name(final String user_name) {
            this.user_name = user_name;
            return this;
        }
        
        public Builder valid_email_submitted(final Boolean valid_email_submitted) {
            this.valid_email_submitted = valid_email_submitted;
            return this;
        }
    }
    
    public static final class OnboardingAdapter implements a<Onboarding, Builder>
    {
        private OnboardingAdapter() {
        }
        
        public OnboardingAdapter(final Onboarding$1 object) {
            this();
        }
        
        public Onboarding read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Onboarding read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    final int n = 0;
                    int i = 0;
                    switch (b) {
                        default: {
                            ht.a.a(e, a);
                            break;
                        }
                        case 32: {
                            if (a == 11) {
                                builder.subreddit_id(e.F());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 31: {
                            if (a == 11) {
                                builder.category_id(e.F());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 30: {
                            if (a == 2) {
                                builder.is_similar_subreddit(e.b());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 29: {
                            if (a == 10) {
                                builder.number_subreddits(e.v());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 28: {
                            if (a == 15) {
                                c w;
                                ArrayList list;
                                for (w = e.w(), list = new ArrayList(w.b); i < w.b; i = k.f(e, list, i, 1)) {}
                                e.x();
                                builder.similar_subreddits((List<String>)list);
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 27: {
                            if (a == 10) {
                                builder.personalized_subreddits(e.v());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 26: {
                            if (a == 10) {
                                builder.captcha_num_screens(e.v());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 25: {
                            if (a == 2) {
                                builder.passed_captcha(e.b());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 24: {
                            if (a == 2) {
                                builder.pre_selected(e.b());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 23: {
                            if (a == 2) {
                                builder.valid_email_submitted(e.b());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 22: {
                            if (a == 11) {
                                builder.landing_page(e.F());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 21: {
                            if (a == 11) {
                                builder.semantic_version(e.F());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 20: {
                            if (a == 2) {
                                builder.successful(e.b());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 19: {
                            if (a == 10) {
                                builder.subreddits_already_selected(e.v());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 18: {
                            if (a == 2) {
                                builder.subreddit_is_selected(e.b());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 17: {
                            if (a == 10) {
                                builder.subreddit_position(e.v());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 16: {
                            if (a == 11) {
                                builder.subreddit_name(e.F());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 15: {
                            if (a == 11) {
                                builder.category_name(e.F());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 14: {
                            if (a == 10) {
                                builder.category_position(e.v());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 13: {
                            if (a == 10) {
                                builder.end_timestamp(e.v());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 12: {
                            if (a == 10) {
                                builder.start_timestamp(e.v());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 11: {
                            if (a == 2) {
                                builder.recommended_user_name(e.b());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 10: {
                            if (a == 11) {
                                builder.user_name(e.F());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 9: {
                            if (a == 15) {
                                final c w2 = e.w();
                                final ArrayList list2 = new ArrayList(w2.b);
                                for (int j = n; j < w2.b; j = k.f(e, list2, j, 1)) {}
                                e.x();
                                builder.subreddits_selected((List<String>)list2);
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 8: {
                            if (a == 10) {
                                builder.number_subreddits_selected(e.v());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 7: {
                            if (a == 11) {
                                builder.process_notes(e.F());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                        case 6: {
                            if (a == 11) {
                                builder.action_source(e.F());
                                break;
                            }
                            ht.a.a(e, a);
                            break;
                        }
                    }
                }
                else if (a == 11) {
                    builder.id(e.F());
                }
                else {
                    ht.a.a(e, a);
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
        
        public void write(final e e, final Onboarding onboarding) throws IOException {
            e.X();
            if (onboarding.id != null) {
                e.O(1, (byte)11);
                e.W(onboarding.id);
                e.P();
            }
            if (onboarding.action_source != null) {
                e.O(6, (byte)11);
                e.W(onboarding.action_source);
                e.P();
            }
            if (onboarding.process_notes != null) {
                e.O(7, (byte)11);
                e.W(onboarding.process_notes);
                e.P();
            }
            if (onboarding.number_subreddits_selected != null) {
                e.O(8, (byte)10);
                k.w(onboarding.number_subreddits_selected, e);
            }
            if (onboarding.subreddits_selected != null) {
                e.O(9, (byte)15);
                e.U((byte)11, onboarding.subreddits_selected.size());
                final Iterator<String> iterator = onboarding.subreddits_selected.iterator();
                while (iterator.hasNext()) {
                    e.W((String)iterator.next());
                }
                e.V();
                e.P();
            }
            if (onboarding.user_name != null) {
                e.O(10, (byte)11);
                e.W(onboarding.user_name);
                e.P();
            }
            if (onboarding.recommended_user_name != null) {
                e.O(11, (byte)2);
                android.support.v4.media.a.A(onboarding.recommended_user_name, e);
            }
            if (onboarding.start_timestamp != null) {
                e.O(12, (byte)10);
                k.w(onboarding.start_timestamp, e);
            }
            if (onboarding.end_timestamp != null) {
                e.O(13, (byte)10);
                k.w(onboarding.end_timestamp, e);
            }
            if (onboarding.category_position != null) {
                e.O(14, (byte)10);
                k.w(onboarding.category_position, e);
            }
            if (onboarding.category_name != null) {
                e.O(15, (byte)11);
                e.W(onboarding.category_name);
                e.P();
            }
            if (onboarding.subreddit_name != null) {
                e.O(16, (byte)11);
                e.W(onboarding.subreddit_name);
                e.P();
            }
            if (onboarding.subreddit_position != null) {
                e.O(17, (byte)10);
                k.w(onboarding.subreddit_position, e);
            }
            if (onboarding.subreddit_is_selected != null) {
                e.O(18, (byte)2);
                android.support.v4.media.a.A(onboarding.subreddit_is_selected, e);
            }
            if (onboarding.subreddits_already_selected != null) {
                e.O(19, (byte)10);
                k.w(onboarding.subreddits_already_selected, e);
            }
            if (onboarding.successful != null) {
                e.O(20, (byte)2);
                android.support.v4.media.a.A(onboarding.successful, e);
            }
            if (onboarding.semantic_version != null) {
                e.O(21, (byte)11);
                e.W(onboarding.semantic_version);
                e.P();
            }
            if (onboarding.landing_page != null) {
                e.O(22, (byte)11);
                e.W(onboarding.landing_page);
                e.P();
            }
            if (onboarding.valid_email_submitted != null) {
                e.O(23, (byte)2);
                android.support.v4.media.a.A(onboarding.valid_email_submitted, e);
            }
            if (onboarding.pre_selected != null) {
                e.O(24, (byte)2);
                android.support.v4.media.a.A(onboarding.pre_selected, e);
            }
            if (onboarding.passed_captcha != null) {
                e.O(25, (byte)2);
                android.support.v4.media.a.A(onboarding.passed_captcha, e);
            }
            if (onboarding.captcha_num_screens != null) {
                e.O(26, (byte)10);
                k.w(onboarding.captcha_num_screens, e);
            }
            if (onboarding.personalized_subreddits != null) {
                e.O(27, (byte)10);
                k.w(onboarding.personalized_subreddits, e);
            }
            if (onboarding.similar_subreddits != null) {
                e.O(28, (byte)15);
                e.U((byte)11, onboarding.similar_subreddits.size());
                final Iterator<String> iterator2 = onboarding.similar_subreddits.iterator();
                while (iterator2.hasNext()) {
                    e.W((String)iterator2.next());
                }
                e.V();
                e.P();
            }
            if (onboarding.number_subreddits != null) {
                e.O(29, (byte)10);
                k.w(onboarding.number_subreddits, e);
            }
            if (onboarding.is_similar_subreddit != null) {
                e.O(30, (byte)2);
                android.support.v4.media.a.A(onboarding.is_similar_subreddit, e);
            }
            if (onboarding.category_id != null) {
                e.O(31, (byte)11);
                e.W(onboarding.category_id);
                e.P();
            }
            if (onboarding.subreddit_id != null) {
                e.O(32, (byte)11);
                e.W(onboarding.subreddit_id);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Onboarding)o);
        }
    }
}
