// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.modtools;

import kotlin.Metadata;
import com.reddit.data.events.models.AnalyticsPlatform;
import lw1.a;
import s40.e$a;
import com.reddit.data.events.models.Event;
import com.reddit.data.events.models.components.ActionInfo;
import javax.inject.Inject;
import ah2.f;
import s40.e;

public final class ModQueueSortingAnalytics
{
    public final e a;
    
    @Inject
    public ModQueueSortingAnalytics(final e a) {
        f.f((Object)a, "eventSender");
        this.a = a;
    }
    
    public final void a(final Noun noun) {
        final ActionInfo build = new ActionInfo.Builder().page_type(PageType.ACTION_INFO.getValue()).build();
        final e a = this.a;
        final Event.Builder noun2 = new Event.Builder().action_info(build).source(Source.MODERATOR.getValue()).action(Action.CLICK.getValue()).noun(noun.getValue());
        f.e((Object)noun2, "Builder()\n        .actio\u2026        .noun(noun.value)");
        e$a.b(a, noun2, (a)null, (AnalyticsPlatform)null, false, (String)null, (Boolean)null, 126);
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/data/modtools/ModQueueSortingAnalytics$Action;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CLICK", "data_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Action
    {
        CLICK("click");
        
        private final String value;
        
        private Action(final String value) {
            this.value = value;
        }
        
        public final String getValue() {
            return this.value;
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b" }, d2 = { "Lcom/reddit/data/modtools/ModQueueSortingAnalytics$Noun;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MODQUEUE_SORT", "MODQUEUE_SORT_NEWEST", "MODQUEUE_SORT_OLDEST", "MODQUEUE_SORT_MOST_REPORTS", "data_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Noun
    {
        MODQUEUE_SORT("modqueue_sort"), 
        MODQUEUE_SORT_MOST_REPORTS("modqueue_sort_most_reports"), 
        MODQUEUE_SORT_NEWEST("modqueue_sort_newest"), 
        MODQUEUE_SORT_OLDEST("modqueue_sort_oldest");
        
        private final String value;
        
        private Noun(final String value) {
            this.value = value;
        }
        
        public final String getValue() {
            return this.value;
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/data/modtools/ModQueueSortingAnalytics$PageType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACTION_INFO", "data_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum PageType
    {
        ACTION_INFO("action_info_page_type");
        
        private final String value;
        
        private PageType(final String value) {
            this.value = value;
        }
        
        public final String getValue() {
            return this.value;
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/data/modtools/ModQueueSortingAnalytics$Source;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MODERATOR", "data_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Source
    {
        MODERATOR("moderator");
        
        private final String value;
        
        private Source(final String value) {
            this.value = value;
        }
        
        public final String getValue() {
            return this.value;
        }
    }
}
