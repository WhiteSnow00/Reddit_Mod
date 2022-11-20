// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import java.util.Collections;
import java.util.Comparator;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.sdk.android.core.models.ModelUtils;
import java.util.Iterator;
import android.text.TextUtils;
import java.util.List;
import android.text.SpannableStringBuilder;
import java.util.regex.Pattern;

final class TweetTextLinkifier
{
    public static final Pattern QUOTED_STATUS_URL;
    public static final Pattern VINE_URL;
    
    static {
        QUOTED_STATUS_URL = Pattern.compile("^https?://twitter\\.com(/#!)?/\\w+/status/\\d+$");
        VINE_URL = Pattern.compile("^https?://vine\\.co(/#!)?/v/\\w+$");
    }
    
    private TweetTextLinkifier() {
    }
    
    private static void addUrlEntities(final SpannableStringBuilder spannableStringBuilder, final List<FormattedUrlEntity> list, final FormattedUrlEntity formattedUrlEntity, final LinkClickListener linkClickListener, final int n, final int n2) {
        if (list != null) {
            if (!list.isEmpty()) {
                int n3 = 0;
                for (final FormattedUrlEntity formattedUrlEntity2 : list) {
                    final int n4 = formattedUrlEntity2.start - n3;
                    final int n5 = formattedUrlEntity2.end - n3;
                    if (n4 >= 0 && n5 <= spannableStringBuilder.length()) {
                        if (formattedUrlEntity != null && formattedUrlEntity.start == formattedUrlEntity2.start) {
                            spannableStringBuilder.replace(n4, n5, (CharSequence)"");
                            n3 += n5 - n4;
                        }
                        else {
                            if (TextUtils.isEmpty((CharSequence)formattedUrlEntity2.displayUrl)) {
                                continue;
                            }
                            spannableStringBuilder.replace(n4, n5, (CharSequence)formattedUrlEntity2.displayUrl);
                            final int n6 = n5 - (formattedUrlEntity2.displayUrl.length() + n4);
                            n3 += n6;
                            spannableStringBuilder.setSpan((Object)new TweetTextLinkifier$2(n2, n, false, linkClickListener, formattedUrlEntity2), n4, n5 - n6, 33);
                        }
                    }
                }
            }
        }
    }
    
    public static FormattedUrlEntity getEntityToStrip(final String s, final List<FormattedUrlEntity> list, final boolean b, final boolean b2) {
        if (list.isEmpty()) {
            return null;
        }
        final FormattedUrlEntity formattedUrlEntity = list.get(list.size() - 1);
        if (stripLtrMarker(s).endsWith(formattedUrlEntity.url) && (isPhotoEntity(formattedUrlEntity) || (b && isQuotedStatus(formattedUrlEntity)) || (b2 && isVineCard(formattedUrlEntity)))) {
            return formattedUrlEntity;
        }
        return null;
    }
    
    public static boolean isPhotoEntity(final FormattedUrlEntity formattedUrlEntity) {
        return formattedUrlEntity instanceof FormattedMediaEntity && "photo".equals(((FormattedMediaEntity)formattedUrlEntity).type);
    }
    
    public static boolean isQuotedStatus(final FormattedUrlEntity formattedUrlEntity) {
        return TweetTextLinkifier.QUOTED_STATUS_URL.matcher(formattedUrlEntity.expandedUrl).find();
    }
    
    public static boolean isVineCard(final FormattedUrlEntity formattedUrlEntity) {
        return TweetTextLinkifier.VINE_URL.matcher(formattedUrlEntity.expandedUrl).find();
    }
    
    public static CharSequence linkifyUrls(final FormattedTweetText formattedTweetText, final LinkClickListener linkClickListener, final int n, final int n2, final boolean b, final boolean b2) {
        if (formattedTweetText == null) {
            return null;
        }
        if (TextUtils.isEmpty((CharSequence)formattedTweetText.text)) {
            return formattedTweetText.text;
        }
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)formattedTweetText.text);
        final List<FormattedUrlEntity> mergeAndSortEntities = mergeAndSortEntities(ModelUtils.getSafeList(formattedTweetText.urlEntities), ModelUtils.getSafeList(formattedTweetText.mediaEntities), ModelUtils.getSafeList(formattedTweetText.hashtagEntities), ModelUtils.getSafeList(formattedTweetText.mentionEntities), ModelUtils.getSafeList(formattedTweetText.symbolEntities));
        addUrlEntities(spannableStringBuilder, mergeAndSortEntities, getEntityToStrip(formattedTweetText.text, mergeAndSortEntities, b, b2), linkClickListener, n, n2);
        return trimEnd((CharSequence)spannableStringBuilder);
    }
    
    public static List<FormattedUrlEntity> mergeAndSortEntities(final List<FormattedUrlEntity> list, final List<FormattedMediaEntity> list2, final List<FormattedUrlEntity> list3, final List<FormattedUrlEntity> list4, final List<FormattedUrlEntity> list5) {
        final ArrayList list6 = new ArrayList((Collection<? extends E>)list);
        list6.addAll(list2);
        list6.addAll(list3);
        list6.addAll(list4);
        list6.addAll(list5);
        Collections.sort((List<Object>)list6, (Comparator<? super Object>)new Comparator<FormattedUrlEntity>() {
            @Override
            public int compare(final FormattedUrlEntity formattedUrlEntity, final FormattedUrlEntity formattedUrlEntity2) {
                if (formattedUrlEntity == null && formattedUrlEntity2 != null) {
                    return -1;
                }
                if (formattedUrlEntity != null && formattedUrlEntity2 == null) {
                    return 1;
                }
                if (formattedUrlEntity == null && formattedUrlEntity2 == null) {
                    return 0;
                }
                final int start = formattedUrlEntity.start;
                final int start2 = formattedUrlEntity2.start;
                if (start < start2) {
                    return -1;
                }
                if (start > start2) {
                    return 1;
                }
                return 0;
            }
            
            @Override
            public /* bridge */ int compare(final Object o, final Object o2) {
                return this.compare((FormattedUrlEntity)o, (FormattedUrlEntity)o2);
            }
        });
        return list6;
    }
    
    public static String stripLtrMarker(final String s) {
        String substring = s;
        if (s.endsWith(Character.toString('\u200e'))) {
            substring = s.substring(0, s.length() - 1);
        }
        return substring;
    }
    
    public static CharSequence trimEnd(final CharSequence charSequence) {
        int length;
        for (length = charSequence.length(); length > 0 && charSequence.charAt(length - 1) <= ' '; --length) {}
        CharSequence subSequence = charSequence;
        if (length < charSequence.length()) {
            subSequence = charSequence.subSequence(0, length);
        }
        return subSequence;
    }
}
