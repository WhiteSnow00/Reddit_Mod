// 
// Decompiled by Procyon v0.6.0
// 

package g70;

import com.reddit.data.model.v1.Listing;
import java.util.Iterator;
import java.util.List;
import com.reddit.screen.notification.model.collapsetree.CollapseTree;
import qg1.b;
import com.reddit.screen.notification.model.ReplyableTreeNode;
import com.reddit.data.model.v1.ReplyableWrapper;
import java.util.ArrayList;
import de.greenrobot.event.EventBus;
import com.reddit.datalibrary.frontpage.data.provider.MessageThreadProvider;
import com.reddit.data.model.v1.MessageListing;
import ag2.e;

public final class a extends e<MessageListing>
{
    public final /* synthetic */ MessageThreadProvider g;
    
    public a(final MessageThreadProvider g, final String s) {
        this.g = g;
    }
    
    public final void onError(final Throwable t) {
        EventBus.getDefault().post((Object)new qg1.a(this.g.d.getString(2131953262)));
    }
    
    public final void onSuccess(final Object o) {
        final MessageListing messageListing = (MessageListing)o;
        this.g.b.clear();
        final CollapseTree b = this.g.b;
        final List children = ((Listing)messageListing).getData().getChildren();
        final ArrayList list = new ArrayList();
        final Iterator iterator = children.iterator();
        while (iterator.hasNext()) {
            list.add(new ReplyableTreeNode((ReplyableWrapper)iterator.next(), 1));
        }
        aa1.a.A(b, list, (ReplyableTreeNode)null);
        EventBus.getDefault().post((Object)new b());
    }
}
