package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCloudSubNetwork is a Querydsl query type for CloudSubNetwork
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCloudSubNetwork extends EntityPathBase<CloudSubNetwork> {

    private static final long serialVersionUID = -241367103L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCloudSubNetwork cloudSubNetwork = new QCloudSubNetwork("cloudSubNetwork");

    public final QBaseModel _super;

    public final StringPath accountNumber = createString("accountNumber");

    public final NumberPath<Integer> availableIPCount = createNumber("availableIPCount", Integer.class);

    public final StringPath cidrBlock = createString("cidrBlock");

    public final NumberPath<Integer> cidrCount = createNumber("cidrCount", Integer.class);

    //inherited
    public final StringPath clientReference;

    public final NumberPath<Long> creationDate = createNumber("creationDate", Long.class);

    public final BooleanPath defaultForZone = createBoolean("defaultForZone");

    // inherited
    public final org.bson.types.QObjectId id;

    public final MapPath<String, Integer, NumberPath<Integer>> ipUsage = this.<String, Integer, NumberPath<Integer>>createMap("ipUsage", String.class, Integer.class, NumberPath.class);

    public final NumberPath<Long> lastUpdateDate = createNumber("lastUpdateDate", Long.class);

    public final StringPath state = createString("state");

    public final StringPath subnetId = createString("subnetId");

    public final NumberPath<Integer> subscribedIPCount = createNumber("subscribedIPCount", Integer.class);

    public final MapPath<String, Integer, NumberPath<Integer>> subscribedIPUsage = this.<String, Integer, NumberPath<Integer>>createMap("subscribedIPUsage", String.class, Integer.class, NumberPath.class);

    public final ListPath<NameValue, QNameValue> tags = this.<NameValue, QNameValue>createList("tags", NameValue.class, QNameValue.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final NumberPath<Integer> usedIPCount = createNumber("usedIPCount", Integer.class);

    public final StringPath virtualNetworkId = createString("virtualNetworkId");

    public final StringPath zone = createString("zone");

    public QCloudSubNetwork(String variable) {
        this(CloudSubNetwork.class, forVariable(variable), INITS);
    }

    public QCloudSubNetwork(Path<? extends CloudSubNetwork> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCloudSubNetwork(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCloudSubNetwork(PathMetadata metadata, PathInits inits) {
        this(CloudSubNetwork.class, metadata, inits);
    }

    public QCloudSubNetwork(Class<? extends CloudSubNetwork> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

