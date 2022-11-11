// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Restrict
{
    public static final a<Restrict, Restrict.Restrict$Builder> ADAPTER;
    public final Boolean crossposts;
    public final Boolean image_posts;
    public final String interstitial_warning_message;
    public final Boolean media_embeds;
    public final Boolean nsfw;
    public final Boolean poll_posts;
    public final Boolean subreddit_images;
    public final Boolean subreddit_linking;
    public final Boolean subreddit_styles;
    public final Boolean subscriber_count_visibility;
    public final Boolean unverified_email_interaction;
    public final Boolean unverified_email_viewers;
    public final Boolean username_linking;
    public final Boolean video_posts;
    
    static {
        ADAPTER = (a)new Restrict.Restrict$RestrictAdapter((Restrict$1)null);
    }
    
    private Restrict(final Restrict.Restrict$Builder restrict$Builder) {
        this.image_posts = Restrict.Restrict$Builder.access$100(restrict$Builder);
        this.poll_posts = Restrict.Restrict$Builder.access$200(restrict$Builder);
        this.video_posts = Restrict.Restrict$Builder.access$300(restrict$Builder);
        this.username_linking = Restrict.Restrict$Builder.access$400(restrict$Builder);
        this.subreddit_linking = Restrict.Restrict$Builder.access$500(restrict$Builder);
        this.unverified_email_viewers = Restrict.Restrict$Builder.access$600(restrict$Builder);
        this.unverified_email_interaction = Restrict.Restrict$Builder.access$700(restrict$Builder);
        this.subreddit_styles = Restrict.Restrict$Builder.access$800(restrict$Builder);
        this.media_embeds = Restrict.Restrict$Builder.access$900(restrict$Builder);
        this.crossposts = Restrict.Restrict$Builder.access$1000(restrict$Builder);
        this.subscriber_count_visibility = Restrict.Restrict$Builder.access$1100(restrict$Builder);
        this.subreddit_images = Restrict.Restrict$Builder.access$1200(restrict$Builder);
        this.nsfw = Restrict.Restrict$Builder.access$1300(restrict$Builder);
        this.interstitial_warning_message = Restrict.Restrict$Builder.access$1400(restrict$Builder);
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
        if (!(o instanceof Restrict)) {
            return false;
        }
        final Restrict restrict = (Restrict)o;
        final Boolean image_posts = this.image_posts;
        final Boolean image_posts2 = restrict.image_posts;
        if (image_posts == image_posts2 || (image_posts != null && image_posts.equals(image_posts2))) {
            final Boolean poll_posts = this.poll_posts;
            final Boolean poll_posts2 = restrict.poll_posts;
            if (poll_posts == poll_posts2 || (poll_posts != null && poll_posts.equals(poll_posts2))) {
                final Boolean video_posts = this.video_posts;
                final Boolean video_posts2 = restrict.video_posts;
                if (video_posts == video_posts2 || (video_posts != null && video_posts.equals(video_posts2))) {
                    final Boolean username_linking = this.username_linking;
                    final Boolean username_linking2 = restrict.username_linking;
                    if (username_linking == username_linking2 || (username_linking != null && username_linking.equals(username_linking2))) {
                        final Boolean subreddit_linking = this.subreddit_linking;
                        final Boolean subreddit_linking2 = restrict.subreddit_linking;
                        if (subreddit_linking == subreddit_linking2 || (subreddit_linking != null && subreddit_linking.equals(subreddit_linking2))) {
                            final Boolean unverified_email_viewers = this.unverified_email_viewers;
                            final Boolean unverified_email_viewers2 = restrict.unverified_email_viewers;
                            if (unverified_email_viewers == unverified_email_viewers2 || (unverified_email_viewers != null && unverified_email_viewers.equals(unverified_email_viewers2))) {
                                final Boolean unverified_email_interaction = this.unverified_email_interaction;
                                final Boolean unverified_email_interaction2 = restrict.unverified_email_interaction;
                                if (unverified_email_interaction == unverified_email_interaction2 || (unverified_email_interaction != null && unverified_email_interaction.equals(unverified_email_interaction2))) {
                                    final Boolean subreddit_styles = this.subreddit_styles;
                                    final Boolean subreddit_styles2 = restrict.subreddit_styles;
                                    if (subreddit_styles == subreddit_styles2 || (subreddit_styles != null && subreddit_styles.equals(subreddit_styles2))) {
                                        final Boolean media_embeds = this.media_embeds;
                                        final Boolean media_embeds2 = restrict.media_embeds;
                                        if (media_embeds == media_embeds2 || (media_embeds != null && media_embeds.equals(media_embeds2))) {
                                            final Boolean crossposts = this.crossposts;
                                            final Boolean crossposts2 = restrict.crossposts;
                                            if (crossposts == crossposts2 || (crossposts != null && crossposts.equals(crossposts2))) {
                                                final Boolean subscriber_count_visibility = this.subscriber_count_visibility;
                                                final Boolean subscriber_count_visibility2 = restrict.subscriber_count_visibility;
                                                if (subscriber_count_visibility == subscriber_count_visibility2 || (subscriber_count_visibility != null && subscriber_count_visibility.equals(subscriber_count_visibility2))) {
                                                    final Boolean subreddit_images = this.subreddit_images;
                                                    final Boolean subreddit_images2 = restrict.subreddit_images;
                                                    if (subreddit_images == subreddit_images2 || (subreddit_images != null && subreddit_images.equals(subreddit_images2))) {
                                                        final Boolean nsfw = this.nsfw;
                                                        final Boolean nsfw2 = restrict.nsfw;
                                                        if (nsfw == nsfw2 || (nsfw != null && nsfw.equals(nsfw2))) {
                                                            final String interstitial_warning_message = this.interstitial_warning_message;
                                                            final String interstitial_warning_message2 = restrict.interstitial_warning_message;
                                                            boolean b2 = b;
                                                            if (interstitial_warning_message == interstitial_warning_message2) {
                                                                return b2;
                                                            }
                                                            if (interstitial_warning_message != null && interstitial_warning_message.equals(interstitial_warning_message2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final Boolean image_posts = this.image_posts;
        int hashCode = 0;
        int hashCode2;
        if (image_posts == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = image_posts.hashCode();
        }
        final Boolean poll_posts = this.poll_posts;
        int hashCode3;
        if (poll_posts == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = poll_posts.hashCode();
        }
        final Boolean video_posts = this.video_posts;
        int hashCode4;
        if (video_posts == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = video_posts.hashCode();
        }
        final Boolean username_linking = this.username_linking;
        int hashCode5;
        if (username_linking == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = username_linking.hashCode();
        }
        final Boolean subreddit_linking = this.subreddit_linking;
        int hashCode6;
        if (subreddit_linking == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = subreddit_linking.hashCode();
        }
        final Boolean unverified_email_viewers = this.unverified_email_viewers;
        int hashCode7;
        if (unverified_email_viewers == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = unverified_email_viewers.hashCode();
        }
        final Boolean unverified_email_interaction = this.unverified_email_interaction;
        int hashCode8;
        if (unverified_email_interaction == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = unverified_email_interaction.hashCode();
        }
        final Boolean subreddit_styles = this.subreddit_styles;
        int hashCode9;
        if (subreddit_styles == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = subreddit_styles.hashCode();
        }
        final Boolean media_embeds = this.media_embeds;
        int hashCode10;
        if (media_embeds == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = media_embeds.hashCode();
        }
        final Boolean crossposts = this.crossposts;
        int hashCode11;
        if (crossposts == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = crossposts.hashCode();
        }
        final Boolean subscriber_count_visibility = this.subscriber_count_visibility;
        int hashCode12;
        if (subscriber_count_visibility == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = subscriber_count_visibility.hashCode();
        }
        final Boolean subreddit_images = this.subreddit_images;
        int hashCode13;
        if (subreddit_images == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = subreddit_images.hashCode();
        }
        final Boolean nsfw = this.nsfw;
        int hashCode14;
        if (nsfw == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = nsfw.hashCode();
        }
        final String interstitial_warning_message = this.interstitial_warning_message;
        if (interstitial_warning_message != null) {
            hashCode = interstitial_warning_message.hashCode();
        }
        return ((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Restrict{image_posts=");
        k.append(this.image_posts);
        k.append(", poll_posts=");
        k.append(this.poll_posts);
        k.append(", video_posts=");
        k.append(this.video_posts);
        k.append(", username_linking=");
        k.append(this.username_linking);
        k.append(", subreddit_linking=");
        k.append(this.subreddit_linking);
        k.append(", unverified_email_viewers=");
        k.append(this.unverified_email_viewers);
        k.append(", unverified_email_interaction=");
        k.append(this.unverified_email_interaction);
        k.append(", subreddit_styles=");
        k.append(this.subreddit_styles);
        k.append(", media_embeds=");
        k.append(this.media_embeds);
        k.append(", crossposts=");
        k.append(this.crossposts);
        k.append(", subscriber_count_visibility=");
        k.append(this.subscriber_count_visibility);
        k.append(", subreddit_images=");
        k.append(this.subreddit_images);
        k.append(", nsfw=");
        k.append(this.nsfw);
        k.append(", interstitial_warning_message=");
        return b.j(k, this.interstitial_warning_message, "}");
    }
    
    public void write(final e e) throws IOException {
        Restrict.ADAPTER.write(e, (Object)this);
    }
}
