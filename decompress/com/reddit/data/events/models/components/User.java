// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class User
{
    public static final a<User, User.User$Builder> ADAPTER;
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
        ADAPTER = (a)new User.User$UserAdapter((User$1)null);
    }
    
    private User(final User.User$Builder user$Builder) {
        this.id = User.User$Builder.access$100(user$Builder);
        this.created_timestamp = User.User$Builder.access$200(user$Builder);
        this.logged_in = User.User$Builder.access$300(user$Builder);
        this.cookie_created_timestamp = User.User$Builder.access$400(user$Builder);
        this.suspect = User.User$Builder.access$500(user$Builder);
        this.disenfranchised = User.User$Builder.access$600(user$Builder);
        this.in_timeout = User.User$Builder.access$700(user$Builder);
        this.neutered = User.User$Builder.access$800(user$Builder);
        this.number_creddits = User.User$Builder.access$900(user$Builder);
        this.is_admin = User.User$Builder.access$1000(user$Builder);
        this.has_premium = User.User$Builder.access$1100(user$Builder);
        this.number_coins = User.User$Builder.access$1200(user$Builder);
        this.number_premium_days_remaining = User.User$Builder.access$1300(user$Builder);
        this.is_employee = User.User$Builder.access$1400(user$Builder);
        this.is_premium_subscriber = User.User$Builder.access$1500(user$Builder);
        this.post_karma = User.User$Builder.access$1600(user$Builder);
        this.comment_karma = User.User$Builder.access$1700(user$Builder);
        this.name = User.User$Builder.access$1800(user$Builder);
        this.email = User.User$Builder.access$1900(user$Builder);
        this.previous_id = User.User$Builder.access$2000(user$Builder);
        this.masked_email = User.User$Builder.access$2100(user$Builder);
        this.masked_email_user = User.User$Builder.access$2200(user$Builder);
        this.email_domain = User.User$Builder.access$2300(user$Builder);
        this.premium_state = User.User$Builder.access$2400(user$Builder);
        this.country_code = User.User$Builder.access$2500(user$Builder);
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
        final StringBuilder r = a.r("User{id=");
        r.append(this.id);
        r.append(", created_timestamp=");
        r.append(this.created_timestamp);
        r.append(", logged_in=");
        r.append(this.logged_in);
        r.append(", cookie_created_timestamp=");
        r.append(this.cookie_created_timestamp);
        r.append(", suspect=");
        r.append(this.suspect);
        r.append(", disenfranchised=");
        r.append(this.disenfranchised);
        r.append(", in_timeout=");
        r.append(this.in_timeout);
        r.append(", neutered=");
        r.append(this.neutered);
        r.append(", number_creddits=");
        r.append(this.number_creddits);
        r.append(", is_admin=");
        r.append(this.is_admin);
        r.append(", has_premium=");
        r.append(this.has_premium);
        r.append(", number_coins=");
        r.append(this.number_coins);
        r.append(", number_premium_days_remaining=");
        r.append(this.number_premium_days_remaining);
        r.append(", is_employee=");
        r.append(this.is_employee);
        r.append(", is_premium_subscriber=");
        r.append(this.is_premium_subscriber);
        r.append(", post_karma=");
        r.append(this.post_karma);
        r.append(", comment_karma=");
        r.append(this.comment_karma);
        r.append(", name=");
        r.append(this.name);
        r.append(", email=");
        r.append(this.email);
        r.append(", previous_id=");
        r.append(this.previous_id);
        r.append(", masked_email=");
        r.append(this.masked_email);
        r.append(", masked_email_user=");
        r.append(this.masked_email_user);
        r.append(", email_domain=");
        r.append(this.email_domain);
        r.append(", premium_state=");
        r.append(this.premium_state);
        r.append(", country_code=");
        return a.o(r, this.country_code, "}");
    }
    
    public void write(final e e) throws IOException {
        User.ADAPTER.write(e, (Object)this);
    }
}
