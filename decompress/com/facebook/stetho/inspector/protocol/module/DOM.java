// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.protocol.module;

import java.util.AbstractCollection;
import com.facebook.stetho.inspector.helper.ThreadBoundProxy;
import android.graphics.Color;
import com.facebook.stetho.inspector.elements.NodeType;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.common.ArrayListAccumulator;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.UncheckedCallable;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import org.json.JSONObject;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.elements.ElementInfo;
import com.facebook.stetho.inspector.elements.NodeDescriptor;
import java.util.ArrayList;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.inspector.elements.DocumentView;
import com.facebook.stetho.inspector.helper.PeerRegistrationListener;
import java.util.Collections;
import java.util.HashMap;
import com.facebook.stetho.common.Util;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.inspector.elements.Document;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class DOM implements ChromeDevtoolsDomain
{
    private ChildNodeInsertedEvent mCachedChildNodeInsertedEvent;
    private ChildNodeRemovedEvent mCachedChildNodeRemovedEvent;
    private final Document mDocument;
    private final DocumentUpdateListener mListener;
    private final ObjectMapper mObjectMapper;
    private final ChromePeerManager mPeerManager;
    private final AtomicInteger mResultCounter;
    private final Map<String, List<Integer>> mSearchResults;
    
    public DOM(final Document document) {
        this.mObjectMapper = new ObjectMapper();
        this.mDocument = Util.throwIfNull(document);
        this.mSearchResults = Collections.synchronizedMap(new HashMap<String, List<Integer>>());
        this.mResultCounter = new AtomicInteger(0);
        (this.mPeerManager = new ChromePeerManager()).setListener((PeerRegistrationListener)new DOM.DOM$PeerManagerListener(this, (DOM$1)null));
        this.mListener = new DocumentUpdateListener(null);
    }
    
    public static /* synthetic */ ChromePeerManager access$1200(final DOM dom) {
        return dom.mPeerManager;
    }
    
    public static /* synthetic */ Document access$300(final DOM dom) {
        return dom.mDocument;
    }
    
    private ChildNodeInsertedEvent acquireChildNodeInsertedEvent() {
        ChildNodeInsertedEvent mCachedChildNodeInsertedEvent;
        if ((mCachedChildNodeInsertedEvent = this.mCachedChildNodeInsertedEvent) == null) {
            mCachedChildNodeInsertedEvent = new ChildNodeInsertedEvent(null);
        }
        this.mCachedChildNodeInsertedEvent = null;
        return mCachedChildNodeInsertedEvent;
    }
    
    private ChildNodeRemovedEvent acquireChildNodeRemovedEvent() {
        ChildNodeRemovedEvent mCachedChildNodeRemovedEvent;
        if ((mCachedChildNodeRemovedEvent = this.mCachedChildNodeRemovedEvent) == null) {
            mCachedChildNodeRemovedEvent = new ChildNodeRemovedEvent(null);
        }
        this.mCachedChildNodeRemovedEvent = null;
        return mCachedChildNodeRemovedEvent;
    }
    
    private Node createNodeForElement(final Object o, final DocumentView documentView, final Accumulator<Object> accumulator) {
        if (accumulator != null) {
            accumulator.store(o);
        }
        final NodeDescriptor nodeDescriptor = this.mDocument.getNodeDescriptor(o);
        final Node node = new Node(null);
        node.nodeId = this.mDocument.getNodeIdForElement(o);
        node.nodeType = nodeDescriptor.getNodeType(o);
        node.nodeName = nodeDescriptor.getNodeName(o);
        node.localName = nodeDescriptor.getLocalName(o);
        node.nodeValue = nodeDescriptor.getNodeValue(o);
        final Document.AttributeListAccumulator attributes = new Document.AttributeListAccumulator();
        nodeDescriptor.getAttributes(o, attributes);
        node.attributes = attributes;
        final ElementInfo elementInfo = documentView.getElementInfo(o);
        List<Object> emptyList;
        if (elementInfo.children.size() == 0) {
            emptyList = Collections.emptyList();
        }
        else {
            emptyList = new ArrayList<Object>(elementInfo.children.size());
        }
        for (int i = 0; i < elementInfo.children.size(); ++i) {
            emptyList.add(this.createNodeForElement(elementInfo.children.get(i), documentView, accumulator));
        }
        node.children = (List<Node>)emptyList;
        node.childNodeCount = emptyList.size();
        return node;
    }
    
    private void releaseChildNodeInsertedEvent(final ChildNodeInsertedEvent mCachedChildNodeInsertedEvent) {
        mCachedChildNodeInsertedEvent.parentNodeId = -1;
        mCachedChildNodeInsertedEvent.previousNodeId = -1;
        mCachedChildNodeInsertedEvent.node = null;
        if (this.mCachedChildNodeInsertedEvent == null) {
            this.mCachedChildNodeInsertedEvent = mCachedChildNodeInsertedEvent;
        }
    }
    
    private void releaseChildNodeRemovedEvent(final ChildNodeRemovedEvent mCachedChildNodeRemovedEvent) {
        mCachedChildNodeRemovedEvent.parentNodeId = -1;
        mCachedChildNodeRemovedEvent.nodeId = -1;
        if (this.mCachedChildNodeRemovedEvent == null) {
            this.mCachedChildNodeRemovedEvent = mCachedChildNodeRemovedEvent;
        }
    }
    
    @ChromeDevtoolsMethod
    public void disable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        this.mPeerManager.removePeer(jsonRpcPeer);
    }
    
    @ChromeDevtoolsMethod
    public void discardSearchResults(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final String searchId = this.mObjectMapper.convertValue(jsonObject, DiscardSearchResultsRequest.class).searchId;
        if (searchId != null) {
            this.mSearchResults.remove(searchId);
        }
    }
    
    @ChromeDevtoolsMethod
    public void enable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        this.mPeerManager.addPeer(jsonRpcPeer);
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult getDocument(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final GetDocumentResponse getDocumentResponse = new GetDocumentResponse(null);
        getDocumentResponse.root = ((ThreadBoundProxy)this.mDocument).postAndWait((UncheckedCallable<Node>)new UncheckedCallable<Node>() {
            @Override
            public Node call() {
                final Object rootElement = DOM.access$300(DOM.this).getRootElement();
                final DOM this$0 = DOM.this;
                return this$0.createNodeForElement(rootElement, DOM.access$300(this$0).getDocumentView(), null);
            }
        });
        return getDocumentResponse;
    }
    
    @ChromeDevtoolsMethod
    public GetSearchResultsResponse getSearchResults(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final GetSearchResultsRequest getSearchResultsRequest = this.mObjectMapper.convertValue(jsonObject, GetSearchResultsRequest.class);
        final String searchId = getSearchResultsRequest.searchId;
        if (searchId == null) {
            LogUtil.w("searchId may not be null");
            return null;
        }
        final List list = this.mSearchResults.get(searchId);
        if (list == null) {
            final StringBuilder k = a.k("\"");
            k.append(getSearchResultsRequest.searchId);
            k.append("\" is not a valid reference to a search result");
            LogUtil.w(k.toString());
            return null;
        }
        final List subList = list.subList(getSearchResultsRequest.fromIndex, getSearchResultsRequest.toIndex);
        final GetSearchResultsResponse getSearchResultsResponse = new GetSearchResultsResponse(null);
        getSearchResultsResponse.nodeIds = subList;
        return getSearchResultsResponse;
    }
    
    @ChromeDevtoolsMethod
    public void hideHighlight(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        ((ThreadBoundProxy)this.mDocument).postAndWait(new Runnable() {
            @Override
            public void run() {
                DOM.access$300(DOM.this).hideHighlight();
            }
        });
    }
    
    @ChromeDevtoolsMethod
    public void highlightNode(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final HighlightNodeRequest highlightNodeRequest = this.mObjectMapper.convertValue(jsonObject, HighlightNodeRequest.class);
        if (highlightNodeRequest.nodeId == null) {
            LogUtil.w("DOM.highlightNode was not given a nodeId; JS objectId is not supported");
            return;
        }
        final RGBAColor contentColor = highlightNodeRequest.highlightConfig.contentColor;
        if (contentColor == null) {
            LogUtil.w("DOM.highlightNode was not given a color to highlight with");
            return;
        }
        ((ThreadBoundProxy)this.mDocument).postAndWait(new Runnable() {
            @Override
            public void run() {
                final Object elementForNodeId = DOM.access$300(DOM.this).getElementForNodeId((int)highlightNodeRequest.nodeId);
                if (elementForNodeId != null) {
                    DOM.access$300(DOM.this).highlightElement(elementForNodeId, contentColor.getColor());
                }
            }
        });
    }
    
    @ChromeDevtoolsMethod
    public PerformSearchResponse performSearch(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final PerformSearchRequest performSearchRequest = this.mObjectMapper.convertValue(jsonObject, PerformSearchRequest.class);
        final ArrayListAccumulator arrayListAccumulator = new ArrayListAccumulator();
        ((ThreadBoundProxy)this.mDocument).postAndWait(new Runnable() {
            @Override
            public void run() {
                DOM.access$300(DOM.this).findMatchingElements(performSearchRequest.query, (Accumulator)arrayListAccumulator);
            }
        });
        final String value = String.valueOf(this.mResultCounter.getAndIncrement());
        this.mSearchResults.put(value, (List<Integer>)arrayListAccumulator);
        final PerformSearchResponse performSearchResponse = new PerformSearchResponse(null);
        performSearchResponse.searchId = value;
        performSearchResponse.resultCount = ((AbstractCollection)arrayListAccumulator).size();
        return performSearchResponse;
    }
    
    @ChromeDevtoolsMethod
    public ResolveNodeResponse resolveNode(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) throws JsonRpcException {
        final ResolveNodeRequest resolveNodeRequest = this.mObjectMapper.convertValue(jsonObject, ResolveNodeRequest.class);
        final Object postAndWait = ((ThreadBoundProxy)this.mDocument).postAndWait((UncheckedCallable<Object>)new UncheckedCallable<Object>() {
            @Override
            public Object call() {
                return DOM.access$300(DOM.this).getElementForNodeId(resolveNodeRequest.nodeId);
            }
        });
        if (postAndWait != null) {
            final int mapObject = Runtime.mapObject(jsonRpcPeer, postAndWait);
            final Runtime.RemoteObject object = new Runtime.RemoteObject();
            object.type = Runtime.ObjectType.OBJECT;
            object.subtype = Runtime.ObjectSubType.NODE;
            object.className = postAndWait.getClass().getName();
            object.value = null;
            object.description = null;
            object.objectId = String.valueOf(mapObject);
            final ResolveNodeResponse resolveNodeResponse = new ResolveNodeResponse(null);
            resolveNodeResponse.object = object;
            return resolveNodeResponse;
        }
        final JsonRpcError.ErrorCode invalid_PARAMS = JsonRpcError.ErrorCode.INVALID_PARAMS;
        final StringBuilder k = a.k("No known nodeId=");
        k.append(resolveNodeRequest.nodeId);
        throw new JsonRpcException(new JsonRpcError(invalid_PARAMS, k.toString(), null));
    }
    
    @ChromeDevtoolsMethod
    public void setAttributesAsText(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        ((ThreadBoundProxy)this.mDocument).postAndWait(new Runnable() {
            public final /* synthetic */ SetAttributesAsTextRequest val$request = DOM.this.mObjectMapper.convertValue(jsonObject, SetAttributesAsTextRequest.class);
            
            @Override
            public void run() {
                final Object elementForNodeId = DOM.access$300(DOM.this).getElementForNodeId(this.val$request.nodeId);
                if (elementForNodeId != null) {
                    DOM.access$300(DOM.this).setAttributesAsText(elementForNodeId, this.val$request.text);
                }
            }
        });
    }
    
    @ChromeDevtoolsMethod
    public void setInspectModeEnabled(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        ((ThreadBoundProxy)this.mDocument).postAndWait(new Runnable() {
            public final /* synthetic */ SetInspectModeEnabledRequest val$request = DOM.this.mObjectMapper.convertValue(jsonObject, SetInspectModeEnabledRequest.class);
            
            @Override
            public void run() {
                DOM.access$300(DOM.this).setInspectModeEnabled(this.val$request.enabled);
            }
        });
    }
    
    public static class AttributeModifiedEvent
    {
        @JsonProperty(required = true)
        public String name;
        @JsonProperty(required = true)
        public int nodeId;
        @JsonProperty(required = true)
        public String value;
        
        private AttributeModifiedEvent() {
        }
    }
    
    public static class AttributeRemovedEvent
    {
        @JsonProperty(required = true)
        public String name;
        @JsonProperty(required = true)
        public int nodeId;
        
        private AttributeRemovedEvent() {
        }
    }
    
    public static class ChildNodeInsertedEvent
    {
        @JsonProperty(required = true)
        public Node node;
        @JsonProperty(required = true)
        public int parentNodeId;
        @JsonProperty(required = true)
        public int previousNodeId;
        
        private ChildNodeInsertedEvent() {
        }
    }
    
    public static class ChildNodeRemovedEvent
    {
        @JsonProperty(required = true)
        public int nodeId;
        @JsonProperty(required = true)
        public int parentNodeId;
        
        private ChildNodeRemovedEvent() {
        }
    }
    
    public static class DiscardSearchResultsRequest
    {
        @JsonProperty(required = true)
        public String searchId;
        
        private DiscardSearchResultsRequest() {
        }
    }
    
    public final class DocumentUpdateListener implements UpdateListener
    {
        private DocumentUpdateListener() {
        }
        
        @Override
        public void onAttributeModified(final Object o, final String name, final String value) {
            final AttributeModifiedEvent attributeModifiedEvent = new AttributeModifiedEvent(null);
            attributeModifiedEvent.nodeId = DOM.access$300(DOM.this).getNodeIdForElement(o);
            attributeModifiedEvent.name = name;
            attributeModifiedEvent.value = value;
            DOM.access$1200(DOM.this).sendNotificationToPeers("DOM.attributeModified", attributeModifiedEvent);
        }
        
        @Override
        public void onAttributeRemoved(final Object o, final String name) {
            final AttributeRemovedEvent attributeRemovedEvent = new AttributeRemovedEvent(null);
            attributeRemovedEvent.nodeId = DOM.access$300(DOM.this).getNodeIdForElement(o);
            attributeRemovedEvent.name = name;
            DOM.access$1200(DOM.this).sendNotificationToPeers("DOM.attributeRemoved", attributeRemovedEvent);
        }
        
        @Override
        public void onChildNodeInserted(final DocumentView documentView, final Object o, final int parentNodeId, final int previousNodeId, final Accumulator<Object> accumulator) {
            final ChildNodeInsertedEvent access$1700 = DOM.this.acquireChildNodeInsertedEvent();
            access$1700.parentNodeId = parentNodeId;
            access$1700.previousNodeId = previousNodeId;
            access$1700.node = DOM.this.createNodeForElement(o, documentView, accumulator);
            DOM.access$1200(DOM.this).sendNotificationToPeers("DOM.childNodeInserted", access$1700);
            DOM.this.releaseChildNodeInsertedEvent(access$1700);
        }
        
        @Override
        public void onChildNodeRemoved(final int parentNodeId, final int nodeId) {
            final ChildNodeRemovedEvent access$1500 = DOM.this.acquireChildNodeRemovedEvent();
            access$1500.parentNodeId = parentNodeId;
            access$1500.nodeId = nodeId;
            DOM.access$1200(DOM.this).sendNotificationToPeers("DOM.childNodeRemoved", access$1500);
            DOM.this.releaseChildNodeRemovedEvent(access$1500);
        }
        
        @Override
        public void onInspectRequested(final Object o) {
            final Integer nodeIdForElement = DOM.access$300(DOM.this).getNodeIdForElement(o);
            if (nodeIdForElement == null) {
                LogUtil.d("DocumentProvider.Listener.onInspectRequested() called for a non-mapped node: element=%s", o);
            }
            else {
                final InspectNodeRequestedEvent inspectNodeRequestedEvent = new InspectNodeRequestedEvent(null);
                inspectNodeRequestedEvent.nodeId = nodeIdForElement;
                DOM.access$1200(DOM.this).sendNotificationToPeers("DOM.inspectNodeRequested", inspectNodeRequestedEvent);
            }
        }
    }
    
    public static class GetDocumentResponse implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public Node root;
        
        private GetDocumentResponse() {
        }
    }
    
    public static class GetSearchResultsRequest
    {
        @JsonProperty(required = true)
        public int fromIndex;
        @JsonProperty(required = true)
        public String searchId;
        @JsonProperty(required = true)
        public int toIndex;
        
        private GetSearchResultsRequest() {
        }
    }
    
    public static class GetSearchResultsResponse implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public List<Integer> nodeIds;
        
        private GetSearchResultsResponse() {
        }
    }
    
    public static class HighlightConfig
    {
        @JsonProperty
        public RGBAColor contentColor;
        
        private HighlightConfig() {
        }
    }
    
    public static class HighlightNodeRequest
    {
        @JsonProperty(required = true)
        public HighlightConfig highlightConfig;
        @JsonProperty
        public Integer nodeId;
        @JsonProperty
        public String objectId;
        
        private HighlightNodeRequest() {
        }
    }
    
    public static class InspectNodeRequestedEvent
    {
        @JsonProperty
        public int nodeId;
        
        private InspectNodeRequestedEvent() {
        }
    }
    
    public static class Node implements JsonRpcResult
    {
        @JsonProperty
        public List<String> attributes;
        @JsonProperty
        public Integer childNodeCount;
        @JsonProperty
        public List<Node> children;
        @JsonProperty(required = true)
        public String localName;
        @JsonProperty(required = true)
        public int nodeId;
        @JsonProperty(required = true)
        public String nodeName;
        @JsonProperty(required = true)
        public NodeType nodeType;
        @JsonProperty(required = true)
        public String nodeValue;
        
        private Node() {
        }
    }
    
    public static class PerformSearchRequest
    {
        @JsonProperty
        public Boolean includeUserAgentShadowDOM;
        @JsonProperty(required = true)
        public String query;
        
        private PerformSearchRequest() {
        }
    }
    
    public static class PerformSearchResponse implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public int resultCount;
        @JsonProperty(required = true)
        public String searchId;
        
        private PerformSearchResponse() {
        }
    }
    
    public static class RGBAColor
    {
        @JsonProperty
        public Double a;
        @JsonProperty(required = true)
        public int b;
        @JsonProperty(required = true)
        public int g;
        @JsonProperty(required = true)
        public int r;
        
        private RGBAColor() {
        }
        
        public int getColor() {
            final Double a = this.a;
            int n = -1;
            if (a != null) {
                final long round = Math.round(a * 255.0);
                if (round < 0L) {
                    n = 0;
                }
                else if (round < 255L) {
                    n = (byte)round;
                }
            }
            return Color.argb(n, this.r, this.g, this.b);
        }
    }
    
    public static class ResolveNodeRequest
    {
        @JsonProperty(required = true)
        public int nodeId;
        @JsonProperty
        public String objectGroup;
        
        private ResolveNodeRequest() {
        }
    }
    
    public static class ResolveNodeResponse implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public Runtime.RemoteObject object;
        
        private ResolveNodeResponse() {
        }
    }
    
    public static class SetAttributesAsTextRequest
    {
        @JsonProperty(required = true)
        public int nodeId;
        @JsonProperty(required = true)
        public String text;
        
        private SetAttributesAsTextRequest() {
        }
    }
    
    public static class SetInspectModeEnabledRequest
    {
        @JsonProperty(required = true)
        public boolean enabled;
        @JsonProperty
        public HighlightConfig highlightConfig;
        @JsonProperty
        public Boolean inspectShadowDOM;
        
        private SetInspectModeEnabledRequest() {
        }
    }
}
