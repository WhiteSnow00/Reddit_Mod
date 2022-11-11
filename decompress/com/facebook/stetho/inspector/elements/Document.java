// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements;

import java.util.AbstractCollection;
import java.util.AbstractList;
import android.os.SystemClock;
import java.util.regex.Pattern;
import com.facebook.stetho.common.LogUtil;
import java.util.Collections;
import java.util.ArrayList;
import com.facebook.stetho.common.Accumulator;
import java.util.List;
import java.util.ArrayDeque;
import com.facebook.stetho.common.ThreadBound;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;
import java.util.Queue;
import com.facebook.stetho.common.ArrayListAccumulator;
import com.facebook.stetho.inspector.helper.ThreadBoundProxy;

public final class Document extends ThreadBoundProxy
{
    private Document.Document$AttributeListAccumulator mCachedAttributeAccumulator;
    private ChildEventingList mCachedChildEventingList;
    private ArrayListAccumulator<Object> mCachedChildrenAccumulator;
    private final Queue<Object> mCachedUpdateQueue;
    private DocumentProvider mDocumentProvider;
    private final DocumentProviderFactory mFactory;
    private final ObjectIdMapper mObjectIdMapper;
    private int mReferenceCounter;
    private ShadowDocument mShadowDocument;
    private Document.Document$UpdateListenerCollection mUpdateListeners;
    
    public Document(final DocumentProviderFactory mFactory) {
        super((ThreadBound)mFactory);
        this.mFactory = mFactory;
        this.mObjectIdMapper = (ObjectIdMapper)new Document.Document$DocumentObjectIdMapper(this, (Document$1)null);
        this.mReferenceCounter = 0;
        this.mUpdateListeners = new Document.Document$UpdateListenerCollection(this);
        this.mCachedUpdateQueue = new ArrayDeque<Object>();
    }
    
    public static /* synthetic */ ShadowDocument access$102(final Document document, final ShadowDocument mShadowDocument) {
        return document.mShadowDocument = mShadowDocument;
    }
    
    public static /* synthetic */ DocumentProvider access$200(final Document document) {
        return document.mDocumentProvider;
    }
    
    public static /* synthetic */ DocumentProvider access$202(final Document document, final DocumentProvider mDocumentProvider) {
        return document.mDocumentProvider = mDocumentProvider;
    }
    
    public static /* synthetic */ ObjectIdMapper access$500(final Document document) {
        return document.mObjectIdMapper;
    }
    
    public static /* synthetic */ Document.Document$UpdateListenerCollection access$700(final Document document) {
        return document.mUpdateListeners;
    }
    
    private Document.Document$AttributeListAccumulator acquireCachedAttributeAccumulator() {
        Document.Document$AttributeListAccumulator mCachedAttributeAccumulator;
        if ((mCachedAttributeAccumulator = this.mCachedAttributeAccumulator) == null) {
            mCachedAttributeAccumulator = new Document.Document$AttributeListAccumulator();
        }
        this.mCachedChildrenAccumulator = null;
        return mCachedAttributeAccumulator;
    }
    
    private ChildEventingList acquireChildEventingList(final Object o, final DocumentView documentView) {
        ChildEventingList mCachedChildEventingList;
        if ((mCachedChildEventingList = this.mCachedChildEventingList) == null) {
            mCachedChildEventingList = new ChildEventingList(null);
        }
        this.mCachedChildEventingList = null;
        mCachedChildEventingList.acquire(o, documentView);
        return mCachedChildEventingList;
    }
    
    private ArrayListAccumulator<Object> acquireChildrenAccumulator() {
        ArrayListAccumulator<Object> mCachedChildrenAccumulator;
        if ((mCachedChildrenAccumulator = this.mCachedChildrenAccumulator) == null) {
            mCachedChildrenAccumulator = new ArrayListAccumulator<Object>();
        }
        this.mCachedChildrenAccumulator = null;
        return mCachedChildrenAccumulator;
    }
    
    private void applyDocumentUpdate(final ShadowDocument$Update shadowDocument$Update) {
        final ArrayList list = new ArrayList();
        shadowDocument$Update.getGarbageElements((Accumulator)new Document$3(this, shadowDocument$Update, list));
        Collections.sort((List<Comparable>)list);
        shadowDocument$Update.getChangedElements((Accumulator)new Document$4(this, list, shadowDocument$Update));
        for (int size = list.size(), i = 0; i < size; ++i) {
            this.mObjectIdMapper.removeObjectById((int)list.get(i));
        }
        shadowDocument$Update.getChangedElements((Accumulator)new Document$5(this, shadowDocument$Update));
        shadowDocument$Update.commit();
    }
    
    private void cleanUp() {
        ((ThreadBound)this.mDocumentProvider).postAndWait((Runnable)new Runnable() {
            @Override
            public void run() {
                Document.access$200(Document.this).setListener((DocumentProviderListener)null);
                Document.access$102(Document.this, null);
                Document.access$500(Document.this).clear();
                Document.access$200(Document.this).dispose();
                Document.access$202(Document.this, null);
            }
        });
        this.mUpdateListeners.clear();
    }
    
    private ShadowDocument$Update createShadowDocumentUpdate() {
        this.verifyThreadAccess();
        if (this.mDocumentProvider.getRootElement() == this.mShadowDocument.getRootElement()) {
            final ArrayListAccumulator<Object> acquireChildrenAccumulator = this.acquireChildrenAccumulator();
            final ShadowDocument.UpdateBuilder beginUpdate = this.mShadowDocument.beginUpdate();
            this.mCachedUpdateQueue.add(this.mDocumentProvider.getRootElement());
            while (!this.mCachedUpdateQueue.isEmpty()) {
                final Object remove = this.mCachedUpdateQueue.remove();
                final NodeDescriptor nodeDescriptor = this.mDocumentProvider.getNodeDescriptor(remove);
                this.mObjectIdMapper.putObject(remove);
                nodeDescriptor.getChildren(remove, (Accumulator)acquireChildrenAccumulator);
                for (int size = acquireChildrenAccumulator.size(), i = 0; i < size; ++i) {
                    final Object value = acquireChildrenAccumulator.get(i);
                    if (value != null) {
                        this.mCachedUpdateQueue.add(value);
                    }
                    else {
                        LogUtil.e("%s.getChildren() emitted a null child at position %s for element %s", new Object[] { nodeDescriptor.getClass().getName(), Integer.toString(i), remove });
                        acquireChildrenAccumulator.remove(i);
                        --i;
                        --size;
                    }
                }
                beginUpdate.setElementChildren(remove, acquireChildrenAccumulator);
                acquireChildrenAccumulator.clear();
            }
            this.releaseChildrenAccumulator(acquireChildrenAccumulator);
            return beginUpdate.build();
        }
        throw new IllegalStateException();
    }
    
    private boolean doesElementMatch(final Object o, final Pattern pattern) {
        final Document.Document$AttributeListAccumulator acquireCachedAttributeAccumulator = this.acquireCachedAttributeAccumulator();
        final NodeDescriptor nodeDescriptor = this.mDocumentProvider.getNodeDescriptor(o);
        nodeDescriptor.getAttributes(o, (AttributeAccumulator)acquireCachedAttributeAccumulator);
        for (int size = ((AbstractCollection)acquireCachedAttributeAccumulator).size(), i = 0; i < size; ++i) {
            if (pattern.matcher(((AbstractList<CharSequence>)acquireCachedAttributeAccumulator).get(i)).find()) {
                this.releaseCachedAttributeAccumulator(acquireCachedAttributeAccumulator);
                return true;
            }
        }
        this.releaseCachedAttributeAccumulator(acquireCachedAttributeAccumulator);
        return pattern.matcher(nodeDescriptor.getNodeName(o)).find();
    }
    
    private void findMatches(Object value, final Pattern pattern, final Accumulator<Integer> accumulator) {
        final ElementInfo elementInfo = this.mShadowDocument.getElementInfo(value);
        for (int size = elementInfo.children.size(), i = 0; i < size; ++i) {
            value = elementInfo.children.get(i);
            if (this.doesElementMatch(value, pattern)) {
                accumulator.store((Object)this.mObjectIdMapper.getIdForObject(value));
            }
            this.findMatches(value, pattern, accumulator);
        }
    }
    
    private void init() {
        ((ThreadBound)(this.mDocumentProvider = this.mFactory.create())).postAndWait((Runnable)new Runnable() {
            @Override
            public void run() {
                final Document this$0 = Document.this;
                Document.access$102(this$0, new ShadowDocument(Document.access$200(this$0).getRootElement()));
                Document.this.createShadowDocumentUpdate().commit();
                Document.access$200(Document.this).setListener((DocumentProviderListener)new Document$ProviderListener(Document.this, (Document$1)null));
            }
        });
    }
    
    private void releaseCachedAttributeAccumulator(final Document.Document$AttributeListAccumulator mCachedAttributeAccumulator) {
        ((AbstractCollection)mCachedAttributeAccumulator).clear();
        if (this.mCachedAttributeAccumulator == null) {
            this.mCachedAttributeAccumulator = mCachedAttributeAccumulator;
        }
    }
    
    private void releaseChildEventingList(final ChildEventingList mCachedChildEventingList) {
        mCachedChildEventingList.release();
        if (this.mCachedChildEventingList == null) {
            this.mCachedChildEventingList = mCachedChildEventingList;
        }
    }
    
    private void releaseChildrenAccumulator(final ArrayListAccumulator<Object> mCachedChildrenAccumulator) {
        mCachedChildrenAccumulator.clear();
        if (this.mCachedChildrenAccumulator == null) {
            this.mCachedChildrenAccumulator = mCachedChildrenAccumulator;
        }
    }
    
    private static void updateListenerChildren(final ChildEventingList list, final List<Object> list2, final Accumulator<Object> accumulator) {
        int i = 0;
        while (i <= list.size()) {
            if (i == list.size()) {
                if (i == list2.size()) {
                    break;
                }
                list.addWithEvent(i, list2.get(i), accumulator);
            }
            else {
                if (i == list2.size()) {
                    list.removeWithEvent(i);
                    continue;
                }
                final Object value = list.get(i);
                final Object value2 = list2.get(i);
                if (value != value2) {
                    final int index = list.indexOf(value2);
                    if (index == -1) {
                        list.addWithEvent(i, value2, accumulator);
                    }
                    else {
                        list.removeWithEvent(index);
                        list.addWithEvent(i, value2, accumulator);
                    }
                }
            }
            ++i;
        }
    }
    
    private void updateTree() {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final ShadowDocument$Update shadowDocumentUpdate = this.createShadowDocumentUpdate();
        final boolean empty = shadowDocumentUpdate.isEmpty();
        if (empty) {
            shadowDocumentUpdate.abandon();
        }
        else {
            this.applyDocumentUpdate(shadowDocumentUpdate);
        }
        final String string = Long.toString(SystemClock.elapsedRealtime() - elapsedRealtime);
        String s;
        if (empty) {
            s = " (no changes)";
        }
        else {
            s = "";
        }
        LogUtil.d("Document.updateTree() completed in %s ms%s", new Object[] { string, s });
    }
    
    public void addRef() {
        synchronized (this) {
            if (this.mReferenceCounter++ == 0) {
                this.init();
            }
        }
    }
    
    public void addUpdateListener(final UpdateListener updateListener) {
        this.mUpdateListeners.add(updateListener);
    }
    
    public void findMatchingElements(final String s, final Accumulator<Integer> accumulator) {
        this.verifyThreadAccess();
        this.findMatches(this.mDocumentProvider.getRootElement(), Pattern.compile(Pattern.quote(s), 2), accumulator);
    }
    
    public DocumentView getDocumentView() {
        this.verifyThreadAccess();
        return (DocumentView)this.mShadowDocument;
    }
    
    public void getElementComputedStyles(final Object o, final ComputedStyleAccumulator computedStyleAccumulator) {
        this.getNodeDescriptor(o).getComputedStyles(o, computedStyleAccumulator);
    }
    
    public Object getElementForNodeId(final int n) {
        return this.mObjectIdMapper.getObjectForId(n);
    }
    
    public void getElementStyleRuleNames(final Object o, final StyleRuleNameAccumulator styleRuleNameAccumulator) {
        this.getNodeDescriptor(o).getStyleRuleNames(o, styleRuleNameAccumulator);
    }
    
    public void getElementStyles(final Object o, final String s, final StyleAccumulator styleAccumulator) {
        this.getNodeDescriptor(o).getStyles(o, s, styleAccumulator);
    }
    
    public NodeDescriptor getNodeDescriptor(final Object o) {
        this.verifyThreadAccess();
        return this.mDocumentProvider.getNodeDescriptor(o);
    }
    
    public Integer getNodeIdForElement(final Object o) {
        return this.mObjectIdMapper.getIdForObject(o);
    }
    
    public Object getRootElement() {
        this.verifyThreadAccess();
        final Object rootElement = this.mDocumentProvider.getRootElement();
        if (rootElement == null) {
            throw new IllegalStateException();
        }
        if (rootElement == this.mShadowDocument.getRootElement()) {
            return rootElement;
        }
        throw new IllegalStateException();
    }
    
    public void hideHighlight() {
        this.verifyThreadAccess();
        this.mDocumentProvider.hideHighlight();
    }
    
    public void highlightElement(final Object o, final int n) {
        this.verifyThreadAccess();
        this.mDocumentProvider.highlightElement(o, n);
    }
    
    public void release() {
        synchronized (this) {
            int mReferenceCounter = this.mReferenceCounter;
            if (mReferenceCounter > 0) {
                --mReferenceCounter;
                if ((this.mReferenceCounter = mReferenceCounter) == 0) {
                    this.cleanUp();
                }
            }
        }
    }
    
    public void removeUpdateListener(final UpdateListener updateListener) {
        this.mUpdateListeners.remove(updateListener);
    }
    
    public void setAttributesAsText(final Object o, final String s) {
        this.verifyThreadAccess();
        this.mDocumentProvider.setAttributesAsText(o, s);
    }
    
    public void setElementStyle(final Object o, final String s, final String s2, final String s3) {
        this.getNodeDescriptor(o).setStyle(o, s, s2, s3);
    }
    
    public void setInspectModeEnabled(final boolean inspectModeEnabled) {
        this.verifyThreadAccess();
        this.mDocumentProvider.setInspectModeEnabled(inspectModeEnabled);
    }
    
    public final class ChildEventingList extends ArrayList<Object>
    {
        private DocumentView mDocumentView;
        private Object mParentElement;
        private int mParentNodeId;
        
        private ChildEventingList() {
            this.mParentElement = null;
            this.mParentNodeId = -1;
        }
        
        public void acquire(final Object mParentElement, final DocumentView mDocumentView) {
            this.mParentElement = mParentElement;
            int intValue;
            if (mParentElement == null) {
                intValue = -1;
            }
            else {
                intValue = Document.access$500(Document.this).getIdForObject(this.mParentElement);
            }
            this.mParentNodeId = intValue;
            this.mDocumentView = mDocumentView;
        }
        
        public void addWithEvent(final int n, final Object o, final Accumulator<Object> accumulator) {
            Object value;
            if (n == 0) {
                value = null;
            }
            else {
                value = this.get(n - 1);
            }
            int intValue;
            if (value == null) {
                intValue = -1;
            }
            else {
                intValue = Document.access$500(Document.this).getIdForObject(value);
            }
            this.add(n, o);
            Document.access$700(Document.this).onChildNodeInserted(this.mDocumentView, o, this.mParentNodeId, intValue, (Accumulator)accumulator);
        }
        
        public void release() {
            this.clear();
            this.mParentElement = null;
            this.mParentNodeId = -1;
            this.mDocumentView = null;
        }
        
        public void removeWithEvent(int intValue) {
            intValue = Document.access$500(Document.this).getIdForObject(this.remove(intValue));
            Document.access$700(Document.this).onChildNodeRemoved(this.mParentNodeId, intValue);
        }
    }
    
    public interface UpdateListener
    {
        void onAttributeModified(final Object p0, final String p1, final String p2);
        
        void onAttributeRemoved(final Object p0, final String p1);
        
        void onChildNodeInserted(final DocumentView p0, final Object p1, final int p2, final int p3, final Accumulator<Object> p4);
        
        void onChildNodeRemoved(final int p0, final int p1);
        
        void onInspectRequested(final Object p0);
    }
}
