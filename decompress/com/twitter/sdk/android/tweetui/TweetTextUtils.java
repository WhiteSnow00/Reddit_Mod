// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.tweetui.internal.util.HtmlEntities;
import android.text.TextUtils;
import com.twitter.sdk.android.core.models.TweetEntities;
import com.twitter.sdk.android.core.models.SymbolEntity;
import com.twitter.sdk.android.core.models.MentionEntity;
import com.twitter.sdk.android.core.models.HashtagEntity;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.UrlEntity;
import com.twitter.sdk.android.core.models.Tweet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class TweetTextUtils
{
    private TweetTextUtils() {
    }
    
    public static void adjustEntitiesWithOffsets(final List<? extends FormattedUrlEntity> list, final List<Integer> list2) {
        if (list != null) {
            if (list2 != null) {
                for (final FormattedUrlEntity formattedUrlEntity : list) {
                    final int start = formattedUrlEntity.start;
                    int n = 0;
                    for (Iterator<Integer> iterator2 = list2.iterator(); iterator2.hasNext() && iterator2.next() - n <= start; ++n) {}
                    formattedUrlEntity.start += n;
                    formattedUrlEntity.end += n;
                }
            }
        }
    }
    
    public static void adjustIndicesForEscapedChars(final List<? extends FormattedUrlEntity> list, final List<int[]> list2) {
        if (list != null && list2 != null) {
            if (!list2.isEmpty()) {
                final int size = list2.size();
                final Iterator<? extends FormattedUrlEntity> iterator = list.iterator();
                int i = 0;
                int n = 0;
                while (iterator.hasNext()) {
                    final FormattedUrlEntity formattedUrlEntity = (FormattedUrlEntity)iterator.next();
                    int n2 = 0;
                    int n3 = i;
                    while (i < size) {
                        final int[] array = list2.get(i);
                        final int n4 = array[0];
                        final int n5 = array[1];
                        final int n6 = n5 - n4;
                        int n7;
                        int n8;
                        int n9;
                        if (n5 < formattedUrlEntity.start) {
                            n7 = n + n6;
                            n8 = n3 + 1;
                            n9 = n2;
                        }
                        else {
                            n8 = n3;
                            n7 = n;
                            n9 = n2;
                            if (n5 < formattedUrlEntity.end) {
                                n9 = n2 + n6;
                                n7 = n;
                                n8 = n3;
                            }
                        }
                        ++i;
                        n3 = n8;
                        n = n7;
                        n2 = n9;
                    }
                    final int start = formattedUrlEntity.start;
                    final int n10 = n2 + n;
                    formattedUrlEntity.start = start - n10;
                    formattedUrlEntity.end -= n10;
                    i = n3;
                }
            }
        }
    }
    
    public static void adjustIndicesForSupplementaryChars(final StringBuilder sb, final FormattedTweetText formattedTweetText) {
        final ArrayList list = new ArrayList();
        for (int length = sb.length(), i = 0; i < length - 1; ++i) {
            if (Character.isHighSurrogate(sb.charAt(i)) && Character.isLowSurrogate(sb.charAt(i + 1))) {
                list.add(i);
            }
        }
        adjustEntitiesWithOffsets(formattedTweetText.urlEntities, list);
        adjustEntitiesWithOffsets(formattedTweetText.mediaEntities, list);
        adjustEntitiesWithOffsets(formattedTweetText.hashtagEntities, list);
        adjustEntitiesWithOffsets(formattedTweetText.mentionEntities, list);
        adjustEntitiesWithOffsets(formattedTweetText.symbolEntities, list);
    }
    
    public static void convertEntities(final FormattedTweetText formattedTweetText, final Tweet tweet) {
        final TweetEntities entities = tweet.entities;
        if (entities == null) {
            return;
        }
        final List urls = entities.urls;
        if (urls != null) {
            final Iterator iterator = urls.iterator();
            while (iterator.hasNext()) {
                formattedTweetText.urlEntities.add(FormattedUrlEntity.createFormattedUrlEntity((UrlEntity)iterator.next()));
            }
        }
        final List media = tweet.entities.media;
        if (media != null) {
            final Iterator iterator2 = media.iterator();
            while (iterator2.hasNext()) {
                formattedTweetText.mediaEntities.add(new FormattedMediaEntity((MediaEntity)iterator2.next()));
            }
        }
        final List hashtags = tweet.entities.hashtags;
        if (hashtags != null) {
            final Iterator iterator3 = hashtags.iterator();
            while (iterator3.hasNext()) {
                formattedTweetText.hashtagEntities.add(FormattedUrlEntity.createFormattedUrlEntity((HashtagEntity)iterator3.next()));
            }
        }
        final List userMentions = tweet.entities.userMentions;
        if (userMentions != null) {
            final Iterator iterator4 = userMentions.iterator();
            while (iterator4.hasNext()) {
                formattedTweetText.mentionEntities.add(FormattedUrlEntity.createFormattedUrlEntity((MentionEntity)iterator4.next()));
            }
        }
        final List symbols = tweet.entities.symbols;
        if (symbols != null) {
            final Iterator iterator5 = symbols.iterator();
            while (iterator5.hasNext()) {
                formattedTweetText.symbolEntities.add(FormattedUrlEntity.createFormattedUrlEntity((SymbolEntity)iterator5.next()));
            }
        }
    }
    
    public static void format(final FormattedTweetText formattedTweetText, final Tweet tweet) {
        if (TextUtils.isEmpty((CharSequence)tweet.text)) {
            return;
        }
        final HtmlEntities.Unescaped unescape = HtmlEntities.HTML40.unescape(tweet.text);
        final StringBuilder sb = new StringBuilder(unescape.unescaped);
        adjustIndicesForEscapedChars(formattedTweetText.urlEntities, unescape.indices);
        adjustIndicesForEscapedChars(formattedTweetText.mediaEntities, unescape.indices);
        adjustIndicesForEscapedChars(formattedTweetText.hashtagEntities, unescape.indices);
        adjustIndicesForEscapedChars(formattedTweetText.mentionEntities, unescape.indices);
        adjustIndicesForEscapedChars(formattedTweetText.symbolEntities, unescape.indices);
        adjustIndicesForSupplementaryChars(sb, formattedTweetText);
        formattedTweetText.text = sb.toString();
    }
    
    public static FormattedTweetText formatTweetText(final Tweet tweet) {
        if (tweet == null) {
            return null;
        }
        final FormattedTweetText formattedTweetText = new FormattedTweetText();
        convertEntities(formattedTweetText, tweet);
        format(formattedTweetText, tweet);
        return formattedTweetText;
    }
}
