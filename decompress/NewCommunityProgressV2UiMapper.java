// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.newcommunityprogressv2;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import com.reddit.listing.model.Listable$Type;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.domain.model.tagging.NewCommunityProgressV2Card$Status;
import com.reddit.domain.model.tagging.NewCommunityProgressV2Card;
import java.util.ArrayList;
import ig2.m;
import sg2.e;
import com.reddit.domain.model.Subreddit;
import com.reddit.domain.model.tagging.NewCommunityProgressModuleV2;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t" }, d2 = { "Lcom/reddit/domain/modtools/newcommunityprogressv2/NewCommunityProgressV2UiMapper;", "", "()V", "mapToUi", "Lcom/reddit/domain/modtools/newcommunityprogressv2/NewCommunityProgressV2UiModel;", "module", "Lcom/reddit/domain/model/tagging/NewCommunityProgressModuleV2;", "subreddit", "Lcom/reddit/domain/model/Subreddit;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class NewCommunityProgressV2UiMapper
{
    @Inject
    public NewCommunityProgressV2UiMapper() {
    }
    
    public final NewCommunityProgressV2UiModel mapToUi(final NewCommunityProgressModuleV2 newCommunityProgressModuleV2, final Subreddit subreddit) {
        e.f((Object)newCommunityProgressModuleV2, "module");
        e.f((Object)subreddit, "subreddit");
        final List cards = newCommunityProgressModuleV2.getCards();
        final ArrayList list = new ArrayList<NewCommunityProgressV2CardUiModel$Regular>(m.c3((Iterable)cards, 10));
        final Iterator iterator = cards.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            boolean b = false;
            if (!hasNext) {
                break;
            }
            final NewCommunityProgressV2Card newCommunityProgressV2Card = (NewCommunityProgressV2Card)iterator.next();
            if (newCommunityProgressV2Card.getStatus() == NewCommunityProgressV2Card$Status.COMPLETED) {
                b = true;
            }
            list.add(new NewCommunityProgressV2CardUiModel$Regular(newCommunityProgressV2Card, b));
        }
        final ArrayList r4 = CollectionsKt___CollectionsKt.r4((Collection)list);
        final List cards2 = newCommunityProgressModuleV2.getCards();
        boolean b2 = false;
        Label_0188: {
            if (!(cards2 instanceof Collection) || !cards2.isEmpty()) {
                final Iterator iterator2 = cards2.iterator();
                while (iterator2.hasNext()) {
                    if (((NewCommunityProgressV2Card)iterator2.next()).getStatus() != NewCommunityProgressV2Card$Status.COMPLETED) {
                        b2 = false;
                        break Label_0188;
                    }
                }
            }
            b2 = true;
        }
        if (b2) {
            r4.add(new NewCommunityProgressV2CardUiModel$CompleteModule(newCommunityProgressModuleV2.isLastAvailable()));
        }
        int size;
        if (b2) {
            size = newCommunityProgressModuleV2.getCards().size();
        }
        else {
            final Iterator iterator3 = newCommunityProgressModuleV2.getCards().iterator();
            size = 0;
            while (iterator3.hasNext()) {
                if (((NewCommunityProgressV2Card)iterator3.next()).getStatus() != NewCommunityProgressV2Card$Status.COMPLETED) {
                    return new NewCommunityProgressV2UiModel(null, 0L, subreddit, newCommunityProgressModuleV2, size, r4, false, 67, null);
                }
                ++size;
            }
            size = -1;
        }
        return new NewCommunityProgressV2UiModel(null, 0L, subreddit, newCommunityProgressModuleV2, size, r4, false, 67, null);
    }
}
