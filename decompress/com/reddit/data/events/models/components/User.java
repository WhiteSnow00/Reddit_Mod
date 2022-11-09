// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class User
{
    public static final a<User, Builder> ADAPTER;
    public final Long comment_karma;
    public final Long cookie_created_timestamp;
    public final String country_code;
    public final Long created_timestamp;
    public final Boolean disenfranchised;
    public final String email;
    public final String email_domain;
    public final Boolean has_premium;
    public final String id;
    public final Boolean in_timeout;
    public final Boolean is_admin;
    public final Boolean is_employee;
    public final Boolean is_premium_subscriber;
    public final Boolean logged_in;
    public final String masked_email;
    public final String masked_email_user;
    public final String name;
    public final Boolean neutered;
    public final Long number_coins;
    public final Long number_creddits;
    public final Long number_premium_days_remaining;
    public final Long post_karma;
    public final String premium_state;
    public final String previous_id;
    public final Boolean suspect;
    
    static {
        ADAPTER = (a)new UserAdapter(null);
    }
    
    private User(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.created_timestamp = Builder.access$200(builder);
        this.logged_in = Builder.access$300(builder);
        this.cookie_created_timestamp = Builder.access$400(builder);
        this.suspect = Builder.access$500(builder);
        this.disenfranchised = Builder.access$600(builder);
        this.in_timeout = Builder.access$700(builder);
        this.neutered = Builder.access$800(builder);
        this.number_creddits = Builder.access$900(builder);
        this.is_admin = Builder.access$1000(builder);
        this.has_premium = Builder.access$1100(builder);
        this.number_coins = Builder.access$1200(builder);
        this.number_premium_days_remaining = Builder.access$1300(builder);
        this.is_employee = Builder.access$1400(builder);
        this.is_premium_subscriber = Builder.access$1500(builder);
        this.post_karma = Builder.access$1600(builder);
        this.comment_karma = Builder.access$1700(builder);
        this.name = Builder.access$1800(builder);
        this.email = Builder.access$1900(builder);
        this.previous_id = Builder.access$2000(builder);
        this.masked_email = Builder.access$2100(builder);
        this.masked_email_user = Builder.access$2200(builder);
        this.email_domain = Builder.access$2300(builder);
        this.premium_state = Builder.access$2400(builder);
        this.country_code = Builder.access$2500(builder);
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
        if (!(o instanceof User)) {
            return false;
        }
        final User user = (User)o;
        final String id = this.id;
        final String id2 = user.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final Long created_timestamp = this.created_timestamp;
            final Long created_timestamp2 = user.created_timestamp;
            if (created_timestamp == created_timestamp2 || (created_timestamp != null && created_timestamp.equals(created_timestamp2))) {
                final Boolean logged_in = this.logged_in;
                final Boolean logged_in2 = user.logged_in;
                if (logged_in == logged_in2 || (logged_in != null && logged_in.equals(logged_in2))) {
                    final Long cookie_created_timestamp = this.cookie_created_timestamp;
                    final Long cookie_created_timestamp2 = user.cookie_created_timestamp;
                    if (cookie_created_timestamp == cookie_created_timestamp2 || (cookie_created_timestamp != null && cookie_created_timestamp.equals(cookie_created_timestamp2))) {
                        final Boolean suspect = this.suspect;
                        final Boolean suspect2 = user.suspect;
                        if (suspect == suspect2 || (suspect != null && suspect.equals(suspect2))) {
                            final Boolean disenfranchised = this.disenfranchised;
                            final Boolean disenfranchised2 = user.disenfranchised;
                            if (disenfranchised == disenfranchised2 || (disenfranchised != null && disenfranchised.equals(disenfranchised2))) {
                                final Boolean in_timeout = this.in_timeout;
                                final Boolean in_timeout2 = user.in_timeout;
                                if (in_timeout == in_timeout2 || (in_timeout != null && in_timeout.equals(in_timeout2))) {
                                    final Boolean neutered = this.neutered;
                                    final Boolean neutered2 = user.neutered;
                                    if (neutered == neutered2 || (neutered != null && neutered.equals(neutered2))) {
                                        final Long number_creddits = this.number_creddits;
                                        final Long number_creddits2 = user.number_creddits;
                                        if (number_creddits == number_creddits2 || (number_creddits != null && number_creddits.equals(number_creddits2))) {
                                            final Boolean is_admin = this.is_admin;
                                            final Boolean is_admin2 = user.is_admin;
                                            if (is_admin == is_admin2 || (is_admin != null && is_admin.equals(is_admin2))) {
                                                final Boolean has_premium = this.has_premium;
                                                final Boolean has_premium2 = user.has_premium;
                                                if (has_premium == has_premium2 || (has_premium != null && has_premium.equals(has_premium2))) {
                                                    final Long number_coins = this.number_coins;
                                                    final Long number_coins2 = user.number_coins;
                                                    if (number_coins == number_coins2 || (number_coins != null && number_coins.equals(number_coins2))) {
                                                        final Long number_premium_days_remaining = this.number_premium_days_remaining;
                                                        final Long number_premium_days_remaining2 = user.number_premium_days_remaining;
                                                        if (number_premium_days_remaining == number_premium_days_remaining2 || (number_premium_days_remaining != null && number_premium_days_remaining.equals(number_premium_days_remaining2))) {
                                                            final Boolean is_employee = this.is_employee;
                                                            final Boolean is_employee2 = user.is_employee;
                                                            if (is_employee == is_employee2 || (is_employee != null && is_employee.equals(is_employee2))) {
                                                                final Boolean is_premium_subscriber = this.is_premium_subscriber;
                                                                final Boolean is_premium_subscriber2 = user.is_premium_subscriber;
                                                                if (is_premium_subscriber == is_premium_subscriber2 || (is_premium_subscriber != null && is_premium_subscriber.equals(is_premium_subscriber2))) {
                                                                    final Long post_karma = this.post_karma;
                                                                    final Long post_karma2 = user.post_karma;
                                                                    if (post_karma == post_karma2 || (post_karma != null && post_karma.equals(post_karma2))) {
                                                                        final Long comment_karma = this.comment_karma;
                                                                        final Long comment_karma2 = user.comment_karma;
                                                                        if (comment_karma == comment_karma2 || (comment_karma != null && comment_karma.equals(comment_karma2))) {
                                                                            final String name = this.name;
                                                                            final String name2 = user.name;
                                                                            if (name == name2 || (name != null && name.equals(name2))) {
                                                                                final String email = this.email;
                                                                                final String email2 = user.email;
                                                                                if (email == email2 || (email != null && email.equals(email2))) {
                                                                                    final String previous_id = this.previous_id;
                                                                                    final String previous_id2 = user.previous_id;
                                                                                    if (previous_id == previous_id2 || (previous_id != null && previous_id.equals(previous_id2))) {
                                                                                        final String masked_email = this.masked_email;
                                                                                        final String masked_email2 = user.masked_email;
                                                                                        if (masked_email == masked_email2 || (masked_email != null && masked_email.equals(masked_email2))) {
                                                                                            final String masked_email_user = this.masked_email_user;
                                                                                            final String masked_email_user2 = user.masked_email_user;
                                                                                            if (masked_email_user == masked_email_user2 || (masked_email_user != null && masked_email_user.equals(masked_email_user2))) {
                                                                                                final String email_domain = this.email_domain;
                                                                                                final String email_domain2 = user.email_domain;
                                                                                                if (email_domain == email_domain2 || (email_domain != null && email_domain.equals(email_domain2))) {
                                                                                                    final String premium_state = this.premium_state;
                                                                                                    final String premium_state2 = user.premium_state;
                                                                                                    if (premium_state == premium_state2 || (premium_state != null && premium_state.equals(premium_state2))) {
                                                                                                        final String country_code = this.country_code;
                                                                                                        final String country_code2 = user.country_code;
                                                                                                        boolean b2 = b;
                                                                                                        if (country_code == country_code2) {
                                                                                                            return b2;
                                                                                                        }
                                                                                                        if (country_code != null && country_code.equals(country_code2)) {
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
        final Long created_timestamp = this.created_timestamp;
        int hashCode3;
        if (created_timestamp == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = created_timestamp.hashCode();
        }
        final Boolean logged_in = this.logged_in;
        int hashCode4;
        if (logged_in == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = logged_in.hashCode();
        }
        final Long cookie_created_timestamp = this.cookie_created_timestamp;
        int hashCode5;
        if (cookie_created_timestamp == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = cookie_created_timestamp.hashCode();
        }
        final Boolean suspect = this.suspect;
        int hashCode6;
        if (suspect == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = suspect.hashCode();
        }
        final Boolean disenfranchised = this.disenfranchised;
        int hashCode7;
        if (disenfranchised == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = disenfranchised.hashCode();
        }
        final Boolean in_timeout = this.in_timeout;
        int hashCode8;
        if (in_timeout == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = in_timeout.hashCode();
        }
        final Boolean neutered = this.neutered;
        int hashCode9;
        if (neutered == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = neutered.hashCode();
        }
        final Long number_creddits = this.number_creddits;
        int hashCode10;
        if (number_creddits == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = number_creddits.hashCode();
        }
        final Boolean is_admin = this.is_admin;
        int hashCode11;
        if (is_admin == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = is_admin.hashCode();
        }
        final Boolean has_premium = this.has_premium;
        int hashCode12;
        if (has_premium == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = has_premium.hashCode();
        }
        final Long number_coins = this.number_coins;
        int hashCode13;
        if (number_coins == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = number_coins.hashCode();
        }
        final Long number_premium_days_remaining = this.number_premium_days_remaining;
        int hashCode14;
        if (number_premium_days_remaining == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = number_premium_days_remaining.hashCode();
        }
        final Boolean is_employee = this.is_employee;
        int hashCode15;
        if (is_employee == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = is_employee.hashCode();
        }
        final Boolean is_premium_subscriber = this.is_premium_subscriber;
        int hashCode16;
        if (is_premium_subscriber == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = is_premium_subscriber.hashCode();
        }
        final Long post_karma = this.post_karma;
        int hashCode17;
        if (post_karma == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = post_karma.hashCode();
        }
        final Long comment_karma = this.comment_karma;
        int hashCode18;
        if (comment_karma == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = comment_karma.hashCode();
        }
        final String name = this.name;
        int hashCode19;
        if (name == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = name.hashCode();
        }
        final String email = this.email;
        int hashCode20;
        if (email == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = email.hashCode();
        }
        final String previous_id = this.previous_id;
        int hashCode21;
        if (previous_id == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = previous_id.hashCode();
        }
        final String masked_email = this.masked_email;
        int hashCode22;
        if (masked_email == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = masked_email.hashCode();
        }
        final String masked_email_user = this.masked_email_user;
        int hashCode23;
        if (masked_email_user == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = masked_email_user.hashCode();
        }
        final String email_domain = this.email_domain;
        int hashCode24;
        if (email_domain == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = email_domain.hashCode();
        }
        final String premium_state = this.premium_state;
        int hashCode25;
        if (premium_state == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = premium_state.hashCode();
        }
        final String country_code = this.country_code;
        if (country_code != null) {
            hashCode = country_code.hashCode();
        }
        return (((((((((((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode18) * -2128831035 ^ hashCode19) * -2128831035 ^ hashCode20) * -2128831035 ^ hashCode21) * -2128831035 ^ hashCode22) * -2128831035 ^ hashCode23) * -2128831035 ^ hashCode24) * -2128831035 ^ hashCode25) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("User{id=");
        k.append(this.id);
        k.append(", created_timestamp=");
        k.append(this.created_timestamp);
        k.append(", logged_in=");
        k.append(this.logged_in);
        k.append(", cookie_created_timestamp=");
        k.append(this.cookie_created_timestamp);
        k.append(", suspect=");
        k.append(this.suspect);
        k.append(", disenfranchised=");
        k.append(this.disenfranchised);
        k.append(", in_timeout=");
        k.append(this.in_timeout);
        k.append(", neutered=");
        k.append(this.neutered);
        k.append(", number_creddits=");
        k.append(this.number_creddits);
        k.append(", is_admin=");
        k.append(this.is_admin);
        k.append(", has_premium=");
        k.append(this.has_premium);
        k.append(", number_coins=");
        k.append(this.number_coins);
        k.append(", number_premium_days_remaining=");
        k.append(this.number_premium_days_remaining);
        k.append(", is_employee=");
        k.append(this.is_employee);
        k.append(", is_premium_subscriber=");
        k.append(this.is_premium_subscriber);
        k.append(", post_karma=");
        k.append(this.post_karma);
        k.append(", comment_karma=");
        k.append(this.comment_karma);
        k.append(", name=");
        k.append(this.name);
        k.append(", email=");
        k.append(this.email);
        k.append(", previous_id=");
        k.append(this.previous_id);
        k.append(", masked_email=");
        k.append(this.masked_email);
        k.append(", masked_email_user=");
        k.append(this.masked_email_user);
        k.append(", email_domain=");
        k.append(this.email_domain);
        k.append(", premium_state=");
        k.append(this.premium_state);
        k.append(", country_code=");
        return b.j(k, this.country_code, "}");
    }
    
    public void write(final e e) throws IOException {
        User.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<User>
    {
        private Long comment_karma;
        private Long cookie_created_timestamp;
        private String country_code;
        private Long created_timestamp;
        private Boolean disenfranchised;
        private String email;
        private String email_domain;
        private Boolean has_premium;
        private String id;
        private Boolean in_timeout;
        private Boolean is_admin;
        private Boolean is_employee;
        private Boolean is_premium_subscriber;
        private Boolean logged_in;
        private String masked_email;
        private String masked_email_user;
        private String name;
        private Boolean neutered;
        private Long number_coins;
        private Long number_creddits;
        private Long number_premium_days_remaining;
        private Long post_karma;
        private String premium_state;
        private String previous_id;
        private Boolean suspect;
        
        public Builder() {
        }
        
        public Builder(final User user) {
            this.id = user.id;
            this.created_timestamp = user.created_timestamp;
            this.logged_in = user.logged_in;
            this.cookie_created_timestamp = user.cookie_created_timestamp;
            this.suspect = user.suspect;
            this.disenfranchised = user.disenfranchised;
            this.in_timeout = user.in_timeout;
            this.neutered = user.neutered;
            this.number_creddits = user.number_creddits;
            this.is_admin = user.is_admin;
            this.has_premium = user.has_premium;
            this.number_coins = user.number_coins;
            this.number_premium_days_remaining = user.number_premium_days_remaining;
            this.is_employee = user.is_employee;
            this.is_premium_subscriber = user.is_premium_subscriber;
            this.post_karma = user.post_karma;
            this.comment_karma = user.comment_karma;
            this.name = user.name;
            this.email = user.email;
            this.previous_id = user.previous_id;
            this.masked_email = user.masked_email;
            this.masked_email_user = user.masked_email_user;
            this.email_domain = user.email_domain;
            this.premium_state = user.premium_state;
            this.country_code = user.country_code;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ Boolean access$1000(final Builder builder) {
            return builder.is_admin;
        }
        
        public static /* synthetic */ Boolean access$1100(final Builder builder) {
            return builder.has_premium;
        }
        
        public static /* synthetic */ Long access$1200(final Builder builder) {
            return builder.number_coins;
        }
        
        public static /* synthetic */ Long access$1300(final Builder builder) {
            return builder.number_premium_days_remaining;
        }
        
        public static /* synthetic */ Boolean access$1400(final Builder builder) {
            return builder.is_employee;
        }
        
        public static /* synthetic */ Boolean access$1500(final Builder builder) {
            return builder.is_premium_subscriber;
        }
        
        public static /* synthetic */ Long access$1600(final Builder builder) {
            return builder.post_karma;
        }
        
        public static /* synthetic */ Long access$1700(final Builder builder) {
            return builder.comment_karma;
        }
        
        public static /* synthetic */ String access$1800(final Builder builder) {
            return builder.name;
        }
        
        public static /* synthetic */ String access$1900(final Builder builder) {
            return builder.email;
        }
        
        public static /* synthetic */ Long access$200(final Builder builder) {
            return builder.created_timestamp;
        }
        
        public static /* synthetic */ String access$2000(final Builder builder) {
            return builder.previous_id;
        }
        
        public static /* synthetic */ String access$2100(final Builder builder) {
            return builder.masked_email;
        }
        
        public static /* synthetic */ String access$2200(final Builder builder) {
            return builder.masked_email_user;
        }
        
        public static /* synthetic */ String access$2300(final Builder builder) {
            return builder.email_domain;
        }
        
        public static /* synthetic */ String access$2400(final Builder builder) {
            return builder.premium_state;
        }
        
        public static /* synthetic */ String access$2500(final Builder builder) {
            return builder.country_code;
        }
        
        public static /* synthetic */ Boolean access$300(final Builder builder) {
            return builder.logged_in;
        }
        
        public static /* synthetic */ Long access$400(final Builder builder) {
            return builder.cookie_created_timestamp;
        }
        
        public static /* synthetic */ Boolean access$500(final Builder builder) {
            return builder.suspect;
        }
        
        public static /* synthetic */ Boolean access$600(final Builder builder) {
            return builder.disenfranchised;
        }
        
        public static /* synthetic */ Boolean access$700(final Builder builder) {
            return builder.in_timeout;
        }
        
        public static /* synthetic */ Boolean access$800(final Builder builder) {
            return builder.neutered;
        }
        
        public static /* synthetic */ Long access$900(final Builder builder) {
            return builder.number_creddits;
        }
        
        public User build() {
            return new User(this, null);
        }
        
        public Builder comment_karma(final Long comment_karma) {
            this.comment_karma = comment_karma;
            return this;
        }
        
        public Builder cookie_created_timestamp(final Long cookie_created_timestamp) {
            this.cookie_created_timestamp = cookie_created_timestamp;
            return this;
        }
        
        public Builder country_code(final String country_code) {
            this.country_code = country_code;
            return this;
        }
        
        public Builder created_timestamp(final Long created_timestamp) {
            this.created_timestamp = created_timestamp;
            return this;
        }
        
        public Builder disenfranchised(final Boolean disenfranchised) {
            this.disenfranchised = disenfranchised;
            return this;
        }
        
        public Builder email(final String email) {
            this.email = email;
            return this;
        }
        
        public Builder email_domain(final String email_domain) {
            this.email_domain = email_domain;
            return this;
        }
        
        public Builder has_premium(final Boolean has_premium) {
            this.has_premium = has_premium;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder in_timeout(final Boolean in_timeout) {
            this.in_timeout = in_timeout;
            return this;
        }
        
        public Builder is_admin(final Boolean is_admin) {
            this.is_admin = is_admin;
            return this;
        }
        
        public Builder is_employee(final Boolean is_employee) {
            this.is_employee = is_employee;
            return this;
        }
        
        public Builder is_premium_subscriber(final Boolean is_premium_subscriber) {
            this.is_premium_subscriber = is_premium_subscriber;
            return this;
        }
        
        public Builder logged_in(final Boolean logged_in) {
            this.logged_in = logged_in;
            return this;
        }
        
        public Builder masked_email(final String masked_email) {
            this.masked_email = masked_email;
            return this;
        }
        
        public Builder masked_email_user(final String masked_email_user) {
            this.masked_email_user = masked_email_user;
            return this;
        }
        
        public Builder name(final String name) {
            this.name = name;
            return this;
        }
        
        public Builder neutered(final Boolean neutered) {
            this.neutered = neutered;
            return this;
        }
        
        public Builder number_coins(final Long number_coins) {
            this.number_coins = number_coins;
            return this;
        }
        
        public Builder number_creddits(final Long number_creddits) {
            this.number_creddits = number_creddits;
            return this;
        }
        
        public Builder number_premium_days_remaining(final Long number_premium_days_remaining) {
            this.number_premium_days_remaining = number_premium_days_remaining;
            return this;
        }
        
        public Builder post_karma(final Long post_karma) {
            this.post_karma = post_karma;
            return this;
        }
        
        public Builder premium_state(final String premium_state) {
            this.premium_state = premium_state;
            return this;
        }
        
        public Builder previous_id(final String previous_id) {
            this.previous_id = previous_id;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.created_timestamp = null;
            this.logged_in = null;
            this.cookie_created_timestamp = null;
            this.suspect = null;
            this.disenfranchised = null;
            this.in_timeout = null;
            this.neutered = null;
            this.number_creddits = null;
            this.is_admin = null;
            this.has_premium = null;
            this.number_coins = null;
            this.number_premium_days_remaining = null;
            this.is_employee = null;
            this.is_premium_subscriber = null;
            this.post_karma = null;
            this.comment_karma = null;
            this.name = null;
            this.email = null;
            this.previous_id = null;
            this.masked_email = null;
            this.masked_email_user = null;
            this.email_domain = null;
            this.premium_state = null;
            this.country_code = null;
        }
        
        public Builder suspect(final Boolean suspect) {
            this.suspect = suspect;
            return this;
        }
    }
    
    public static final class UserAdapter implements a<User, Builder>
    {
        private UserAdapter() {
        }
        
        public User read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public User read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 27: {
                        if (a == 11) {
                            builder.country_code(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 26: {
                        if (a == 11) {
                            builder.premium_state(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 25: {
                        if (a == 11) {
                            builder.email_domain(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 24: {
                        if (a == 11) {
                            builder.masked_email_user(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 23: {
                        if (a == 11) {
                            builder.masked_email(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 22: {
                        if (a == 11) {
                            builder.previous_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 21: {
                        if (a == 11) {
                            builder.email(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 20: {
                        if (a == 11) {
                            builder.name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 19: {
                        if (a == 10) {
                            builder.comment_karma(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 18: {
                        if (a == 10) {
                            builder.post_karma(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 17: {
                        if (a == 2) {
                            builder.is_premium_subscriber(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 16: {
                        if (a == 2) {
                            builder.is_employee(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 15: {
                        if (a == 10) {
                            builder.number_premium_days_remaining(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 14: {
                        if (a == 10) {
                            builder.number_coins(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 2) {
                            builder.has_premium(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 2) {
                            builder.is_admin(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 10) {
                            builder.number_creddits(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 2) {
                            builder.neutered(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 2) {
                            builder.in_timeout(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 2) {
                            builder.disenfranchised(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 2) {
                            builder.suspect(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 10) {
                            builder.cookie_created_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 2) {
                            builder.logged_in(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 10) {
                            builder.created_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final User user) throws IOException {
            e.a0();
            if (user.id != null) {
                e.N(1, (byte)11);
                e.Z(user.id);
                e.O();
            }
            if (user.created_timestamp != null) {
                e.N(2, (byte)10);
                a.r(user.created_timestamp, e);
            }
            if (user.logged_in != null) {
                e.N(3, (byte)2);
                d.z(user.logged_in, e);
            }
            if (user.cookie_created_timestamp != null) {
                e.N(4, (byte)10);
                a.r(user.cookie_created_timestamp, e);
            }
            if (user.suspect != null) {
                e.N(6, (byte)2);
                d.z(user.suspect, e);
            }
            if (user.disenfranchised != null) {
                e.N(8, (byte)2);
                d.z(user.disenfranchised, e);
            }
            if (user.in_timeout != null) {
                e.N(9, (byte)2);
                d.z(user.in_timeout, e);
            }
            if (user.neutered != null) {
                e.N(10, (byte)2);
                d.z(user.neutered, e);
            }
            if (user.number_creddits != null) {
                e.N(11, (byte)10);
                a.r(user.number_creddits, e);
            }
            if (user.is_admin != null) {
                e.N(12, (byte)2);
                d.z(user.is_admin, e);
            }
            if (user.has_premium != null) {
                e.N(13, (byte)2);
                d.z(user.has_premium, e);
            }
            if (user.number_coins != null) {
                e.N(14, (byte)10);
                a.r(user.number_coins, e);
            }
            if (user.number_premium_days_remaining != null) {
                e.N(15, (byte)10);
                a.r(user.number_premium_days_remaining, e);
            }
            if (user.is_employee != null) {
                e.N(16, (byte)2);
                d.z(user.is_employee, e);
            }
            if (user.is_premium_subscriber != null) {
                e.N(17, (byte)2);
                d.z(user.is_premium_subscriber, e);
            }
            if (user.post_karma != null) {
                e.N(18, (byte)10);
                a.r(user.post_karma, e);
            }
            if (user.comment_karma != null) {
                e.N(19, (byte)10);
                a.r(user.comment_karma, e);
            }
            if (user.name != null) {
                e.N(20, (byte)11);
                e.Z(user.name);
                e.O();
            }
            if (user.email != null) {
                e.N(21, (byte)11);
                e.Z(user.email);
                e.O();
            }
            if (user.previous_id != null) {
                e.N(22, (byte)11);
                e.Z(user.previous_id);
                e.O();
            }
            if (user.masked_email != null) {
                e.N(23, (byte)11);
                e.Z(user.masked_email);
                e.O();
            }
            if (user.masked_email_user != null) {
                e.N(24, (byte)11);
                e.Z(user.masked_email_user);
                e.O();
            }
            if (user.email_domain != null) {
                e.N(25, (byte)11);
                e.Z(user.email_domain);
                e.O();
            }
            if (user.premium_state != null) {
                e.N(26, (byte)11);
                e.Z(user.premium_state);
                e.O();
            }
            if (user.country_code != null) {
                e.N(27, (byte)11);
                e.Z(user.country_code);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
