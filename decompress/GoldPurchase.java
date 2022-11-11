// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import kt.c;
import java.util.ArrayList;
import java.io.IOException;
import kt.e;
import a2.b;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class GoldPurchase
{
    public static final a<GoldPurchase, Builder> ADAPTER;
    public final List<String> available_award_ids;
    public final Boolean award_affects_awardee_karma;
    public final Boolean award_affects_awarder_karma;
    public final Integer award_col_position;
    public final String award_id;
    public final String award_inventory_type;
    public final String award_name;
    public final Integer award_row_position;
    public final String award_spotlight_status;
    public final Long awardee_karma_earned;
    public final Long awarder_karma_earned;
    public final Double coin_bonus_percentage;
    public final String coin_package_id;
    public final Double coin_sale_percentage;
    public final String coins_profile_id;
    public final String content_type;
    public final Boolean default_anonymous;
    public final String default_option;
    public final Long end_timestamp;
    public final String filter_id;
    public final String filter_name;
    public final Boolean gift_anonymous;
    public final Boolean gift_message;
    public final Integer gift_message_length;
    public final Boolean gift_public;
    public final String gift_user_id;
    public final Boolean gilded_content;
    public final Integer group_award_count;
    public final String group_award_tier;
    public final Boolean is_mod_award;
    public final Boolean is_predict_within_answer_period;
    public final Boolean is_sale_enabled;
    public final Boolean is_temporary_award;
    public final Integer number_coins;
    public final Integer number_coins_bonus;
    public final Integer number_coins_monthly;
    public final Integer number_coins_to_community;
    public final Integer number_coins_to_recipient;
    public final Integer number_creddits;
    public final Integer number_free_coins;
    public final Integer number_months;
    public final Integer number_paid_coins;
    public final Integer number_weeks_premium;
    public final String offer_context;
    public final String offer_type;
    public final String one_time_type;
    public final Integer paid_coins_revenue_pennies;
    public final String premium_cancel_reason;
    public final String premium_marketing_benefit;
    public final String proxy_for_user_id;
    public final Boolean purchased_coins;
    public final String source;
    public final Long start_timestamp;
    public final String subscription_type;
    public final Long target_user_comment_karma;
    public final Long target_user_post_karma;
    public final String transaction_id;
    public final Long transfer_amount;
    public final String transfer_currency_type;
    public final String transfer_type;
    public final String type;
    public final Long user_comment_award_karma;
    public final Long user_post_award_karma;
    public final Long user_subreddit_comment_karma;
    public final Long user_subreddit_post_karma;
    
    static {
        ADAPTER = (a)new GoldPurchaseAdapter(null);
    }
    
    private GoldPurchase(final Builder builder) {
        this.type = Builder.access$100(builder);
        this.number_months = Builder.access$200(builder);
        this.one_time_type = Builder.access$300(builder);
        this.gift_user_id = Builder.access$400(builder);
        this.gift_anonymous = Builder.access$500(builder);
        this.gift_message = Builder.access$600(builder);
        this.gift_message_length = Builder.access$700(builder);
        this.number_creddits = Builder.access$800(builder);
        this.subscription_type = Builder.access$900(builder);
        this.gilded_content = Builder.access$1000(builder);
        this.source = Builder.access$1100(builder);
        this.number_coins = Builder.access$1200(builder);
        this.number_coins_monthly = Builder.access$1300(builder);
        this.number_coins_bonus = Builder.access$1400(builder);
        this.transaction_id = Builder.access$1500(builder);
        this.content_type = Builder.access$1600(builder);
        this.default_option = Builder.access$1700(builder);
        this.default_anonymous = Builder.access$1800(builder);
        this.purchased_coins = Builder.access$1900(builder);
        this.proxy_for_user_id = Builder.access$2000(builder);
        this.award_id = Builder.access$2100(builder);
        this.award_name = Builder.access$2200(builder);
        this.is_mod_award = Builder.access$2300(builder);
        List<String> unmodifiableList;
        if (Builder.access$2400(builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$2400(builder));
        }
        this.available_award_ids = unmodifiableList;
        this.number_coins_to_recipient = Builder.access$2500(builder);
        this.number_coins_to_community = Builder.access$2600(builder);
        this.start_timestamp = Builder.access$2700(builder);
        this.end_timestamp = Builder.access$2800(builder);
        this.gift_public = Builder.access$2900(builder);
        this.number_free_coins = Builder.access$3000(builder);
        this.number_paid_coins = Builder.access$3100(builder);
        this.paid_coins_revenue_pennies = Builder.access$3200(builder);
        this.coin_package_id = Builder.access$3300(builder);
        this.is_temporary_award = Builder.access$3400(builder);
        this.is_sale_enabled = Builder.access$3500(builder);
        this.coin_bonus_percentage = Builder.access$3600(builder);
        this.coin_sale_percentage = Builder.access$3700(builder);
        this.offer_context = Builder.access$3800(builder);
        this.offer_type = Builder.access$3900(builder);
        this.award_col_position = Builder.access$4000(builder);
        this.award_row_position = Builder.access$4100(builder);
        this.awarder_karma_earned = Builder.access$4200(builder);
        this.awardee_karma_earned = Builder.access$4300(builder);
        this.user_post_award_karma = Builder.access$4400(builder);
        this.user_comment_award_karma = Builder.access$4500(builder);
        this.target_user_post_karma = Builder.access$4600(builder);
        this.target_user_comment_karma = Builder.access$4700(builder);
        this.user_subreddit_post_karma = Builder.access$4800(builder);
        this.user_subreddit_comment_karma = Builder.access$4900(builder);
        this.award_affects_awardee_karma = Builder.access$5000(builder);
        this.award_affects_awarder_karma = Builder.access$5100(builder);
        this.filter_name = Builder.access$5200(builder);
        this.filter_id = Builder.access$5300(builder);
        this.award_spotlight_status = Builder.access$5400(builder);
        this.award_inventory_type = Builder.access$5500(builder);
        this.coins_profile_id = Builder.access$5600(builder);
        this.is_predict_within_answer_period = Builder.access$5700(builder);
        this.group_award_tier = Builder.access$5800(builder);
        this.number_weeks_premium = Builder.access$5900(builder);
        this.group_award_count = Builder.access$6000(builder);
        this.premium_marketing_benefit = Builder.access$6100(builder);
        this.transfer_currency_type = Builder.access$6200(builder);
        this.transfer_type = Builder.access$6300(builder);
        this.transfer_amount = Builder.access$6400(builder);
        this.premium_cancel_reason = Builder.access$6500(builder);
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
        if (!(o instanceof GoldPurchase)) {
            return false;
        }
        final GoldPurchase goldPurchase = (GoldPurchase)o;
        final String type = this.type;
        final String type2 = goldPurchase.type;
        if (type == type2 || (type != null && type.equals(type2))) {
            final Integer number_months = this.number_months;
            final Integer number_months2 = goldPurchase.number_months;
            if (number_months == number_months2 || (number_months != null && number_months.equals(number_months2))) {
                final String one_time_type = this.one_time_type;
                final String one_time_type2 = goldPurchase.one_time_type;
                if (one_time_type == one_time_type2 || (one_time_type != null && one_time_type.equals(one_time_type2))) {
                    final String gift_user_id = this.gift_user_id;
                    final String gift_user_id2 = goldPurchase.gift_user_id;
                    if (gift_user_id == gift_user_id2 || (gift_user_id != null && gift_user_id.equals(gift_user_id2))) {
                        final Boolean gift_anonymous = this.gift_anonymous;
                        final Boolean gift_anonymous2 = goldPurchase.gift_anonymous;
                        if (gift_anonymous == gift_anonymous2 || (gift_anonymous != null && gift_anonymous.equals(gift_anonymous2))) {
                            final Boolean gift_message = this.gift_message;
                            final Boolean gift_message2 = goldPurchase.gift_message;
                            if (gift_message == gift_message2 || (gift_message != null && gift_message.equals(gift_message2))) {
                                final Integer gift_message_length = this.gift_message_length;
                                final Integer gift_message_length2 = goldPurchase.gift_message_length;
                                if (gift_message_length == gift_message_length2 || (gift_message_length != null && gift_message_length.equals(gift_message_length2))) {
                                    final Integer number_creddits = this.number_creddits;
                                    final Integer number_creddits2 = goldPurchase.number_creddits;
                                    if (number_creddits == number_creddits2 || (number_creddits != null && number_creddits.equals(number_creddits2))) {
                                        final String subscription_type = this.subscription_type;
                                        final String subscription_type2 = goldPurchase.subscription_type;
                                        if (subscription_type == subscription_type2 || (subscription_type != null && subscription_type.equals(subscription_type2))) {
                                            final Boolean gilded_content = this.gilded_content;
                                            final Boolean gilded_content2 = goldPurchase.gilded_content;
                                            if (gilded_content == gilded_content2 || (gilded_content != null && gilded_content.equals(gilded_content2))) {
                                                final String source = this.source;
                                                final String source2 = goldPurchase.source;
                                                if (source == source2 || (source != null && source.equals(source2))) {
                                                    final Integer number_coins = this.number_coins;
                                                    final Integer number_coins2 = goldPurchase.number_coins;
                                                    if (number_coins == number_coins2 || (number_coins != null && number_coins.equals(number_coins2))) {
                                                        final Integer number_coins_monthly = this.number_coins_monthly;
                                                        final Integer number_coins_monthly2 = goldPurchase.number_coins_monthly;
                                                        if (number_coins_monthly == number_coins_monthly2 || (number_coins_monthly != null && number_coins_monthly.equals(number_coins_monthly2))) {
                                                            final Integer number_coins_bonus = this.number_coins_bonus;
                                                            final Integer number_coins_bonus2 = goldPurchase.number_coins_bonus;
                                                            if (number_coins_bonus == number_coins_bonus2 || (number_coins_bonus != null && number_coins_bonus.equals(number_coins_bonus2))) {
                                                                final String transaction_id = this.transaction_id;
                                                                final String transaction_id2 = goldPurchase.transaction_id;
                                                                if (transaction_id == transaction_id2 || (transaction_id != null && transaction_id.equals(transaction_id2))) {
                                                                    final String content_type = this.content_type;
                                                                    final String content_type2 = goldPurchase.content_type;
                                                                    if (content_type == content_type2 || (content_type != null && content_type.equals(content_type2))) {
                                                                        final String default_option = this.default_option;
                                                                        final String default_option2 = goldPurchase.default_option;
                                                                        if (default_option == default_option2 || (default_option != null && default_option.equals(default_option2))) {
                                                                            final Boolean default_anonymous = this.default_anonymous;
                                                                            final Boolean default_anonymous2 = goldPurchase.default_anonymous;
                                                                            if (default_anonymous == default_anonymous2 || (default_anonymous != null && default_anonymous.equals(default_anonymous2))) {
                                                                                final Boolean purchased_coins = this.purchased_coins;
                                                                                final Boolean purchased_coins2 = goldPurchase.purchased_coins;
                                                                                if (purchased_coins == purchased_coins2 || (purchased_coins != null && purchased_coins.equals(purchased_coins2))) {
                                                                                    final String proxy_for_user_id = this.proxy_for_user_id;
                                                                                    final String proxy_for_user_id2 = goldPurchase.proxy_for_user_id;
                                                                                    if (proxy_for_user_id == proxy_for_user_id2 || (proxy_for_user_id != null && proxy_for_user_id.equals(proxy_for_user_id2))) {
                                                                                        final String award_id = this.award_id;
                                                                                        final String award_id2 = goldPurchase.award_id;
                                                                                        if (award_id == award_id2 || (award_id != null && award_id.equals(award_id2))) {
                                                                                            final String award_name = this.award_name;
                                                                                            final String award_name2 = goldPurchase.award_name;
                                                                                            if (award_name == award_name2 || (award_name != null && award_name.equals(award_name2))) {
                                                                                                final Boolean is_mod_award = this.is_mod_award;
                                                                                                final Boolean is_mod_award2 = goldPurchase.is_mod_award;
                                                                                                if (is_mod_award == is_mod_award2 || (is_mod_award != null && is_mod_award.equals(is_mod_award2))) {
                                                                                                    final List<String> available_award_ids = this.available_award_ids;
                                                                                                    final List<String> available_award_ids2 = goldPurchase.available_award_ids;
                                                                                                    if (available_award_ids == available_award_ids2 || (available_award_ids != null && available_award_ids.equals(available_award_ids2))) {
                                                                                                        final Integer number_coins_to_recipient = this.number_coins_to_recipient;
                                                                                                        final Integer number_coins_to_recipient2 = goldPurchase.number_coins_to_recipient;
                                                                                                        if (number_coins_to_recipient == number_coins_to_recipient2 || (number_coins_to_recipient != null && number_coins_to_recipient.equals(number_coins_to_recipient2))) {
                                                                                                            final Integer number_coins_to_community = this.number_coins_to_community;
                                                                                                            final Integer number_coins_to_community2 = goldPurchase.number_coins_to_community;
                                                                                                            if (number_coins_to_community == number_coins_to_community2 || (number_coins_to_community != null && number_coins_to_community.equals(number_coins_to_community2))) {
                                                                                                                final Long start_timestamp = this.start_timestamp;
                                                                                                                final Long start_timestamp2 = goldPurchase.start_timestamp;
                                                                                                                if (start_timestamp == start_timestamp2 || (start_timestamp != null && start_timestamp.equals(start_timestamp2))) {
                                                                                                                    final Long end_timestamp = this.end_timestamp;
                                                                                                                    final Long end_timestamp2 = goldPurchase.end_timestamp;
                                                                                                                    if (end_timestamp == end_timestamp2 || (end_timestamp != null && end_timestamp.equals(end_timestamp2))) {
                                                                                                                        final Boolean gift_public = this.gift_public;
                                                                                                                        final Boolean gift_public2 = goldPurchase.gift_public;
                                                                                                                        if (gift_public == gift_public2 || (gift_public != null && gift_public.equals(gift_public2))) {
                                                                                                                            final Integer number_free_coins = this.number_free_coins;
                                                                                                                            final Integer number_free_coins2 = goldPurchase.number_free_coins;
                                                                                                                            if (number_free_coins == number_free_coins2 || (number_free_coins != null && number_free_coins.equals(number_free_coins2))) {
                                                                                                                                final Integer number_paid_coins = this.number_paid_coins;
                                                                                                                                final Integer number_paid_coins2 = goldPurchase.number_paid_coins;
                                                                                                                                if (number_paid_coins == number_paid_coins2 || (number_paid_coins != null && number_paid_coins.equals(number_paid_coins2))) {
                                                                                                                                    final Integer paid_coins_revenue_pennies = this.paid_coins_revenue_pennies;
                                                                                                                                    final Integer paid_coins_revenue_pennies2 = goldPurchase.paid_coins_revenue_pennies;
                                                                                                                                    if (paid_coins_revenue_pennies == paid_coins_revenue_pennies2 || (paid_coins_revenue_pennies != null && paid_coins_revenue_pennies.equals(paid_coins_revenue_pennies2))) {
                                                                                                                                        final String coin_package_id = this.coin_package_id;
                                                                                                                                        final String coin_package_id2 = goldPurchase.coin_package_id;
                                                                                                                                        if (coin_package_id == coin_package_id2 || (coin_package_id != null && coin_package_id.equals(coin_package_id2))) {
                                                                                                                                            final Boolean is_temporary_award = this.is_temporary_award;
                                                                                                                                            final Boolean is_temporary_award2 = goldPurchase.is_temporary_award;
                                                                                                                                            if (is_temporary_award == is_temporary_award2 || (is_temporary_award != null && is_temporary_award.equals(is_temporary_award2))) {
                                                                                                                                                final Boolean is_sale_enabled = this.is_sale_enabled;
                                                                                                                                                final Boolean is_sale_enabled2 = goldPurchase.is_sale_enabled;
                                                                                                                                                if (is_sale_enabled == is_sale_enabled2 || (is_sale_enabled != null && is_sale_enabled.equals(is_sale_enabled2))) {
                                                                                                                                                    final Double coin_bonus_percentage = this.coin_bonus_percentage;
                                                                                                                                                    final Double coin_bonus_percentage2 = goldPurchase.coin_bonus_percentage;
                                                                                                                                                    if (coin_bonus_percentage == coin_bonus_percentage2 || (coin_bonus_percentage != null && coin_bonus_percentage.equals(coin_bonus_percentage2))) {
                                                                                                                                                        final Double coin_sale_percentage = this.coin_sale_percentage;
                                                                                                                                                        final Double coin_sale_percentage2 = goldPurchase.coin_sale_percentage;
                                                                                                                                                        if (coin_sale_percentage == coin_sale_percentage2 || (coin_sale_percentage != null && coin_sale_percentage.equals(coin_sale_percentage2))) {
                                                                                                                                                            final String offer_context = this.offer_context;
                                                                                                                                                            final String offer_context2 = goldPurchase.offer_context;
                                                                                                                                                            if (offer_context == offer_context2 || (offer_context != null && offer_context.equals(offer_context2))) {
                                                                                                                                                                final String offer_type = this.offer_type;
                                                                                                                                                                final String offer_type2 = goldPurchase.offer_type;
                                                                                                                                                                if (offer_type == offer_type2 || (offer_type != null && offer_type.equals(offer_type2))) {
                                                                                                                                                                    final Integer award_col_position = this.award_col_position;
                                                                                                                                                                    final Integer award_col_position2 = goldPurchase.award_col_position;
                                                                                                                                                                    if (award_col_position == award_col_position2 || (award_col_position != null && award_col_position.equals(award_col_position2))) {
                                                                                                                                                                        final Integer award_row_position = this.award_row_position;
                                                                                                                                                                        final Integer award_row_position2 = goldPurchase.award_row_position;
                                                                                                                                                                        if (award_row_position == award_row_position2 || (award_row_position != null && award_row_position.equals(award_row_position2))) {
                                                                                                                                                                            final Long awarder_karma_earned = this.awarder_karma_earned;
                                                                                                                                                                            final Long awarder_karma_earned2 = goldPurchase.awarder_karma_earned;
                                                                                                                                                                            if (awarder_karma_earned == awarder_karma_earned2 || (awarder_karma_earned != null && awarder_karma_earned.equals(awarder_karma_earned2))) {
                                                                                                                                                                                final Long awardee_karma_earned = this.awardee_karma_earned;
                                                                                                                                                                                final Long awardee_karma_earned2 = goldPurchase.awardee_karma_earned;
                                                                                                                                                                                if (awardee_karma_earned == awardee_karma_earned2 || (awardee_karma_earned != null && awardee_karma_earned.equals(awardee_karma_earned2))) {
                                                                                                                                                                                    final Long user_post_award_karma = this.user_post_award_karma;
                                                                                                                                                                                    final Long user_post_award_karma2 = goldPurchase.user_post_award_karma;
                                                                                                                                                                                    if (user_post_award_karma == user_post_award_karma2 || (user_post_award_karma != null && user_post_award_karma.equals(user_post_award_karma2))) {
                                                                                                                                                                                        final Long user_comment_award_karma = this.user_comment_award_karma;
                                                                                                                                                                                        final Long user_comment_award_karma2 = goldPurchase.user_comment_award_karma;
                                                                                                                                                                                        if (user_comment_award_karma == user_comment_award_karma2 || (user_comment_award_karma != null && user_comment_award_karma.equals(user_comment_award_karma2))) {
                                                                                                                                                                                            final Long target_user_post_karma = this.target_user_post_karma;
                                                                                                                                                                                            final Long target_user_post_karma2 = goldPurchase.target_user_post_karma;
                                                                                                                                                                                            if (target_user_post_karma == target_user_post_karma2 || (target_user_post_karma != null && target_user_post_karma.equals(target_user_post_karma2))) {
                                                                                                                                                                                                final Long target_user_comment_karma = this.target_user_comment_karma;
                                                                                                                                                                                                final Long target_user_comment_karma2 = goldPurchase.target_user_comment_karma;
                                                                                                                                                                                                if (target_user_comment_karma == target_user_comment_karma2 || (target_user_comment_karma != null && target_user_comment_karma.equals(target_user_comment_karma2))) {
                                                                                                                                                                                                    final Long user_subreddit_post_karma = this.user_subreddit_post_karma;
                                                                                                                                                                                                    final Long user_subreddit_post_karma2 = goldPurchase.user_subreddit_post_karma;
                                                                                                                                                                                                    if (user_subreddit_post_karma == user_subreddit_post_karma2 || (user_subreddit_post_karma != null && user_subreddit_post_karma.equals(user_subreddit_post_karma2))) {
                                                                                                                                                                                                        final Long user_subreddit_comment_karma = this.user_subreddit_comment_karma;
                                                                                                                                                                                                        final Long user_subreddit_comment_karma2 = goldPurchase.user_subreddit_comment_karma;
                                                                                                                                                                                                        if (user_subreddit_comment_karma == user_subreddit_comment_karma2 || (user_subreddit_comment_karma != null && user_subreddit_comment_karma.equals(user_subreddit_comment_karma2))) {
                                                                                                                                                                                                            final Boolean award_affects_awardee_karma = this.award_affects_awardee_karma;
                                                                                                                                                                                                            final Boolean award_affects_awardee_karma2 = goldPurchase.award_affects_awardee_karma;
                                                                                                                                                                                                            if (award_affects_awardee_karma == award_affects_awardee_karma2 || (award_affects_awardee_karma != null && award_affects_awardee_karma.equals(award_affects_awardee_karma2))) {
                                                                                                                                                                                                                final Boolean award_affects_awarder_karma = this.award_affects_awarder_karma;
                                                                                                                                                                                                                final Boolean award_affects_awarder_karma2 = goldPurchase.award_affects_awarder_karma;
                                                                                                                                                                                                                if (award_affects_awarder_karma == award_affects_awarder_karma2 || (award_affects_awarder_karma != null && award_affects_awarder_karma.equals(award_affects_awarder_karma2))) {
                                                                                                                                                                                                                    final String filter_name = this.filter_name;
                                                                                                                                                                                                                    final String filter_name2 = goldPurchase.filter_name;
                                                                                                                                                                                                                    if (filter_name == filter_name2 || (filter_name != null && filter_name.equals(filter_name2))) {
                                                                                                                                                                                                                        final String filter_id = this.filter_id;
                                                                                                                                                                                                                        final String filter_id2 = goldPurchase.filter_id;
                                                                                                                                                                                                                        if (filter_id == filter_id2 || (filter_id != null && filter_id.equals(filter_id2))) {
                                                                                                                                                                                                                            final String award_spotlight_status = this.award_spotlight_status;
                                                                                                                                                                                                                            final String award_spotlight_status2 = goldPurchase.award_spotlight_status;
                                                                                                                                                                                                                            if (award_spotlight_status == award_spotlight_status2 || (award_spotlight_status != null && award_spotlight_status.equals(award_spotlight_status2))) {
                                                                                                                                                                                                                                final String award_inventory_type = this.award_inventory_type;
                                                                                                                                                                                                                                final String award_inventory_type2 = goldPurchase.award_inventory_type;
                                                                                                                                                                                                                                if (award_inventory_type == award_inventory_type2 || (award_inventory_type != null && award_inventory_type.equals(award_inventory_type2))) {
                                                                                                                                                                                                                                    final String coins_profile_id = this.coins_profile_id;
                                                                                                                                                                                                                                    final String coins_profile_id2 = goldPurchase.coins_profile_id;
                                                                                                                                                                                                                                    if (coins_profile_id == coins_profile_id2 || (coins_profile_id != null && coins_profile_id.equals(coins_profile_id2))) {
                                                                                                                                                                                                                                        final Boolean is_predict_within_answer_period = this.is_predict_within_answer_period;
                                                                                                                                                                                                                                        final Boolean is_predict_within_answer_period2 = goldPurchase.is_predict_within_answer_period;
                                                                                                                                                                                                                                        if (is_predict_within_answer_period == is_predict_within_answer_period2 || (is_predict_within_answer_period != null && is_predict_within_answer_period.equals(is_predict_within_answer_period2))) {
                                                                                                                                                                                                                                            final String group_award_tier = this.group_award_tier;
                                                                                                                                                                                                                                            final String group_award_tier2 = goldPurchase.group_award_tier;
                                                                                                                                                                                                                                            if (group_award_tier == group_award_tier2 || (group_award_tier != null && group_award_tier.equals(group_award_tier2))) {
                                                                                                                                                                                                                                                final Integer number_weeks_premium = this.number_weeks_premium;
                                                                                                                                                                                                                                                final Integer number_weeks_premium2 = goldPurchase.number_weeks_premium;
                                                                                                                                                                                                                                                if (number_weeks_premium == number_weeks_premium2 || (number_weeks_premium != null && number_weeks_premium.equals(number_weeks_premium2))) {
                                                                                                                                                                                                                                                    final Integer group_award_count = this.group_award_count;
                                                                                                                                                                                                                                                    final Integer group_award_count2 = goldPurchase.group_award_count;
                                                                                                                                                                                                                                                    if (group_award_count == group_award_count2 || (group_award_count != null && group_award_count.equals(group_award_count2))) {
                                                                                                                                                                                                                                                        final String premium_marketing_benefit = this.premium_marketing_benefit;
                                                                                                                                                                                                                                                        final String premium_marketing_benefit2 = goldPurchase.premium_marketing_benefit;
                                                                                                                                                                                                                                                        if (premium_marketing_benefit == premium_marketing_benefit2 || (premium_marketing_benefit != null && premium_marketing_benefit.equals(premium_marketing_benefit2))) {
                                                                                                                                                                                                                                                            final String transfer_currency_type = this.transfer_currency_type;
                                                                                                                                                                                                                                                            final String transfer_currency_type2 = goldPurchase.transfer_currency_type;
                                                                                                                                                                                                                                                            if (transfer_currency_type == transfer_currency_type2 || (transfer_currency_type != null && transfer_currency_type.equals(transfer_currency_type2))) {
                                                                                                                                                                                                                                                                final String transfer_type = this.transfer_type;
                                                                                                                                                                                                                                                                final String transfer_type2 = goldPurchase.transfer_type;
                                                                                                                                                                                                                                                                if (transfer_type == transfer_type2 || (transfer_type != null && transfer_type.equals(transfer_type2))) {
                                                                                                                                                                                                                                                                    final Long transfer_amount = this.transfer_amount;
                                                                                                                                                                                                                                                                    final Long transfer_amount2 = goldPurchase.transfer_amount;
                                                                                                                                                                                                                                                                    if (transfer_amount == transfer_amount2 || (transfer_amount != null && transfer_amount.equals(transfer_amount2))) {
                                                                                                                                                                                                                                                                        final String premium_cancel_reason = this.premium_cancel_reason;
                                                                                                                                                                                                                                                                        final String premium_cancel_reason2 = goldPurchase.premium_cancel_reason;
                                                                                                                                                                                                                                                                        boolean b2 = b;
                                                                                                                                                                                                                                                                        if (premium_cancel_reason == premium_cancel_reason2) {
                                                                                                                                                                                                                                                                            return b2;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        if (premium_cancel_reason != null && premium_cancel_reason.equals(premium_cancel_reason2)) {
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
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/reddit/data/events/models/components/GoldPurchase.type:Ljava/lang/String;
        //     4: astore_1       
        //     5: iconst_0       
        //     6: istore_2       
        //     7: aload_1        
        //     8: ifnonnull       16
        //    11: iconst_0       
        //    12: istore_3       
        //    13: goto            21
        //    16: aload_1        
        //    17: invokevirtual   java/lang/String.hashCode:()I
        //    20: istore_3       
        //    21: aload_0        
        //    22: getfield        com/reddit/data/events/models/components/GoldPurchase.number_months:Ljava/lang/Integer;
        //    25: astore_1       
        //    26: aload_1        
        //    27: ifnonnull       36
        //    30: iconst_0       
        //    31: istore          4
        //    33: goto            42
        //    36: aload_1        
        //    37: invokevirtual   java/lang/Integer.hashCode:()I
        //    40: istore          4
        //    42: aload_0        
        //    43: getfield        com/reddit/data/events/models/components/GoldPurchase.one_time_type:Ljava/lang/String;
        //    46: astore_1       
        //    47: aload_1        
        //    48: ifnonnull       57
        //    51: iconst_0       
        //    52: istore          5
        //    54: goto            63
        //    57: aload_1        
        //    58: invokevirtual   java/lang/String.hashCode:()I
        //    61: istore          5
        //    63: aload_0        
        //    64: getfield        com/reddit/data/events/models/components/GoldPurchase.gift_user_id:Ljava/lang/String;
        //    67: astore_1       
        //    68: aload_1        
        //    69: ifnonnull       78
        //    72: iconst_0       
        //    73: istore          6
        //    75: goto            84
        //    78: aload_1        
        //    79: invokevirtual   java/lang/String.hashCode:()I
        //    82: istore          6
        //    84: aload_0        
        //    85: getfield        com/reddit/data/events/models/components/GoldPurchase.gift_anonymous:Ljava/lang/Boolean;
        //    88: astore_1       
        //    89: aload_1        
        //    90: ifnonnull       99
        //    93: iconst_0       
        //    94: istore          7
        //    96: goto            105
        //    99: aload_1        
        //   100: invokevirtual   java/lang/Boolean.hashCode:()I
        //   103: istore          7
        //   105: aload_0        
        //   106: getfield        com/reddit/data/events/models/components/GoldPurchase.gift_message:Ljava/lang/Boolean;
        //   109: astore_1       
        //   110: aload_1        
        //   111: ifnonnull       120
        //   114: iconst_0       
        //   115: istore          8
        //   117: goto            126
        //   120: aload_1        
        //   121: invokevirtual   java/lang/Boolean.hashCode:()I
        //   124: istore          8
        //   126: aload_0        
        //   127: getfield        com/reddit/data/events/models/components/GoldPurchase.gift_message_length:Ljava/lang/Integer;
        //   130: astore_1       
        //   131: aload_1        
        //   132: ifnonnull       141
        //   135: iconst_0       
        //   136: istore          9
        //   138: goto            147
        //   141: aload_1        
        //   142: invokevirtual   java/lang/Integer.hashCode:()I
        //   145: istore          9
        //   147: aload_0        
        //   148: getfield        com/reddit/data/events/models/components/GoldPurchase.number_creddits:Ljava/lang/Integer;
        //   151: astore_1       
        //   152: aload_1        
        //   153: ifnonnull       162
        //   156: iconst_0       
        //   157: istore          10
        //   159: goto            168
        //   162: aload_1        
        //   163: invokevirtual   java/lang/Integer.hashCode:()I
        //   166: istore          10
        //   168: aload_0        
        //   169: getfield        com/reddit/data/events/models/components/GoldPurchase.subscription_type:Ljava/lang/String;
        //   172: astore_1       
        //   173: aload_1        
        //   174: ifnonnull       183
        //   177: iconst_0       
        //   178: istore          11
        //   180: goto            189
        //   183: aload_1        
        //   184: invokevirtual   java/lang/String.hashCode:()I
        //   187: istore          11
        //   189: aload_0        
        //   190: getfield        com/reddit/data/events/models/components/GoldPurchase.gilded_content:Ljava/lang/Boolean;
        //   193: astore_1       
        //   194: aload_1        
        //   195: ifnonnull       204
        //   198: iconst_0       
        //   199: istore          12
        //   201: goto            210
        //   204: aload_1        
        //   205: invokevirtual   java/lang/Boolean.hashCode:()I
        //   208: istore          12
        //   210: aload_0        
        //   211: getfield        com/reddit/data/events/models/components/GoldPurchase.source:Ljava/lang/String;
        //   214: astore_1       
        //   215: aload_1        
        //   216: ifnonnull       225
        //   219: iconst_0       
        //   220: istore          13
        //   222: goto            231
        //   225: aload_1        
        //   226: invokevirtual   java/lang/String.hashCode:()I
        //   229: istore          13
        //   231: aload_0        
        //   232: getfield        com/reddit/data/events/models/components/GoldPurchase.number_coins:Ljava/lang/Integer;
        //   235: astore_1       
        //   236: aload_1        
        //   237: ifnonnull       246
        //   240: iconst_0       
        //   241: istore          14
        //   243: goto            252
        //   246: aload_1        
        //   247: invokevirtual   java/lang/Integer.hashCode:()I
        //   250: istore          14
        //   252: aload_0        
        //   253: getfield        com/reddit/data/events/models/components/GoldPurchase.number_coins_monthly:Ljava/lang/Integer;
        //   256: astore_1       
        //   257: aload_1        
        //   258: ifnonnull       267
        //   261: iconst_0       
        //   262: istore          15
        //   264: goto            273
        //   267: aload_1        
        //   268: invokevirtual   java/lang/Integer.hashCode:()I
        //   271: istore          15
        //   273: aload_0        
        //   274: getfield        com/reddit/data/events/models/components/GoldPurchase.number_coins_bonus:Ljava/lang/Integer;
        //   277: astore_1       
        //   278: aload_1        
        //   279: ifnonnull       288
        //   282: iconst_0       
        //   283: istore          16
        //   285: goto            294
        //   288: aload_1        
        //   289: invokevirtual   java/lang/Integer.hashCode:()I
        //   292: istore          16
        //   294: aload_0        
        //   295: getfield        com/reddit/data/events/models/components/GoldPurchase.transaction_id:Ljava/lang/String;
        //   298: astore_1       
        //   299: aload_1        
        //   300: ifnonnull       309
        //   303: iconst_0       
        //   304: istore          17
        //   306: goto            315
        //   309: aload_1        
        //   310: invokevirtual   java/lang/String.hashCode:()I
        //   313: istore          17
        //   315: aload_0        
        //   316: getfield        com/reddit/data/events/models/components/GoldPurchase.content_type:Ljava/lang/String;
        //   319: astore_1       
        //   320: aload_1        
        //   321: ifnonnull       330
        //   324: iconst_0       
        //   325: istore          18
        //   327: goto            336
        //   330: aload_1        
        //   331: invokevirtual   java/lang/String.hashCode:()I
        //   334: istore          18
        //   336: aload_0        
        //   337: getfield        com/reddit/data/events/models/components/GoldPurchase.default_option:Ljava/lang/String;
        //   340: astore_1       
        //   341: aload_1        
        //   342: ifnonnull       351
        //   345: iconst_0       
        //   346: istore          19
        //   348: goto            357
        //   351: aload_1        
        //   352: invokevirtual   java/lang/String.hashCode:()I
        //   355: istore          19
        //   357: aload_0        
        //   358: getfield        com/reddit/data/events/models/components/GoldPurchase.default_anonymous:Ljava/lang/Boolean;
        //   361: astore_1       
        //   362: aload_1        
        //   363: ifnonnull       372
        //   366: iconst_0       
        //   367: istore          20
        //   369: goto            378
        //   372: aload_1        
        //   373: invokevirtual   java/lang/Boolean.hashCode:()I
        //   376: istore          20
        //   378: aload_0        
        //   379: getfield        com/reddit/data/events/models/components/GoldPurchase.purchased_coins:Ljava/lang/Boolean;
        //   382: astore_1       
        //   383: aload_1        
        //   384: ifnonnull       393
        //   387: iconst_0       
        //   388: istore          21
        //   390: goto            399
        //   393: aload_1        
        //   394: invokevirtual   java/lang/Boolean.hashCode:()I
        //   397: istore          21
        //   399: aload_0        
        //   400: getfield        com/reddit/data/events/models/components/GoldPurchase.proxy_for_user_id:Ljava/lang/String;
        //   403: astore_1       
        //   404: aload_1        
        //   405: ifnonnull       414
        //   408: iconst_0       
        //   409: istore          22
        //   411: goto            420
        //   414: aload_1        
        //   415: invokevirtual   java/lang/String.hashCode:()I
        //   418: istore          22
        //   420: aload_0        
        //   421: getfield        com/reddit/data/events/models/components/GoldPurchase.award_id:Ljava/lang/String;
        //   424: astore_1       
        //   425: aload_1        
        //   426: ifnonnull       435
        //   429: iconst_0       
        //   430: istore          23
        //   432: goto            441
        //   435: aload_1        
        //   436: invokevirtual   java/lang/String.hashCode:()I
        //   439: istore          23
        //   441: aload_0        
        //   442: getfield        com/reddit/data/events/models/components/GoldPurchase.award_name:Ljava/lang/String;
        //   445: astore_1       
        //   446: aload_1        
        //   447: ifnonnull       456
        //   450: iconst_0       
        //   451: istore          24
        //   453: goto            462
        //   456: aload_1        
        //   457: invokevirtual   java/lang/String.hashCode:()I
        //   460: istore          24
        //   462: aload_0        
        //   463: getfield        com/reddit/data/events/models/components/GoldPurchase.is_mod_award:Ljava/lang/Boolean;
        //   466: astore_1       
        //   467: aload_1        
        //   468: ifnonnull       477
        //   471: iconst_0       
        //   472: istore          25
        //   474: goto            483
        //   477: aload_1        
        //   478: invokevirtual   java/lang/Boolean.hashCode:()I
        //   481: istore          25
        //   483: aload_0        
        //   484: getfield        com/reddit/data/events/models/components/GoldPurchase.available_award_ids:Ljava/util/List;
        //   487: astore_1       
        //   488: aload_1        
        //   489: ifnonnull       498
        //   492: iconst_0       
        //   493: istore          26
        //   495: goto            506
        //   498: aload_1        
        //   499: invokeinterface java/util/List.hashCode:()I
        //   504: istore          26
        //   506: aload_0        
        //   507: getfield        com/reddit/data/events/models/components/GoldPurchase.number_coins_to_recipient:Ljava/lang/Integer;
        //   510: astore_1       
        //   511: aload_1        
        //   512: ifnonnull       521
        //   515: iconst_0       
        //   516: istore          27
        //   518: goto            527
        //   521: aload_1        
        //   522: invokevirtual   java/lang/Integer.hashCode:()I
        //   525: istore          27
        //   527: aload_0        
        //   528: getfield        com/reddit/data/events/models/components/GoldPurchase.number_coins_to_community:Ljava/lang/Integer;
        //   531: astore_1       
        //   532: aload_1        
        //   533: ifnonnull       542
        //   536: iconst_0       
        //   537: istore          28
        //   539: goto            548
        //   542: aload_1        
        //   543: invokevirtual   java/lang/Integer.hashCode:()I
        //   546: istore          28
        //   548: aload_0        
        //   549: getfield        com/reddit/data/events/models/components/GoldPurchase.start_timestamp:Ljava/lang/Long;
        //   552: astore_1       
        //   553: aload_1        
        //   554: ifnonnull       563
        //   557: iconst_0       
        //   558: istore          29
        //   560: goto            569
        //   563: aload_1        
        //   564: invokevirtual   java/lang/Long.hashCode:()I
        //   567: istore          29
        //   569: aload_0        
        //   570: getfield        com/reddit/data/events/models/components/GoldPurchase.end_timestamp:Ljava/lang/Long;
        //   573: astore_1       
        //   574: aload_1        
        //   575: ifnonnull       584
        //   578: iconst_0       
        //   579: istore          30
        //   581: goto            590
        //   584: aload_1        
        //   585: invokevirtual   java/lang/Long.hashCode:()I
        //   588: istore          30
        //   590: aload_0        
        //   591: getfield        com/reddit/data/events/models/components/GoldPurchase.gift_public:Ljava/lang/Boolean;
        //   594: astore_1       
        //   595: aload_1        
        //   596: ifnonnull       605
        //   599: iconst_0       
        //   600: istore          31
        //   602: goto            611
        //   605: aload_1        
        //   606: invokevirtual   java/lang/Boolean.hashCode:()I
        //   609: istore          31
        //   611: aload_0        
        //   612: getfield        com/reddit/data/events/models/components/GoldPurchase.number_free_coins:Ljava/lang/Integer;
        //   615: astore_1       
        //   616: aload_1        
        //   617: ifnonnull       626
        //   620: iconst_0       
        //   621: istore          32
        //   623: goto            632
        //   626: aload_1        
        //   627: invokevirtual   java/lang/Integer.hashCode:()I
        //   630: istore          32
        //   632: aload_0        
        //   633: getfield        com/reddit/data/events/models/components/GoldPurchase.number_paid_coins:Ljava/lang/Integer;
        //   636: astore_1       
        //   637: aload_1        
        //   638: ifnonnull       647
        //   641: iconst_0       
        //   642: istore          33
        //   644: goto            653
        //   647: aload_1        
        //   648: invokevirtual   java/lang/Integer.hashCode:()I
        //   651: istore          33
        //   653: aload_0        
        //   654: getfield        com/reddit/data/events/models/components/GoldPurchase.paid_coins_revenue_pennies:Ljava/lang/Integer;
        //   657: astore_1       
        //   658: aload_1        
        //   659: ifnonnull       668
        //   662: iconst_0       
        //   663: istore          34
        //   665: goto            674
        //   668: aload_1        
        //   669: invokevirtual   java/lang/Integer.hashCode:()I
        //   672: istore          34
        //   674: aload_0        
        //   675: getfield        com/reddit/data/events/models/components/GoldPurchase.coin_package_id:Ljava/lang/String;
        //   678: astore_1       
        //   679: aload_1        
        //   680: ifnonnull       689
        //   683: iconst_0       
        //   684: istore          35
        //   686: goto            695
        //   689: aload_1        
        //   690: invokevirtual   java/lang/String.hashCode:()I
        //   693: istore          35
        //   695: aload_0        
        //   696: getfield        com/reddit/data/events/models/components/GoldPurchase.is_temporary_award:Ljava/lang/Boolean;
        //   699: astore_1       
        //   700: aload_1        
        //   701: ifnonnull       710
        //   704: iconst_0       
        //   705: istore          36
        //   707: goto            716
        //   710: aload_1        
        //   711: invokevirtual   java/lang/Boolean.hashCode:()I
        //   714: istore          36
        //   716: aload_0        
        //   717: getfield        com/reddit/data/events/models/components/GoldPurchase.is_sale_enabled:Ljava/lang/Boolean;
        //   720: astore_1       
        //   721: aload_1        
        //   722: ifnonnull       731
        //   725: iconst_0       
        //   726: istore          37
        //   728: goto            737
        //   731: aload_1        
        //   732: invokevirtual   java/lang/Boolean.hashCode:()I
        //   735: istore          37
        //   737: aload_0        
        //   738: getfield        com/reddit/data/events/models/components/GoldPurchase.coin_bonus_percentage:Ljava/lang/Double;
        //   741: astore_1       
        //   742: aload_1        
        //   743: ifnonnull       752
        //   746: iconst_0       
        //   747: istore          38
        //   749: goto            758
        //   752: aload_1        
        //   753: invokevirtual   java/lang/Double.hashCode:()I
        //   756: istore          38
        //   758: aload_0        
        //   759: getfield        com/reddit/data/events/models/components/GoldPurchase.coin_sale_percentage:Ljava/lang/Double;
        //   762: astore_1       
        //   763: aload_1        
        //   764: ifnonnull       773
        //   767: iconst_0       
        //   768: istore          39
        //   770: goto            779
        //   773: aload_1        
        //   774: invokevirtual   java/lang/Double.hashCode:()I
        //   777: istore          39
        //   779: aload_0        
        //   780: getfield        com/reddit/data/events/models/components/GoldPurchase.offer_context:Ljava/lang/String;
        //   783: astore_1       
        //   784: aload_1        
        //   785: ifnonnull       794
        //   788: iconst_0       
        //   789: istore          40
        //   791: goto            800
        //   794: aload_1        
        //   795: invokevirtual   java/lang/String.hashCode:()I
        //   798: istore          40
        //   800: aload_0        
        //   801: getfield        com/reddit/data/events/models/components/GoldPurchase.offer_type:Ljava/lang/String;
        //   804: astore_1       
        //   805: aload_1        
        //   806: ifnonnull       815
        //   809: iconst_0       
        //   810: istore          41
        //   812: goto            821
        //   815: aload_1        
        //   816: invokevirtual   java/lang/String.hashCode:()I
        //   819: istore          41
        //   821: aload_0        
        //   822: getfield        com/reddit/data/events/models/components/GoldPurchase.award_col_position:Ljava/lang/Integer;
        //   825: astore_1       
        //   826: aload_1        
        //   827: ifnonnull       836
        //   830: iconst_0       
        //   831: istore          42
        //   833: goto            842
        //   836: aload_1        
        //   837: invokevirtual   java/lang/Integer.hashCode:()I
        //   840: istore          42
        //   842: aload_0        
        //   843: getfield        com/reddit/data/events/models/components/GoldPurchase.award_row_position:Ljava/lang/Integer;
        //   846: astore_1       
        //   847: aload_1        
        //   848: ifnonnull       857
        //   851: iconst_0       
        //   852: istore          43
        //   854: goto            863
        //   857: aload_1        
        //   858: invokevirtual   java/lang/Integer.hashCode:()I
        //   861: istore          43
        //   863: aload_0        
        //   864: getfield        com/reddit/data/events/models/components/GoldPurchase.awarder_karma_earned:Ljava/lang/Long;
        //   867: astore_1       
        //   868: aload_1        
        //   869: ifnonnull       878
        //   872: iconst_0       
        //   873: istore          44
        //   875: goto            884
        //   878: aload_1        
        //   879: invokevirtual   java/lang/Long.hashCode:()I
        //   882: istore          44
        //   884: aload_0        
        //   885: getfield        com/reddit/data/events/models/components/GoldPurchase.awardee_karma_earned:Ljava/lang/Long;
        //   888: astore_1       
        //   889: aload_1        
        //   890: ifnonnull       899
        //   893: iconst_0       
        //   894: istore          45
        //   896: goto            905
        //   899: aload_1        
        //   900: invokevirtual   java/lang/Long.hashCode:()I
        //   903: istore          45
        //   905: aload_0        
        //   906: getfield        com/reddit/data/events/models/components/GoldPurchase.user_post_award_karma:Ljava/lang/Long;
        //   909: astore_1       
        //   910: aload_1        
        //   911: ifnonnull       920
        //   914: iconst_0       
        //   915: istore          46
        //   917: goto            926
        //   920: aload_1        
        //   921: invokevirtual   java/lang/Long.hashCode:()I
        //   924: istore          46
        //   926: aload_0        
        //   927: getfield        com/reddit/data/events/models/components/GoldPurchase.user_comment_award_karma:Ljava/lang/Long;
        //   930: astore_1       
        //   931: aload_1        
        //   932: ifnonnull       941
        //   935: iconst_0       
        //   936: istore          47
        //   938: goto            947
        //   941: aload_1        
        //   942: invokevirtual   java/lang/Long.hashCode:()I
        //   945: istore          47
        //   947: aload_0        
        //   948: getfield        com/reddit/data/events/models/components/GoldPurchase.target_user_post_karma:Ljava/lang/Long;
        //   951: astore_1       
        //   952: aload_1        
        //   953: ifnonnull       962
        //   956: iconst_0       
        //   957: istore          48
        //   959: goto            968
        //   962: aload_1        
        //   963: invokevirtual   java/lang/Long.hashCode:()I
        //   966: istore          48
        //   968: aload_0        
        //   969: getfield        com/reddit/data/events/models/components/GoldPurchase.target_user_comment_karma:Ljava/lang/Long;
        //   972: astore_1       
        //   973: aload_1        
        //   974: ifnonnull       983
        //   977: iconst_0       
        //   978: istore          49
        //   980: goto            989
        //   983: aload_1        
        //   984: invokevirtual   java/lang/Long.hashCode:()I
        //   987: istore          49
        //   989: aload_0        
        //   990: getfield        com/reddit/data/events/models/components/GoldPurchase.user_subreddit_post_karma:Ljava/lang/Long;
        //   993: astore_1       
        //   994: aload_1        
        //   995: ifnonnull       1004
        //   998: iconst_0       
        //   999: istore          50
        //  1001: goto            1010
        //  1004: aload_1        
        //  1005: invokevirtual   java/lang/Long.hashCode:()I
        //  1008: istore          50
        //  1010: aload_0        
        //  1011: getfield        com/reddit/data/events/models/components/GoldPurchase.user_subreddit_comment_karma:Ljava/lang/Long;
        //  1014: astore_1       
        //  1015: aload_1        
        //  1016: ifnonnull       1025
        //  1019: iconst_0       
        //  1020: istore          51
        //  1022: goto            1031
        //  1025: aload_1        
        //  1026: invokevirtual   java/lang/Long.hashCode:()I
        //  1029: istore          51
        //  1031: aload_0        
        //  1032: getfield        com/reddit/data/events/models/components/GoldPurchase.award_affects_awardee_karma:Ljava/lang/Boolean;
        //  1035: astore_1       
        //  1036: aload_1        
        //  1037: ifnonnull       1046
        //  1040: iconst_0       
        //  1041: istore          52
        //  1043: goto            1052
        //  1046: aload_1        
        //  1047: invokevirtual   java/lang/Boolean.hashCode:()I
        //  1050: istore          52
        //  1052: aload_0        
        //  1053: getfield        com/reddit/data/events/models/components/GoldPurchase.award_affects_awarder_karma:Ljava/lang/Boolean;
        //  1056: astore_1       
        //  1057: aload_1        
        //  1058: ifnonnull       1067
        //  1061: iconst_0       
        //  1062: istore          53
        //  1064: goto            1073
        //  1067: aload_1        
        //  1068: invokevirtual   java/lang/Boolean.hashCode:()I
        //  1071: istore          53
        //  1073: aload_0        
        //  1074: getfield        com/reddit/data/events/models/components/GoldPurchase.filter_name:Ljava/lang/String;
        //  1077: astore_1       
        //  1078: aload_1        
        //  1079: ifnonnull       1088
        //  1082: iconst_0       
        //  1083: istore          54
        //  1085: goto            1094
        //  1088: aload_1        
        //  1089: invokevirtual   java/lang/String.hashCode:()I
        //  1092: istore          54
        //  1094: aload_0        
        //  1095: getfield        com/reddit/data/events/models/components/GoldPurchase.filter_id:Ljava/lang/String;
        //  1098: astore_1       
        //  1099: aload_1        
        //  1100: ifnonnull       1109
        //  1103: iconst_0       
        //  1104: istore          55
        //  1106: goto            1115
        //  1109: aload_1        
        //  1110: invokevirtual   java/lang/String.hashCode:()I
        //  1113: istore          55
        //  1115: aload_0        
        //  1116: getfield        com/reddit/data/events/models/components/GoldPurchase.award_spotlight_status:Ljava/lang/String;
        //  1119: astore_1       
        //  1120: aload_1        
        //  1121: ifnonnull       1130
        //  1124: iconst_0       
        //  1125: istore          56
        //  1127: goto            1136
        //  1130: aload_1        
        //  1131: invokevirtual   java/lang/String.hashCode:()I
        //  1134: istore          56
        //  1136: aload_0        
        //  1137: getfield        com/reddit/data/events/models/components/GoldPurchase.award_inventory_type:Ljava/lang/String;
        //  1140: astore_1       
        //  1141: aload_1        
        //  1142: ifnonnull       1151
        //  1145: iconst_0       
        //  1146: istore          57
        //  1148: goto            1157
        //  1151: aload_1        
        //  1152: invokevirtual   java/lang/String.hashCode:()I
        //  1155: istore          57
        //  1157: aload_0        
        //  1158: getfield        com/reddit/data/events/models/components/GoldPurchase.coins_profile_id:Ljava/lang/String;
        //  1161: astore_1       
        //  1162: aload_1        
        //  1163: ifnonnull       1172
        //  1166: iconst_0       
        //  1167: istore          58
        //  1169: goto            1178
        //  1172: aload_1        
        //  1173: invokevirtual   java/lang/String.hashCode:()I
        //  1176: istore          58
        //  1178: aload_0        
        //  1179: getfield        com/reddit/data/events/models/components/GoldPurchase.is_predict_within_answer_period:Ljava/lang/Boolean;
        //  1182: astore_1       
        //  1183: aload_1        
        //  1184: ifnonnull       1193
        //  1187: iconst_0       
        //  1188: istore          59
        //  1190: goto            1199
        //  1193: aload_1        
        //  1194: invokevirtual   java/lang/Boolean.hashCode:()I
        //  1197: istore          59
        //  1199: aload_0        
        //  1200: getfield        com/reddit/data/events/models/components/GoldPurchase.group_award_tier:Ljava/lang/String;
        //  1203: astore_1       
        //  1204: aload_1        
        //  1205: ifnonnull       1214
        //  1208: iconst_0       
        //  1209: istore          60
        //  1211: goto            1220
        //  1214: aload_1        
        //  1215: invokevirtual   java/lang/String.hashCode:()I
        //  1218: istore          60
        //  1220: aload_0        
        //  1221: getfield        com/reddit/data/events/models/components/GoldPurchase.number_weeks_premium:Ljava/lang/Integer;
        //  1224: astore_1       
        //  1225: aload_1        
        //  1226: ifnonnull       1235
        //  1229: iconst_0       
        //  1230: istore          61
        //  1232: goto            1241
        //  1235: aload_1        
        //  1236: invokevirtual   java/lang/Integer.hashCode:()I
        //  1239: istore          61
        //  1241: aload_0        
        //  1242: getfield        com/reddit/data/events/models/components/GoldPurchase.group_award_count:Ljava/lang/Integer;
        //  1245: astore_1       
        //  1246: aload_1        
        //  1247: ifnonnull       1256
        //  1250: iconst_0       
        //  1251: istore          62
        //  1253: goto            1262
        //  1256: aload_1        
        //  1257: invokevirtual   java/lang/Integer.hashCode:()I
        //  1260: istore          62
        //  1262: aload_0        
        //  1263: getfield        com/reddit/data/events/models/components/GoldPurchase.premium_marketing_benefit:Ljava/lang/String;
        //  1266: astore_1       
        //  1267: aload_1        
        //  1268: ifnonnull       1277
        //  1271: iconst_0       
        //  1272: istore          63
        //  1274: goto            1283
        //  1277: aload_1        
        //  1278: invokevirtual   java/lang/String.hashCode:()I
        //  1281: istore          63
        //  1283: aload_0        
        //  1284: getfield        com/reddit/data/events/models/components/GoldPurchase.transfer_currency_type:Ljava/lang/String;
        //  1287: astore_1       
        //  1288: aload_1        
        //  1289: ifnonnull       1298
        //  1292: iconst_0       
        //  1293: istore          64
        //  1295: goto            1304
        //  1298: aload_1        
        //  1299: invokevirtual   java/lang/String.hashCode:()I
        //  1302: istore          64
        //  1304: aload_0        
        //  1305: getfield        com/reddit/data/events/models/components/GoldPurchase.transfer_type:Ljava/lang/String;
        //  1308: astore_1       
        //  1309: aload_1        
        //  1310: ifnonnull       1319
        //  1313: iconst_0       
        //  1314: istore          65
        //  1316: goto            1325
        //  1319: aload_1        
        //  1320: invokevirtual   java/lang/String.hashCode:()I
        //  1323: istore          65
        //  1325: aload_0        
        //  1326: getfield        com/reddit/data/events/models/components/GoldPurchase.transfer_amount:Ljava/lang/Long;
        //  1329: astore_1       
        //  1330: aload_1        
        //  1331: ifnonnull       1340
        //  1334: iconst_0       
        //  1335: istore          66
        //  1337: goto            1346
        //  1340: aload_1        
        //  1341: invokevirtual   java/lang/Long.hashCode:()I
        //  1344: istore          66
        //  1346: aload_0        
        //  1347: getfield        com/reddit/data/events/models/components/GoldPurchase.premium_cancel_reason:Ljava/lang/String;
        //  1350: astore_1       
        //  1351: aload_1        
        //  1352: ifnonnull       1358
        //  1355: goto            1363
        //  1358: aload_1        
        //  1359: invokevirtual   java/lang/String.hashCode:()I
        //  1362: istore_2       
        //  1363: iload_3        
        //  1364: ldc_w           16777619
        //  1367: ixor           
        //  1368: ldc_w           -2128831035
        //  1371: imul           
        //  1372: iload           4
        //  1374: ixor           
        //  1375: ldc_w           -2128831035
        //  1378: imul           
        //  1379: iload           5
        //  1381: ixor           
        //  1382: ldc_w           -2128831035
        //  1385: imul           
        //  1386: iload           6
        //  1388: ixor           
        //  1389: ldc_w           -2128831035
        //  1392: imul           
        //  1393: iload           7
        //  1395: ixor           
        //  1396: ldc_w           -2128831035
        //  1399: imul           
        //  1400: iload           8
        //  1402: ixor           
        //  1403: ldc_w           -2128831035
        //  1406: imul           
        //  1407: iload           9
        //  1409: ixor           
        //  1410: ldc_w           -2128831035
        //  1413: imul           
        //  1414: iload           10
        //  1416: ixor           
        //  1417: ldc_w           -2128831035
        //  1420: imul           
        //  1421: iload           11
        //  1423: ixor           
        //  1424: ldc_w           -2128831035
        //  1427: imul           
        //  1428: iload           12
        //  1430: ixor           
        //  1431: ldc_w           -2128831035
        //  1434: imul           
        //  1435: iload           13
        //  1437: ixor           
        //  1438: ldc_w           -2128831035
        //  1441: imul           
        //  1442: iload           14
        //  1444: ixor           
        //  1445: ldc_w           -2128831035
        //  1448: imul           
        //  1449: iload           15
        //  1451: ixor           
        //  1452: ldc_w           -2128831035
        //  1455: imul           
        //  1456: iload           16
        //  1458: ixor           
        //  1459: ldc_w           -2128831035
        //  1462: imul           
        //  1463: iload           17
        //  1465: ixor           
        //  1466: ldc_w           -2128831035
        //  1469: imul           
        //  1470: iload           18
        //  1472: ixor           
        //  1473: ldc_w           -2128831035
        //  1476: imul           
        //  1477: iload           19
        //  1479: ixor           
        //  1480: ldc_w           -2128831035
        //  1483: imul           
        //  1484: iload           20
        //  1486: ixor           
        //  1487: ldc_w           -2128831035
        //  1490: imul           
        //  1491: iload           21
        //  1493: ixor           
        //  1494: ldc_w           -2128831035
        //  1497: imul           
        //  1498: iload           22
        //  1500: ixor           
        //  1501: ldc_w           -2128831035
        //  1504: imul           
        //  1505: iload           23
        //  1507: ixor           
        //  1508: ldc_w           -2128831035
        //  1511: imul           
        //  1512: iload           24
        //  1514: ixor           
        //  1515: ldc_w           -2128831035
        //  1518: imul           
        //  1519: iload           25
        //  1521: ixor           
        //  1522: ldc_w           -2128831035
        //  1525: imul           
        //  1526: iload           26
        //  1528: ixor           
        //  1529: ldc_w           -2128831035
        //  1532: imul           
        //  1533: iload           27
        //  1535: ixor           
        //  1536: ldc_w           -2128831035
        //  1539: imul           
        //  1540: iload           28
        //  1542: ixor           
        //  1543: ldc_w           -2128831035
        //  1546: imul           
        //  1547: iload           29
        //  1549: ixor           
        //  1550: ldc_w           -2128831035
        //  1553: imul           
        //  1554: iload           30
        //  1556: ixor           
        //  1557: ldc_w           -2128831035
        //  1560: imul           
        //  1561: iload           31
        //  1563: ixor           
        //  1564: ldc_w           -2128831035
        //  1567: imul           
        //  1568: iload           32
        //  1570: ixor           
        //  1571: ldc_w           -2128831035
        //  1574: imul           
        //  1575: iload           33
        //  1577: ixor           
        //  1578: ldc_w           -2128831035
        //  1581: imul           
        //  1582: iload           34
        //  1584: ixor           
        //  1585: ldc_w           -2128831035
        //  1588: imul           
        //  1589: iload           35
        //  1591: ixor           
        //  1592: ldc_w           -2128831035
        //  1595: imul           
        //  1596: iload           36
        //  1598: ixor           
        //  1599: ldc_w           -2128831035
        //  1602: imul           
        //  1603: iload           37
        //  1605: ixor           
        //  1606: ldc_w           -2128831035
        //  1609: imul           
        //  1610: iload           38
        //  1612: ixor           
        //  1613: ldc_w           -2128831035
        //  1616: imul           
        //  1617: iload           39
        //  1619: ixor           
        //  1620: ldc_w           -2128831035
        //  1623: imul           
        //  1624: iload           40
        //  1626: ixor           
        //  1627: ldc_w           -2128831035
        //  1630: imul           
        //  1631: iload           41
        //  1633: ixor           
        //  1634: ldc_w           -2128831035
        //  1637: imul           
        //  1638: iload           42
        //  1640: ixor           
        //  1641: ldc_w           -2128831035
        //  1644: imul           
        //  1645: iload           43
        //  1647: ixor           
        //  1648: ldc_w           -2128831035
        //  1651: imul           
        //  1652: iload           44
        //  1654: ixor           
        //  1655: ldc_w           -2128831035
        //  1658: imul           
        //  1659: iload           45
        //  1661: ixor           
        //  1662: ldc_w           -2128831035
        //  1665: imul           
        //  1666: iload           46
        //  1668: ixor           
        //  1669: ldc_w           -2128831035
        //  1672: imul           
        //  1673: iload           47
        //  1675: ixor           
        //  1676: ldc_w           -2128831035
        //  1679: imul           
        //  1680: iload           48
        //  1682: ixor           
        //  1683: ldc_w           -2128831035
        //  1686: imul           
        //  1687: iload           49
        //  1689: ixor           
        //  1690: ldc_w           -2128831035
        //  1693: imul           
        //  1694: iload           50
        //  1696: ixor           
        //  1697: ldc_w           -2128831035
        //  1700: imul           
        //  1701: iload           51
        //  1703: ixor           
        //  1704: ldc_w           -2128831035
        //  1707: imul           
        //  1708: iload           52
        //  1710: ixor           
        //  1711: ldc_w           -2128831035
        //  1714: imul           
        //  1715: iload           53
        //  1717: ixor           
        //  1718: ldc_w           -2128831035
        //  1721: imul           
        //  1722: iload           54
        //  1724: ixor           
        //  1725: ldc_w           -2128831035
        //  1728: imul           
        //  1729: iload           55
        //  1731: ixor           
        //  1732: ldc_w           -2128831035
        //  1735: imul           
        //  1736: iload           56
        //  1738: ixor           
        //  1739: ldc_w           -2128831035
        //  1742: imul           
        //  1743: iload           57
        //  1745: ixor           
        //  1746: ldc_w           -2128831035
        //  1749: imul           
        //  1750: iload           58
        //  1752: ixor           
        //  1753: ldc_w           -2128831035
        //  1756: imul           
        //  1757: iload           59
        //  1759: ixor           
        //  1760: ldc_w           -2128831035
        //  1763: imul           
        //  1764: iload           60
        //  1766: ixor           
        //  1767: ldc_w           -2128831035
        //  1770: imul           
        //  1771: iload           61
        //  1773: ixor           
        //  1774: ldc_w           -2128831035
        //  1777: imul           
        //  1778: iload           62
        //  1780: ixor           
        //  1781: ldc_w           -2128831035
        //  1784: imul           
        //  1785: iload           63
        //  1787: ixor           
        //  1788: ldc_w           -2128831035
        //  1791: imul           
        //  1792: iload           64
        //  1794: ixor           
        //  1795: ldc_w           -2128831035
        //  1798: imul           
        //  1799: iload           65
        //  1801: ixor           
        //  1802: ldc_w           -2128831035
        //  1805: imul           
        //  1806: iload           66
        //  1808: ixor           
        //  1809: ldc_w           -2128831035
        //  1812: imul           
        //  1813: iload_2        
        //  1814: ixor           
        //  1815: ldc_w           -2128831035
        //  1818: imul           
        //  1819: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.StackOverflowError
        //     at java.util.Vector.contains(Unknown Source)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:828)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1670)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:373)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("GoldPurchase{type=");
        k.append(this.type);
        k.append(", number_months=");
        k.append(this.number_months);
        k.append(", one_time_type=");
        k.append(this.one_time_type);
        k.append(", gift_user_id=");
        k.append(this.gift_user_id);
        k.append(", gift_anonymous=");
        k.append(this.gift_anonymous);
        k.append(", gift_message=");
        k.append(this.gift_message);
        k.append(", gift_message_length=");
        k.append(this.gift_message_length);
        k.append(", number_creddits=");
        k.append(this.number_creddits);
        k.append(", subscription_type=");
        k.append(this.subscription_type);
        k.append(", gilded_content=");
        k.append(this.gilded_content);
        k.append(", source=");
        k.append(this.source);
        k.append(", number_coins=");
        k.append(this.number_coins);
        k.append(", number_coins_monthly=");
        k.append(this.number_coins_monthly);
        k.append(", number_coins_bonus=");
        k.append(this.number_coins_bonus);
        k.append(", transaction_id=");
        k.append(this.transaction_id);
        k.append(", content_type=");
        k.append(this.content_type);
        k.append(", default_option=");
        k.append(this.default_option);
        k.append(", default_anonymous=");
        k.append(this.default_anonymous);
        k.append(", purchased_coins=");
        k.append(this.purchased_coins);
        k.append(", proxy_for_user_id=");
        k.append(this.proxy_for_user_id);
        k.append(", award_id=");
        k.append(this.award_id);
        k.append(", award_name=");
        k.append(this.award_name);
        k.append(", is_mod_award=");
        k.append(this.is_mod_award);
        k.append(", available_award_ids=");
        k.append(this.available_award_ids);
        k.append(", number_coins_to_recipient=");
        k.append(this.number_coins_to_recipient);
        k.append(", number_coins_to_community=");
        k.append(this.number_coins_to_community);
        k.append(", start_timestamp=");
        k.append(this.start_timestamp);
        k.append(", end_timestamp=");
        k.append(this.end_timestamp);
        k.append(", gift_public=");
        k.append(this.gift_public);
        k.append(", number_free_coins=");
        k.append(this.number_free_coins);
        k.append(", number_paid_coins=");
        k.append(this.number_paid_coins);
        k.append(", paid_coins_revenue_pennies=");
        k.append(this.paid_coins_revenue_pennies);
        k.append(", coin_package_id=");
        k.append(this.coin_package_id);
        k.append(", is_temporary_award=");
        k.append(this.is_temporary_award);
        k.append(", is_sale_enabled=");
        k.append(this.is_sale_enabled);
        k.append(", coin_bonus_percentage=");
        k.append(this.coin_bonus_percentage);
        k.append(", coin_sale_percentage=");
        k.append(this.coin_sale_percentage);
        k.append(", offer_context=");
        k.append(this.offer_context);
        k.append(", offer_type=");
        k.append(this.offer_type);
        k.append(", award_col_position=");
        k.append(this.award_col_position);
        k.append(", award_row_position=");
        k.append(this.award_row_position);
        k.append(", awarder_karma_earned=");
        k.append(this.awarder_karma_earned);
        k.append(", awardee_karma_earned=");
        k.append(this.awardee_karma_earned);
        k.append(", user_post_award_karma=");
        k.append(this.user_post_award_karma);
        k.append(", user_comment_award_karma=");
        k.append(this.user_comment_award_karma);
        k.append(", target_user_post_karma=");
        k.append(this.target_user_post_karma);
        k.append(", target_user_comment_karma=");
        k.append(this.target_user_comment_karma);
        k.append(", user_subreddit_post_karma=");
        k.append(this.user_subreddit_post_karma);
        k.append(", user_subreddit_comment_karma=");
        k.append(this.user_subreddit_comment_karma);
        k.append(", award_affects_awardee_karma=");
        k.append(this.award_affects_awardee_karma);
        k.append(", award_affects_awarder_karma=");
        k.append(this.award_affects_awarder_karma);
        k.append(", filter_name=");
        k.append(this.filter_name);
        k.append(", filter_id=");
        k.append(this.filter_id);
        k.append(", award_spotlight_status=");
        k.append(this.award_spotlight_status);
        k.append(", award_inventory_type=");
        k.append(this.award_inventory_type);
        k.append(", coins_profile_id=");
        k.append(this.coins_profile_id);
        k.append(", is_predict_within_answer_period=");
        k.append(this.is_predict_within_answer_period);
        k.append(", group_award_tier=");
        k.append(this.group_award_tier);
        k.append(", number_weeks_premium=");
        k.append(this.number_weeks_premium);
        k.append(", group_award_count=");
        k.append(this.group_award_count);
        k.append(", premium_marketing_benefit=");
        k.append(this.premium_marketing_benefit);
        k.append(", transfer_currency_type=");
        k.append(this.transfer_currency_type);
        k.append(", transfer_type=");
        k.append(this.transfer_type);
        k.append(", transfer_amount=");
        k.append(this.transfer_amount);
        k.append(", premium_cancel_reason=");
        return b.j(k, this.premium_cancel_reason, "}");
    }
    
    public void write(final e e) throws IOException {
        GoldPurchase.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<GoldPurchase>
    {
        private List<String> available_award_ids;
        private Boolean award_affects_awardee_karma;
        private Boolean award_affects_awarder_karma;
        private Integer award_col_position;
        private String award_id;
        private String award_inventory_type;
        private String award_name;
        private Integer award_row_position;
        private String award_spotlight_status;
        private Long awardee_karma_earned;
        private Long awarder_karma_earned;
        private Double coin_bonus_percentage;
        private String coin_package_id;
        private Double coin_sale_percentage;
        private String coins_profile_id;
        private String content_type;
        private Boolean default_anonymous;
        private String default_option;
        private Long end_timestamp;
        private String filter_id;
        private String filter_name;
        private Boolean gift_anonymous;
        private Boolean gift_message;
        private Integer gift_message_length;
        private Boolean gift_public;
        private String gift_user_id;
        private Boolean gilded_content;
        private Integer group_award_count;
        private String group_award_tier;
        private Boolean is_mod_award;
        private Boolean is_predict_within_answer_period;
        private Boolean is_sale_enabled;
        private Boolean is_temporary_award;
        private Integer number_coins;
        private Integer number_coins_bonus;
        private Integer number_coins_monthly;
        private Integer number_coins_to_community;
        private Integer number_coins_to_recipient;
        private Integer number_creddits;
        private Integer number_free_coins;
        private Integer number_months;
        private Integer number_paid_coins;
        private Integer number_weeks_premium;
        private String offer_context;
        private String offer_type;
        private String one_time_type;
        private Integer paid_coins_revenue_pennies;
        private String premium_cancel_reason;
        private String premium_marketing_benefit;
        private String proxy_for_user_id;
        private Boolean purchased_coins;
        private String source;
        private Long start_timestamp;
        private String subscription_type;
        private Long target_user_comment_karma;
        private Long target_user_post_karma;
        private String transaction_id;
        private Long transfer_amount;
        private String transfer_currency_type;
        private String transfer_type;
        private String type;
        private Long user_comment_award_karma;
        private Long user_post_award_karma;
        private Long user_subreddit_comment_karma;
        private Long user_subreddit_post_karma;
        
        public Builder() {
        }
        
        public Builder(final GoldPurchase goldPurchase) {
            this.type = goldPurchase.type;
            this.number_months = goldPurchase.number_months;
            this.one_time_type = goldPurchase.one_time_type;
            this.gift_user_id = goldPurchase.gift_user_id;
            this.gift_anonymous = goldPurchase.gift_anonymous;
            this.gift_message = goldPurchase.gift_message;
            this.gift_message_length = goldPurchase.gift_message_length;
            this.number_creddits = goldPurchase.number_creddits;
            this.subscription_type = goldPurchase.subscription_type;
            this.gilded_content = goldPurchase.gilded_content;
            this.source = goldPurchase.source;
            this.number_coins = goldPurchase.number_coins;
            this.number_coins_monthly = goldPurchase.number_coins_monthly;
            this.number_coins_bonus = goldPurchase.number_coins_bonus;
            this.transaction_id = goldPurchase.transaction_id;
            this.content_type = goldPurchase.content_type;
            this.default_option = goldPurchase.default_option;
            this.default_anonymous = goldPurchase.default_anonymous;
            this.purchased_coins = goldPurchase.purchased_coins;
            this.proxy_for_user_id = goldPurchase.proxy_for_user_id;
            this.award_id = goldPurchase.award_id;
            this.award_name = goldPurchase.award_name;
            this.is_mod_award = goldPurchase.is_mod_award;
            this.available_award_ids = goldPurchase.available_award_ids;
            this.number_coins_to_recipient = goldPurchase.number_coins_to_recipient;
            this.number_coins_to_community = goldPurchase.number_coins_to_community;
            this.start_timestamp = goldPurchase.start_timestamp;
            this.end_timestamp = goldPurchase.end_timestamp;
            this.gift_public = goldPurchase.gift_public;
            this.number_free_coins = goldPurchase.number_free_coins;
            this.number_paid_coins = goldPurchase.number_paid_coins;
            this.paid_coins_revenue_pennies = goldPurchase.paid_coins_revenue_pennies;
            this.coin_package_id = goldPurchase.coin_package_id;
            this.is_temporary_award = goldPurchase.is_temporary_award;
            this.is_sale_enabled = goldPurchase.is_sale_enabled;
            this.coin_bonus_percentage = goldPurchase.coin_bonus_percentage;
            this.coin_sale_percentage = goldPurchase.coin_sale_percentage;
            this.offer_context = goldPurchase.offer_context;
            this.offer_type = goldPurchase.offer_type;
            this.award_col_position = goldPurchase.award_col_position;
            this.award_row_position = goldPurchase.award_row_position;
            this.awarder_karma_earned = goldPurchase.awarder_karma_earned;
            this.awardee_karma_earned = goldPurchase.awardee_karma_earned;
            this.user_post_award_karma = goldPurchase.user_post_award_karma;
            this.user_comment_award_karma = goldPurchase.user_comment_award_karma;
            this.target_user_post_karma = goldPurchase.target_user_post_karma;
            this.target_user_comment_karma = goldPurchase.target_user_comment_karma;
            this.user_subreddit_post_karma = goldPurchase.user_subreddit_post_karma;
            this.user_subreddit_comment_karma = goldPurchase.user_subreddit_comment_karma;
            this.award_affects_awardee_karma = goldPurchase.award_affects_awardee_karma;
            this.award_affects_awarder_karma = goldPurchase.award_affects_awarder_karma;
            this.filter_name = goldPurchase.filter_name;
            this.filter_id = goldPurchase.filter_id;
            this.award_spotlight_status = goldPurchase.award_spotlight_status;
            this.award_inventory_type = goldPurchase.award_inventory_type;
            this.coins_profile_id = goldPurchase.coins_profile_id;
            this.is_predict_within_answer_period = goldPurchase.is_predict_within_answer_period;
            this.group_award_tier = goldPurchase.group_award_tier;
            this.number_weeks_premium = goldPurchase.number_weeks_premium;
            this.group_award_count = goldPurchase.group_award_count;
            this.premium_marketing_benefit = goldPurchase.premium_marketing_benefit;
            this.transfer_currency_type = goldPurchase.transfer_currency_type;
            this.transfer_type = goldPurchase.transfer_type;
            this.transfer_amount = goldPurchase.transfer_amount;
            this.premium_cancel_reason = goldPurchase.premium_cancel_reason;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.type;
        }
        
        public static /* synthetic */ Boolean access$1000(final Builder builder) {
            return builder.gilded_content;
        }
        
        public static /* synthetic */ String access$1100(final Builder builder) {
            return builder.source;
        }
        
        public static /* synthetic */ Integer access$1200(final Builder builder) {
            return builder.number_coins;
        }
        
        public static /* synthetic */ Integer access$1300(final Builder builder) {
            return builder.number_coins_monthly;
        }
        
        public static /* synthetic */ Integer access$1400(final Builder builder) {
            return builder.number_coins_bonus;
        }
        
        public static /* synthetic */ String access$1500(final Builder builder) {
            return builder.transaction_id;
        }
        
        public static /* synthetic */ String access$1600(final Builder builder) {
            return builder.content_type;
        }
        
        public static /* synthetic */ String access$1700(final Builder builder) {
            return builder.default_option;
        }
        
        public static /* synthetic */ Boolean access$1800(final Builder builder) {
            return builder.default_anonymous;
        }
        
        public static /* synthetic */ Boolean access$1900(final Builder builder) {
            return builder.purchased_coins;
        }
        
        public static /* synthetic */ Integer access$200(final Builder builder) {
            return builder.number_months;
        }
        
        public static /* synthetic */ String access$2000(final Builder builder) {
            return builder.proxy_for_user_id;
        }
        
        public static /* synthetic */ String access$2100(final Builder builder) {
            return builder.award_id;
        }
        
        public static /* synthetic */ String access$2200(final Builder builder) {
            return builder.award_name;
        }
        
        public static /* synthetic */ Boolean access$2300(final Builder builder) {
            return builder.is_mod_award;
        }
        
        public static /* synthetic */ List access$2400(final Builder builder) {
            return builder.available_award_ids;
        }
        
        public static /* synthetic */ Integer access$2500(final Builder builder) {
            return builder.number_coins_to_recipient;
        }
        
        public static /* synthetic */ Integer access$2600(final Builder builder) {
            return builder.number_coins_to_community;
        }
        
        public static /* synthetic */ Long access$2700(final Builder builder) {
            return builder.start_timestamp;
        }
        
        public static /* synthetic */ Long access$2800(final Builder builder) {
            return builder.end_timestamp;
        }
        
        public static /* synthetic */ Boolean access$2900(final Builder builder) {
            return builder.gift_public;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.one_time_type;
        }
        
        public static /* synthetic */ Integer access$3000(final Builder builder) {
            return builder.number_free_coins;
        }
        
        public static /* synthetic */ Integer access$3100(final Builder builder) {
            return builder.number_paid_coins;
        }
        
        public static /* synthetic */ Integer access$3200(final Builder builder) {
            return builder.paid_coins_revenue_pennies;
        }
        
        public static /* synthetic */ String access$3300(final Builder builder) {
            return builder.coin_package_id;
        }
        
        public static /* synthetic */ Boolean access$3400(final Builder builder) {
            return builder.is_temporary_award;
        }
        
        public static /* synthetic */ Boolean access$3500(final Builder builder) {
            return builder.is_sale_enabled;
        }
        
        public static /* synthetic */ Double access$3600(final Builder builder) {
            return builder.coin_bonus_percentage;
        }
        
        public static /* synthetic */ Double access$3700(final Builder builder) {
            return builder.coin_sale_percentage;
        }
        
        public static /* synthetic */ String access$3800(final Builder builder) {
            return builder.offer_context;
        }
        
        public static /* synthetic */ String access$3900(final Builder builder) {
            return builder.offer_type;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.gift_user_id;
        }
        
        public static /* synthetic */ Integer access$4000(final Builder builder) {
            return builder.award_col_position;
        }
        
        public static /* synthetic */ Integer access$4100(final Builder builder) {
            return builder.award_row_position;
        }
        
        public static /* synthetic */ Long access$4200(final Builder builder) {
            return builder.awarder_karma_earned;
        }
        
        public static /* synthetic */ Long access$4300(final Builder builder) {
            return builder.awardee_karma_earned;
        }
        
        public static /* synthetic */ Long access$4400(final Builder builder) {
            return builder.user_post_award_karma;
        }
        
        public static /* synthetic */ Long access$4500(final Builder builder) {
            return builder.user_comment_award_karma;
        }
        
        public static /* synthetic */ Long access$4600(final Builder builder) {
            return builder.target_user_post_karma;
        }
        
        public static /* synthetic */ Long access$4700(final Builder builder) {
            return builder.target_user_comment_karma;
        }
        
        public static /* synthetic */ Long access$4800(final Builder builder) {
            return builder.user_subreddit_post_karma;
        }
        
        public static /* synthetic */ Long access$4900(final Builder builder) {
            return builder.user_subreddit_comment_karma;
        }
        
        public static /* synthetic */ Boolean access$500(final Builder builder) {
            return builder.gift_anonymous;
        }
        
        public static /* synthetic */ Boolean access$5000(final Builder builder) {
            return builder.award_affects_awardee_karma;
        }
        
        public static /* synthetic */ Boolean access$5100(final Builder builder) {
            return builder.award_affects_awarder_karma;
        }
        
        public static /* synthetic */ String access$5200(final Builder builder) {
            return builder.filter_name;
        }
        
        public static /* synthetic */ String access$5300(final Builder builder) {
            return builder.filter_id;
        }
        
        public static /* synthetic */ String access$5400(final Builder builder) {
            return builder.award_spotlight_status;
        }
        
        public static /* synthetic */ String access$5500(final Builder builder) {
            return builder.award_inventory_type;
        }
        
        public static /* synthetic */ String access$5600(final Builder builder) {
            return builder.coins_profile_id;
        }
        
        public static /* synthetic */ Boolean access$5700(final Builder builder) {
            return builder.is_predict_within_answer_period;
        }
        
        public static /* synthetic */ String access$5800(final Builder builder) {
            return builder.group_award_tier;
        }
        
        public static /* synthetic */ Integer access$5900(final Builder builder) {
            return builder.number_weeks_premium;
        }
        
        public static /* synthetic */ Boolean access$600(final Builder builder) {
            return builder.gift_message;
        }
        
        public static /* synthetic */ Integer access$6000(final Builder builder) {
            return builder.group_award_count;
        }
        
        public static /* synthetic */ String access$6100(final Builder builder) {
            return builder.premium_marketing_benefit;
        }
        
        public static /* synthetic */ String access$6200(final Builder builder) {
            return builder.transfer_currency_type;
        }
        
        public static /* synthetic */ String access$6300(final Builder builder) {
            return builder.transfer_type;
        }
        
        public static /* synthetic */ Long access$6400(final Builder builder) {
            return builder.transfer_amount;
        }
        
        public static /* synthetic */ String access$6500(final Builder builder) {
            return builder.premium_cancel_reason;
        }
        
        public static /* synthetic */ Integer access$700(final Builder builder) {
            return builder.gift_message_length;
        }
        
        public static /* synthetic */ Integer access$800(final Builder builder) {
            return builder.number_creddits;
        }
        
        public static /* synthetic */ String access$900(final Builder builder) {
            return builder.subscription_type;
        }
        
        public Builder available_award_ids(final List<String> available_award_ids) {
            this.available_award_ids = available_award_ids;
            return this;
        }
        
        public Builder award_affects_awardee_karma(final Boolean award_affects_awardee_karma) {
            this.award_affects_awardee_karma = award_affects_awardee_karma;
            return this;
        }
        
        public Builder award_affects_awarder_karma(final Boolean award_affects_awarder_karma) {
            this.award_affects_awarder_karma = award_affects_awarder_karma;
            return this;
        }
        
        public Builder award_col_position(final Integer award_col_position) {
            this.award_col_position = award_col_position;
            return this;
        }
        
        public Builder award_id(final String award_id) {
            this.award_id = award_id;
            return this;
        }
        
        public Builder award_inventory_type(final String award_inventory_type) {
            this.award_inventory_type = award_inventory_type;
            return this;
        }
        
        public Builder award_name(final String award_name) {
            this.award_name = award_name;
            return this;
        }
        
        public Builder award_row_position(final Integer award_row_position) {
            this.award_row_position = award_row_position;
            return this;
        }
        
        public Builder award_spotlight_status(final String award_spotlight_status) {
            this.award_spotlight_status = award_spotlight_status;
            return this;
        }
        
        public Builder awardee_karma_earned(final Long awardee_karma_earned) {
            this.awardee_karma_earned = awardee_karma_earned;
            return this;
        }
        
        public Builder awarder_karma_earned(final Long awarder_karma_earned) {
            this.awarder_karma_earned = awarder_karma_earned;
            return this;
        }
        
        public GoldPurchase build() {
            return new GoldPurchase(this, null);
        }
        
        public Builder coin_bonus_percentage(final Double coin_bonus_percentage) {
            this.coin_bonus_percentage = coin_bonus_percentage;
            return this;
        }
        
        public Builder coin_package_id(final String coin_package_id) {
            this.coin_package_id = coin_package_id;
            return this;
        }
        
        public Builder coin_sale_percentage(final Double coin_sale_percentage) {
            this.coin_sale_percentage = coin_sale_percentage;
            return this;
        }
        
        public Builder coins_profile_id(final String coins_profile_id) {
            this.coins_profile_id = coins_profile_id;
            return this;
        }
        
        public Builder content_type(final String content_type) {
            this.content_type = content_type;
            return this;
        }
        
        public Builder default_anonymous(final Boolean default_anonymous) {
            this.default_anonymous = default_anonymous;
            return this;
        }
        
        public Builder default_option(final String default_option) {
            this.default_option = default_option;
            return this;
        }
        
        public Builder end_timestamp(final Long end_timestamp) {
            this.end_timestamp = end_timestamp;
            return this;
        }
        
        public Builder filter_id(final String filter_id) {
            this.filter_id = filter_id;
            return this;
        }
        
        public Builder filter_name(final String filter_name) {
            this.filter_name = filter_name;
            return this;
        }
        
        public Builder gift_anonymous(final Boolean gift_anonymous) {
            this.gift_anonymous = gift_anonymous;
            return this;
        }
        
        public Builder gift_message(final Boolean gift_message) {
            this.gift_message = gift_message;
            return this;
        }
        
        public Builder gift_message_length(final Integer gift_message_length) {
            this.gift_message_length = gift_message_length;
            return this;
        }
        
        public Builder gift_public(final Boolean gift_public) {
            this.gift_public = gift_public;
            return this;
        }
        
        public Builder gift_user_id(final String gift_user_id) {
            this.gift_user_id = gift_user_id;
            return this;
        }
        
        public Builder gilded_content(final Boolean gilded_content) {
            this.gilded_content = gilded_content;
            return this;
        }
        
        public Builder group_award_count(final Integer group_award_count) {
            this.group_award_count = group_award_count;
            return this;
        }
        
        public Builder group_award_tier(final String group_award_tier) {
            this.group_award_tier = group_award_tier;
            return this;
        }
        
        public Builder is_mod_award(final Boolean is_mod_award) {
            this.is_mod_award = is_mod_award;
            return this;
        }
        
        public Builder is_predict_within_answer_period(final Boolean is_predict_within_answer_period) {
            this.is_predict_within_answer_period = is_predict_within_answer_period;
            return this;
        }
        
        public Builder is_sale_enabled(final Boolean is_sale_enabled) {
            this.is_sale_enabled = is_sale_enabled;
            return this;
        }
        
        public Builder is_temporary_award(final Boolean is_temporary_award) {
            this.is_temporary_award = is_temporary_award;
            return this;
        }
        
        public Builder number_coins(final Integer number_coins) {
            this.number_coins = number_coins;
            return this;
        }
        
        public Builder number_coins_bonus(final Integer number_coins_bonus) {
            this.number_coins_bonus = number_coins_bonus;
            return this;
        }
        
        public Builder number_coins_monthly(final Integer number_coins_monthly) {
            this.number_coins_monthly = number_coins_monthly;
            return this;
        }
        
        public Builder number_coins_to_community(final Integer number_coins_to_community) {
            this.number_coins_to_community = number_coins_to_community;
            return this;
        }
        
        public Builder number_coins_to_recipient(final Integer number_coins_to_recipient) {
            this.number_coins_to_recipient = number_coins_to_recipient;
            return this;
        }
        
        public Builder number_creddits(final Integer number_creddits) {
            this.number_creddits = number_creddits;
            return this;
        }
        
        public Builder number_free_coins(final Integer number_free_coins) {
            this.number_free_coins = number_free_coins;
            return this;
        }
        
        public Builder number_months(final Integer number_months) {
            this.number_months = number_months;
            return this;
        }
        
        public Builder number_paid_coins(final Integer number_paid_coins) {
            this.number_paid_coins = number_paid_coins;
            return this;
        }
        
        public Builder number_weeks_premium(final Integer number_weeks_premium) {
            this.number_weeks_premium = number_weeks_premium;
            return this;
        }
        
        public Builder offer_context(final String offer_context) {
            this.offer_context = offer_context;
            return this;
        }
        
        public Builder offer_type(final String offer_type) {
            this.offer_type = offer_type;
            return this;
        }
        
        public Builder one_time_type(final String one_time_type) {
            this.one_time_type = one_time_type;
            return this;
        }
        
        public Builder paid_coins_revenue_pennies(final Integer paid_coins_revenue_pennies) {
            this.paid_coins_revenue_pennies = paid_coins_revenue_pennies;
            return this;
        }
        
        public Builder premium_cancel_reason(final String premium_cancel_reason) {
            this.premium_cancel_reason = premium_cancel_reason;
            return this;
        }
        
        public Builder premium_marketing_benefit(final String premium_marketing_benefit) {
            this.premium_marketing_benefit = premium_marketing_benefit;
            return this;
        }
        
        public Builder proxy_for_user_id(final String proxy_for_user_id) {
            this.proxy_for_user_id = proxy_for_user_id;
            return this;
        }
        
        public Builder purchased_coins(final Boolean purchased_coins) {
            this.purchased_coins = purchased_coins;
            return this;
        }
        
        public void reset() {
            this.type = null;
            this.number_months = null;
            this.one_time_type = null;
            this.gift_user_id = null;
            this.gift_anonymous = null;
            this.gift_message = null;
            this.gift_message_length = null;
            this.number_creddits = null;
            this.subscription_type = null;
            this.gilded_content = null;
            this.source = null;
            this.number_coins = null;
            this.number_coins_monthly = null;
            this.number_coins_bonus = null;
            this.transaction_id = null;
            this.content_type = null;
            this.default_option = null;
            this.default_anonymous = null;
            this.purchased_coins = null;
            this.proxy_for_user_id = null;
            this.award_id = null;
            this.award_name = null;
            this.is_mod_award = null;
            this.available_award_ids = null;
            this.number_coins_to_recipient = null;
            this.number_coins_to_community = null;
            this.start_timestamp = null;
            this.end_timestamp = null;
            this.gift_public = null;
            this.number_free_coins = null;
            this.number_paid_coins = null;
            this.paid_coins_revenue_pennies = null;
            this.coin_package_id = null;
            this.is_temporary_award = null;
            this.is_sale_enabled = null;
            this.coin_bonus_percentage = null;
            this.coin_sale_percentage = null;
            this.offer_context = null;
            this.offer_type = null;
            this.award_col_position = null;
            this.award_row_position = null;
            this.awarder_karma_earned = null;
            this.awardee_karma_earned = null;
            this.user_post_award_karma = null;
            this.user_comment_award_karma = null;
            this.target_user_post_karma = null;
            this.target_user_comment_karma = null;
            this.user_subreddit_post_karma = null;
            this.user_subreddit_comment_karma = null;
            this.award_affects_awardee_karma = null;
            this.award_affects_awarder_karma = null;
            this.filter_name = null;
            this.filter_id = null;
            this.award_spotlight_status = null;
            this.award_inventory_type = null;
            this.coins_profile_id = null;
            this.is_predict_within_answer_period = null;
            this.group_award_tier = null;
            this.number_weeks_premium = null;
            this.group_award_count = null;
            this.premium_marketing_benefit = null;
            this.transfer_currency_type = null;
            this.transfer_type = null;
            this.transfer_amount = null;
            this.premium_cancel_reason = null;
        }
        
        public Builder source(final String source) {
            this.source = source;
            return this;
        }
        
        public Builder start_timestamp(final Long start_timestamp) {
            this.start_timestamp = start_timestamp;
            return this;
        }
        
        public Builder subscription_type(final String subscription_type) {
            this.subscription_type = subscription_type;
            return this;
        }
        
        public Builder target_user_comment_karma(final Long target_user_comment_karma) {
            this.target_user_comment_karma = target_user_comment_karma;
            return this;
        }
        
        public Builder target_user_post_karma(final Long target_user_post_karma) {
            this.target_user_post_karma = target_user_post_karma;
            return this;
        }
        
        public Builder transaction_id(final String transaction_id) {
            this.transaction_id = transaction_id;
            return this;
        }
        
        public Builder transfer_amount(final Long transfer_amount) {
            this.transfer_amount = transfer_amount;
            return this;
        }
        
        public Builder transfer_currency_type(final String transfer_currency_type) {
            this.transfer_currency_type = transfer_currency_type;
            return this;
        }
        
        public Builder transfer_type(final String transfer_type) {
            this.transfer_type = transfer_type;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
        
        public Builder user_comment_award_karma(final Long user_comment_award_karma) {
            this.user_comment_award_karma = user_comment_award_karma;
            return this;
        }
        
        public Builder user_post_award_karma(final Long user_post_award_karma) {
            this.user_post_award_karma = user_post_award_karma;
            return this;
        }
        
        public Builder user_subreddit_comment_karma(final Long user_subreddit_comment_karma) {
            this.user_subreddit_comment_karma = user_subreddit_comment_karma;
            return this;
        }
        
        public Builder user_subreddit_post_karma(final Long user_subreddit_post_karma) {
            this.user_subreddit_post_karma = user_subreddit_post_karma;
            return this;
        }
    }
    
    public static final class GoldPurchaseAdapter implements a<GoldPurchase, Builder>
    {
        private GoldPurchaseAdapter() {
        }
        
        public GoldPurchase read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public GoldPurchase read(final e e, final Builder builder) throws IOException {
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
                    case 65: {
                        if (a == 11) {
                            builder.premium_cancel_reason(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 64: {
                        if (a == 10) {
                            builder.transfer_amount(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 63: {
                        if (a == 11) {
                            builder.transfer_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 62: {
                        if (a == 11) {
                            builder.transfer_currency_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 61: {
                        if (a == 11) {
                            builder.premium_marketing_benefit(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 60: {
                        if (a == 8) {
                            builder.group_award_count(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 59: {
                        if (a == 8) {
                            builder.number_weeks_premium(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 58: {
                        if (a == 11) {
                            builder.group_award_tier(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 57: {
                        if (a == 2) {
                            builder.is_predict_within_answer_period(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 56: {
                        if (a == 11) {
                            builder.coins_profile_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 55: {
                        if (a == 11) {
                            builder.award_inventory_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 54: {
                        if (a == 11) {
                            builder.award_spotlight_status(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 53: {
                        if (a == 11) {
                            builder.filter_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 52: {
                        if (a == 11) {
                            builder.filter_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 51: {
                        if (a == 2) {
                            builder.award_affects_awarder_karma(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 50: {
                        if (a == 2) {
                            builder.award_affects_awardee_karma(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 49: {
                        if (a == 10) {
                            builder.user_subreddit_comment_karma(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 48: {
                        if (a == 10) {
                            builder.user_subreddit_post_karma(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 47: {
                        if (a == 10) {
                            builder.target_user_comment_karma(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 46: {
                        if (a == 10) {
                            builder.target_user_post_karma(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 45: {
                        if (a == 10) {
                            builder.user_comment_award_karma(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 44: {
                        if (a == 10) {
                            builder.user_post_award_karma(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 43: {
                        if (a == 10) {
                            builder.awardee_karma_earned(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 42: {
                        if (a == 10) {
                            builder.awarder_karma_earned(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 41: {
                        if (a == 8) {
                            builder.award_row_position(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 40: {
                        if (a == 8) {
                            builder.award_col_position(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 39: {
                        if (a == 11) {
                            builder.offer_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 38: {
                        if (a == 11) {
                            builder.offer_context(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 37: {
                        if (a == 4) {
                            builder.coin_sale_percentage(e.h());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 36: {
                        if (a == 4) {
                            builder.coin_bonus_percentage(e.h());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 35: {
                        if (a == 2) {
                            builder.is_sale_enabled(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 34: {
                        if (a == 2) {
                            builder.is_temporary_award(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 33: {
                        if (a == 11) {
                            builder.coin_package_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 32: {
                        if (a == 8) {
                            builder.paid_coins_revenue_pennies(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 31: {
                        if (a == 8) {
                            builder.number_paid_coins(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 30: {
                        if (a == 8) {
                            builder.number_free_coins(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 29: {
                        if (a == 2) {
                            builder.gift_public(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 28: {
                        if (a == 10) {
                            builder.end_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 27: {
                        if (a == 10) {
                            builder.start_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 26: {
                        if (a == 8) {
                            builder.number_coins_to_community(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 25: {
                        if (a == 8) {
                            builder.number_coins_to_recipient(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 24: {
                        if (a == 15) {
                            final c w = e.w();
                            final ArrayList list = new ArrayList(w.b);
                            for (int i = 0; i < w.b; i = d.h(e, list, i, 1)) {}
                            e.x();
                            builder.available_award_ids((List<String>)list);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 23: {
                        if (a == 2) {
                            builder.is_mod_award(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 22: {
                        if (a == 11) {
                            builder.award_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 21: {
                        if (a == 11) {
                            builder.award_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 20: {
                        if (a == 11) {
                            builder.proxy_for_user_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 19: {
                        if (a == 2) {
                            builder.purchased_coins(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 18: {
                        if (a == 2) {
                            builder.default_anonymous(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 17: {
                        if (a == 11) {
                            builder.default_option(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 16: {
                        if (a == 11) {
                            builder.content_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 15: {
                        if (a == 11) {
                            builder.transaction_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 14: {
                        if (a == 8) {
                            builder.number_coins_bonus(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 8) {
                            builder.number_coins_monthly(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 8) {
                            builder.number_coins(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 11) {
                            builder.source(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 2) {
                            builder.gilded_content(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 11) {
                            builder.subscription_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 8) {
                            builder.number_creddits(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 8) {
                            builder.gift_message_length(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 2) {
                            builder.gift_message(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 2) {
                            builder.gift_anonymous(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.gift_user_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.one_time_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 8) {
                            builder.number_months(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.type(e.F());
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
        
        public void write(final e e, final GoldPurchase goldPurchase) throws IOException {
            e.a0();
            if (goldPurchase.type != null) {
                e.N(1, (byte)11);
                e.Z(goldPurchase.type);
                e.O();
            }
            if (goldPurchase.number_months != null) {
                e.N(2, (byte)8);
                b.r(goldPurchase.number_months, e);
            }
            if (goldPurchase.one_time_type != null) {
                e.N(3, (byte)11);
                e.Z(goldPurchase.one_time_type);
                e.O();
            }
            if (goldPurchase.gift_user_id != null) {
                e.N(4, (byte)11);
                e.Z(goldPurchase.gift_user_id);
                e.O();
            }
            if (goldPurchase.gift_anonymous != null) {
                e.N(5, (byte)2);
                d.z(goldPurchase.gift_anonymous, e);
            }
            if (goldPurchase.gift_message != null) {
                e.N(6, (byte)2);
                d.z(goldPurchase.gift_message, e);
            }
            if (goldPurchase.gift_message_length != null) {
                e.N(7, (byte)8);
                b.r(goldPurchase.gift_message_length, e);
            }
            if (goldPurchase.number_creddits != null) {
                e.N(8, (byte)8);
                b.r(goldPurchase.number_creddits, e);
            }
            if (goldPurchase.subscription_type != null) {
                e.N(9, (byte)11);
                e.Z(goldPurchase.subscription_type);
                e.O();
            }
            if (goldPurchase.gilded_content != null) {
                e.N(10, (byte)2);
                d.z(goldPurchase.gilded_content, e);
            }
            if (goldPurchase.source != null) {
                e.N(11, (byte)11);
                e.Z(goldPurchase.source);
                e.O();
            }
            if (goldPurchase.number_coins != null) {
                e.N(12, (byte)8);
                b.r(goldPurchase.number_coins, e);
            }
            if (goldPurchase.number_coins_monthly != null) {
                e.N(13, (byte)8);
                b.r(goldPurchase.number_coins_monthly, e);
            }
            if (goldPurchase.number_coins_bonus != null) {
                e.N(14, (byte)8);
                b.r(goldPurchase.number_coins_bonus, e);
            }
            if (goldPurchase.transaction_id != null) {
                e.N(15, (byte)11);
                e.Z(goldPurchase.transaction_id);
                e.O();
            }
            if (goldPurchase.content_type != null) {
                e.N(16, (byte)11);
                e.Z(goldPurchase.content_type);
                e.O();
            }
            if (goldPurchase.default_option != null) {
                e.N(17, (byte)11);
                e.Z(goldPurchase.default_option);
                e.O();
            }
            if (goldPurchase.default_anonymous != null) {
                e.N(18, (byte)2);
                d.z(goldPurchase.default_anonymous, e);
            }
            if (goldPurchase.purchased_coins != null) {
                e.N(19, (byte)2);
                d.z(goldPurchase.purchased_coins, e);
            }
            if (goldPurchase.proxy_for_user_id != null) {
                e.N(20, (byte)11);
                e.Z(goldPurchase.proxy_for_user_id);
                e.O();
            }
            if (goldPurchase.award_id != null) {
                e.N(21, (byte)11);
                e.Z(goldPurchase.award_id);
                e.O();
            }
            if (goldPurchase.award_name != null) {
                e.N(22, (byte)11);
                e.Z(goldPurchase.award_name);
                e.O();
            }
            if (goldPurchase.is_mod_award != null) {
                e.N(23, (byte)2);
                d.z(goldPurchase.is_mod_award, e);
            }
            if (goldPurchase.available_award_ids != null) {
                e.N(24, (byte)15);
                e.V((byte)11, goldPurchase.available_award_ids.size());
                final Iterator<String> iterator = goldPurchase.available_award_ids.iterator();
                while (iterator.hasNext()) {
                    e.Z((String)iterator.next());
                }
                e.X();
                e.O();
            }
            if (goldPurchase.number_coins_to_recipient != null) {
                e.N(25, (byte)8);
                b.r(goldPurchase.number_coins_to_recipient, e);
            }
            if (goldPurchase.number_coins_to_community != null) {
                e.N(26, (byte)8);
                b.r(goldPurchase.number_coins_to_community, e);
            }
            if (goldPurchase.start_timestamp != null) {
                e.N(27, (byte)10);
                a.r(goldPurchase.start_timestamp, e);
            }
            if (goldPurchase.end_timestamp != null) {
                e.N(28, (byte)10);
                a.r(goldPurchase.end_timestamp, e);
            }
            if (goldPurchase.gift_public != null) {
                e.N(29, (byte)2);
                d.z(goldPurchase.gift_public, e);
            }
            if (goldPurchase.number_free_coins != null) {
                e.N(30, (byte)8);
                b.r(goldPurchase.number_free_coins, e);
            }
            if (goldPurchase.number_paid_coins != null) {
                e.N(31, (byte)8);
                b.r(goldPurchase.number_paid_coins, e);
            }
            if (goldPurchase.paid_coins_revenue_pennies != null) {
                e.N(32, (byte)8);
                b.r(goldPurchase.paid_coins_revenue_pennies, e);
            }
            if (goldPurchase.coin_package_id != null) {
                e.N(33, (byte)11);
                e.Z(goldPurchase.coin_package_id);
                e.O();
            }
            if (goldPurchase.is_temporary_award != null) {
                e.N(34, (byte)2);
                d.z(goldPurchase.is_temporary_award, e);
            }
            if (goldPurchase.is_sale_enabled != null) {
                e.N(35, (byte)2);
                d.z(goldPurchase.is_sale_enabled, e);
            }
            if (goldPurchase.coin_bonus_percentage != null) {
                e.N(36, (byte)4);
                androidx.viewpager.widget.c.r(goldPurchase.coin_bonus_percentage, e);
            }
            if (goldPurchase.coin_sale_percentage != null) {
                e.N(37, (byte)4);
                androidx.viewpager.widget.c.r(goldPurchase.coin_sale_percentage, e);
            }
            if (goldPurchase.offer_context != null) {
                e.N(38, (byte)11);
                e.Z(goldPurchase.offer_context);
                e.O();
            }
            if (goldPurchase.offer_type != null) {
                e.N(39, (byte)11);
                e.Z(goldPurchase.offer_type);
                e.O();
            }
            if (goldPurchase.award_col_position != null) {
                e.N(40, (byte)8);
                b.r(goldPurchase.award_col_position, e);
            }
            if (goldPurchase.award_row_position != null) {
                e.N(41, (byte)8);
                b.r(goldPurchase.award_row_position, e);
            }
            if (goldPurchase.awarder_karma_earned != null) {
                e.N(42, (byte)10);
                a.r(goldPurchase.awarder_karma_earned, e);
            }
            if (goldPurchase.awardee_karma_earned != null) {
                e.N(43, (byte)10);
                a.r(goldPurchase.awardee_karma_earned, e);
            }
            if (goldPurchase.user_post_award_karma != null) {
                e.N(44, (byte)10);
                a.r(goldPurchase.user_post_award_karma, e);
            }
            if (goldPurchase.user_comment_award_karma != null) {
                e.N(45, (byte)10);
                a.r(goldPurchase.user_comment_award_karma, e);
            }
            if (goldPurchase.target_user_post_karma != null) {
                e.N(46, (byte)10);
                a.r(goldPurchase.target_user_post_karma, e);
            }
            if (goldPurchase.target_user_comment_karma != null) {
                e.N(47, (byte)10);
                a.r(goldPurchase.target_user_comment_karma, e);
            }
            if (goldPurchase.user_subreddit_post_karma != null) {
                e.N(48, (byte)10);
                a.r(goldPurchase.user_subreddit_post_karma, e);
            }
            if (goldPurchase.user_subreddit_comment_karma != null) {
                e.N(49, (byte)10);
                a.r(goldPurchase.user_subreddit_comment_karma, e);
            }
            if (goldPurchase.award_affects_awardee_karma != null) {
                e.N(50, (byte)2);
                d.z(goldPurchase.award_affects_awardee_karma, e);
            }
            if (goldPurchase.award_affects_awarder_karma != null) {
                e.N(51, (byte)2);
                d.z(goldPurchase.award_affects_awarder_karma, e);
            }
            if (goldPurchase.filter_name != null) {
                e.N(52, (byte)11);
                e.Z(goldPurchase.filter_name);
                e.O();
            }
            if (goldPurchase.filter_id != null) {
                e.N(53, (byte)11);
                e.Z(goldPurchase.filter_id);
                e.O();
            }
            if (goldPurchase.award_spotlight_status != null) {
                e.N(54, (byte)11);
                e.Z(goldPurchase.award_spotlight_status);
                e.O();
            }
            if (goldPurchase.award_inventory_type != null) {
                e.N(55, (byte)11);
                e.Z(goldPurchase.award_inventory_type);
                e.O();
            }
            if (goldPurchase.coins_profile_id != null) {
                e.N(56, (byte)11);
                e.Z(goldPurchase.coins_profile_id);
                e.O();
            }
            if (goldPurchase.is_predict_within_answer_period != null) {
                e.N(57, (byte)2);
                d.z(goldPurchase.is_predict_within_answer_period, e);
            }
            if (goldPurchase.group_award_tier != null) {
                e.N(58, (byte)11);
                e.Z(goldPurchase.group_award_tier);
                e.O();
            }
            if (goldPurchase.number_weeks_premium != null) {
                e.N(59, (byte)8);
                b.r(goldPurchase.number_weeks_premium, e);
            }
            if (goldPurchase.group_award_count != null) {
                e.N(60, (byte)8);
                b.r(goldPurchase.group_award_count, e);
            }
            if (goldPurchase.premium_marketing_benefit != null) {
                e.N(61, (byte)11);
                e.Z(goldPurchase.premium_marketing_benefit);
                e.O();
            }
            if (goldPurchase.transfer_currency_type != null) {
                e.N(62, (byte)11);
                e.Z(goldPurchase.transfer_currency_type);
                e.O();
            }
            if (goldPurchase.transfer_type != null) {
                e.N(63, (byte)11);
                e.Z(goldPurchase.transfer_type);
                e.O();
            }
            if (goldPurchase.transfer_amount != null) {
                e.N(64, (byte)10);
                a.r(goldPurchase.transfer_amount, e);
            }
            if (goldPurchase.premium_cancel_reason != null) {
                e.N(65, (byte)11);
                e.Z(goldPurchase.premium_cancel_reason);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
