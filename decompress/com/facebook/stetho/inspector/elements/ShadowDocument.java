// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements;

import java.util.Collections;
import java.util.List;
import com.facebook.stetho.common.ListUtil;
import java.util.LinkedHashMap;
import java.util.ArrayDeque;
import com.facebook.stetho.common.Accumulator;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import com.facebook.stetho.common.Util;
import java.util.IdentityHashMap;

public final class ShadowDocument implements DocumentView
{
    private final IdentityHashMap<Object, ElementInfo> mElementToInfoMap;
    private boolean mIsUpdating;
    private final Object mRootElement;
    
    public ShadowDocument(final Object o) {
        this.mElementToInfoMap = new IdentityHashMap<Object, ElementInfo>();
        this.mRootElement = Util.throwIfNull(o);
    }
    
    public static /* synthetic */ IdentityHashMap access$000(final ShadowDocument shadowDocument) {
        return shadowDocument.mElementToInfoMap;
    }
    
    public static /* synthetic */ Object access$100(final ShadowDocument shadowDocument) {
        return shadowDocument.mRootElement;
    }
    
    public static /* synthetic */ boolean access$200(final ShadowDocument shadowDocument) {
        return shadowDocument.mIsUpdating;
    }
    
    public static /* synthetic */ boolean access$202(final ShadowDocument shadowDocument, final boolean mIsUpdating) {
        return shadowDocument.mIsUpdating = mIsUpdating;
    }
    
    public UpdateBuilder beginUpdate() {
        if (!this.mIsUpdating) {
            this.mIsUpdating = true;
            return new UpdateBuilder();
        }
        throw new IllegalStateException();
    }
    
    @Override
    public ElementInfo getElementInfo(final Object o) {
        return this.mElementToInfoMap.get(o);
    }
    
    @Override
    public Object getRootElement() {
        return this.mRootElement;
    }
    
    public final class Update implements DocumentView
    {
        private final Map<Object, ElementInfo> mElementToInfoChangesMap;
        private final Set<Object> mRootElementChangesSet;
        
        public Update(final Map<Object, ElementInfo> mElementToInfoChangesMap, final Set<Object> mRootElementChangesSet) {
            this.mElementToInfoChangesMap = mElementToInfoChangesMap;
            this.mRootElementChangesSet = mRootElementChangesSet;
        }
        
        private void removeGarbageSubTree(final Map<Object, ElementInfo> map, final Object o) {
            final ElementInfo elementInfo = (ElementInfo)map.get(o);
            final Object parentElement = elementInfo.parentElement;
            if (parentElement != null && map.containsKey(parentElement)) {
                return;
            }
            map.remove(o);
            for (int i = 0; i < elementInfo.children.size(); ++i) {
                this.removeGarbageSubTree(map, elementInfo.children.get(i));
            }
        }
        
        private void validateTree(final Map<Object, ElementInfo> map) {
            final HashSet set = new HashSet();
            for (final Map.Entry<Object, V> entry : map.entrySet()) {
                final Object key = entry.getKey();
                final ElementInfo elementInfo = (ElementInfo)entry.getValue();
                if (key != elementInfo.element) {
                    throw new IllegalStateException("element != elementInfo.element");
                }
                for (int size = elementInfo.children.size(), i = 0; i < size; ++i) {
                    final ElementInfo elementInfo2 = map.get(elementInfo.children.get(i));
                    if (elementInfo2 == null) {
                        throw new IllegalStateException(String.format("elementInfo.get(elementInfo.children.get(%s)) == null", i));
                    }
                    if (elementInfo2.parentElement != key) {
                        throw new IllegalStateException("childElementInfo.parentElement != element");
                    }
                }
                final Object parentElement = elementInfo.parentElement;
                if (parentElement == null) {
                    set.add(key);
                }
                else {
                    final ElementInfo elementInfo3 = map.get(parentElement);
                    if (elementInfo3 == null) {
                        throw new IllegalStateException("elementToInfoMap.get(elementInfo.parentElementInfo) == NULL");
                    }
                    if (elementInfo.parentElement != elementInfo3.element) {
                        throw new IllegalStateException("elementInfo.parentElementInfo != parentElementInfo.parent");
                    }
                    if (elementInfo3.children.contains(key)) {
                        continue;
                    }
                    throw new IllegalStateException("parentElementInfo.children.contains(element) == FALSE");
                }
            }
            if (set.size() == 1) {
                return;
            }
            throw new IllegalStateException("elementToInfoMap is a forest, not a tree. rootElements.size() != 1");
        }
        
        public void abandon() {
            if (ShadowDocument.access$200(ShadowDocument.this)) {
                ShadowDocument.access$202(ShadowDocument.this, false);
                return;
            }
            throw new IllegalStateException();
        }
        
        public void commit() {
            if (ShadowDocument.access$200(ShadowDocument.this)) {
                ShadowDocument.access$000(ShadowDocument.this).putAll(this.mElementToInfoChangesMap);
                final Iterator<Object> iterator = this.mRootElementChangesSet.iterator();
                while (iterator.hasNext()) {
                    this.removeGarbageSubTree(ShadowDocument.access$000(ShadowDocument.this), iterator.next());
                }
                ShadowDocument.access$202(ShadowDocument.this, false);
                return;
            }
            throw new IllegalStateException();
        }
        
        public void getChangedElements(final Accumulator<Object> accumulator) {
            final Iterator<Object> iterator = this.mElementToInfoChangesMap.keySet().iterator();
            while (iterator.hasNext()) {
                accumulator.store(iterator.next());
            }
        }
        
        @Override
        public ElementInfo getElementInfo(final Object o) {
            final ElementInfo elementInfo = this.mElementToInfoChangesMap.get(o);
            if (elementInfo != null) {
                return elementInfo;
            }
            return ShadowDocument.access$000(ShadowDocument.this).get(o);
        }
        
        public void getGarbageElements(final Accumulator<Object> accumulator) {
            final ArrayDeque arrayDeque = new ArrayDeque();
            for (final Object next : this.mRootElementChangesSet) {
                final ElementInfo elementInfo = this.getElementInfo(next);
                if (next != ShadowDocument.access$100(ShadowDocument.this) && elementInfo.parentElement == null) {
                    arrayDeque.add(next);
                    arrayDeque.add(next);
                }
            }
            while (!arrayDeque.isEmpty()) {
                final Object remove = arrayDeque.remove();
                Object remove2;
                if (remove == (remove2 = arrayDeque.remove())) {
                    remove2 = null;
                }
                if (this.getElementInfo(remove).parentElement == remove2) {
                    accumulator.store(remove);
                    final ElementInfo elementInfo2 = ShadowDocument.this.getElementInfo(remove);
                    if (elementInfo2 == null) {
                        continue;
                    }
                    for (int i = 0; i < elementInfo2.children.size(); ++i) {
                        arrayDeque.add(elementInfo2.children.get(i));
                        arrayDeque.add(remove);
                    }
                }
            }
        }
        
        @Override
        public Object getRootElement() {
            return ShadowDocument.this.getRootElement();
        }
        
        public boolean isElementChanged(final Object o) {
            return this.mElementToInfoChangesMap.containsKey(o);
        }
        
        public boolean isEmpty() {
            return this.mElementToInfoChangesMap.isEmpty();
        }
    }
    
    public final class UpdateBuilder
    {
        private HashSet<Object> mCachedNotNewChildrenSet;
        private final Map<Object, ElementInfo> mElementToInfoChangesMap;
        private final HashSet<Object> mRootElementChanges;
        
        public UpdateBuilder() {
            this.mElementToInfoChangesMap = new LinkedHashMap<Object, ElementInfo>();
            this.mRootElementChanges = new HashSet<Object>();
        }
        
        private HashSet<Object> acquireNotNewChildrenHashSet() {
            HashSet<Object> mCachedNotNewChildrenSet;
            if ((mCachedNotNewChildrenSet = this.mCachedNotNewChildrenSet) == null) {
                mCachedNotNewChildrenSet = new HashSet<Object>();
            }
            this.mCachedNotNewChildrenSet = null;
            return mCachedNotNewChildrenSet;
        }
        
        private void releaseNotNewChildrenHashSet(final HashSet<Object> mCachedNotNewChildrenSet) {
            mCachedNotNewChildrenSet.clear();
            if (this.mCachedNotNewChildrenSet == null) {
                this.mCachedNotNewChildrenSet = mCachedNotNewChildrenSet;
            }
        }
        
        private void setElementParent(final Object o, final Object o2) {
            final ElementInfo elementInfo = this.mElementToInfoChangesMap.get(o);
            if (elementInfo != null && o2 == elementInfo.parentElement) {
                return;
            }
            final ElementInfo elementInfo2 = ShadowDocument.access$000(ShadowDocument.this).get(o);
            if (elementInfo == null && elementInfo2 != null && o2 == elementInfo2.parentElement) {
                return;
            }
            if (elementInfo != null && elementInfo2 != null && o2 == elementInfo2.parentElement && ListUtil.identityEquals((List<?>)elementInfo2.children, (List<?>)elementInfo.children)) {
                this.mElementToInfoChangesMap.remove(o);
                if (o2 == null) {
                    this.mRootElementChanges.remove(o);
                }
                return;
            }
            List<Object> list;
            if (elementInfo != null) {
                list = elementInfo.children;
            }
            else if (elementInfo2 != null) {
                list = elementInfo2.children;
            }
            else {
                list = Collections.emptyList();
            }
            this.mElementToInfoChangesMap.put(o, new ElementInfo(o, o2, list));
            if (o2 == null) {
                this.mRootElementChanges.add(o);
            }
            else {
                this.mRootElementChanges.remove(o);
            }
        }
        
        public Update build() {
            return new Update(this.mElementToInfoChangesMap, this.mRootElementChanges);
        }
        
        public void setElementChildren(final Object o, final List<Object> list) {
            final ElementInfo elementInfo = this.mElementToInfoChangesMap.get(o);
            if (elementInfo != null && ListUtil.identityEquals((List<?>)list, (List<?>)elementInfo.children)) {
                return;
            }
            final ElementInfo elementInfo2 = ShadowDocument.access$000(ShadowDocument.this).get(o);
            if (elementInfo == null && elementInfo2 != null && ListUtil.identityEquals((List<?>)list, (List<?>)elementInfo2.children)) {
                return;
            }
            ElementInfo elementInfo3;
            if (elementInfo != null && elementInfo2 != null && elementInfo2.parentElement == elementInfo.parentElement && ListUtil.identityEquals((List<?>)list, (List<?>)elementInfo2.children)) {
                elementInfo3 = ShadowDocument.access$000(ShadowDocument.this).get(o);
                this.mElementToInfoChangesMap.remove(o);
            }
            else {
                Object o2;
                if (elementInfo != null) {
                    o2 = elementInfo.parentElement;
                }
                else if (elementInfo2 != null) {
                    o2 = elementInfo2.parentElement;
                }
                else {
                    o2 = null;
                }
                elementInfo3 = new ElementInfo(o, o2, list);
                this.mElementToInfoChangesMap.put(o, elementInfo3);
            }
            final HashSet<Object> acquireNotNewChildrenHashSet = this.acquireNotNewChildrenHashSet();
            final int n = 0;
            if (elementInfo2 != null) {
                final List<Object> children = elementInfo2.children;
                if (children != elementInfo3.children) {
                    for (int size = children.size(), i = 0; i < size; ++i) {
                        acquireNotNewChildrenHashSet.add(elementInfo2.children.get(i));
                    }
                }
            }
            if (elementInfo != null) {
                final List<Object> children2 = elementInfo.children;
                if (children2 != elementInfo3.children) {
                    for (int size2 = children2.size(), j = 0; j < size2; ++j) {
                        acquireNotNewChildrenHashSet.add(elementInfo.children.get(j));
                    }
                }
            }
            for (int size3 = elementInfo3.children.size(), k = n; k < size3; ++k) {
                final Object value = elementInfo3.children.get(k);
                this.setElementParent(value, o);
                acquireNotNewChildrenHashSet.remove(value);
            }
            for (final Object next : acquireNotNewChildrenHashSet) {
                final ElementInfo elementInfo4 = this.mElementToInfoChangesMap.get(next);
                if (elementInfo4 != null && elementInfo4.parentElement != o) {
                    continue;
                }
                final ElementInfo elementInfo5 = ShadowDocument.access$000(ShadowDocument.this).get(next);
                if (elementInfo5 == null || elementInfo5.parentElement != o) {
                    continue;
                }
                this.setElementParent(next, null);
            }
            this.releaseNotNewChildrenHashSet(acquireNotNewChildrenHashSet);
        }
    }
}
