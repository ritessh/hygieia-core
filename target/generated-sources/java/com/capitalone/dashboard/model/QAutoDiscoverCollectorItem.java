package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAutoDiscoverCollectorItem is a Querydsl query type for AutoDiscoverCollectorItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAutoDiscoverCollectorItem extends EntityPathBase<AutoDiscoverCollectorItem> {

    private static final long serialVersionUID = 421187526L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAutoDiscoverCollectorItem autoDiscoverCollectorItem = new QAutoDiscoverCollectorItem("autoDiscoverCollectorItem");

    public final QCollectorItem _super;

    public final EnumPath<AutoDiscoveryStatusType> autoDiscoverStatus = createEnum("autoDiscoverStatus", AutoDiscoveryStatusType.class);

    //inherited
    public final StringPath clientReference;

    // inherited
    public final QCollector collector;

    // inherited
    public final org.bson.types.QObjectId collectorId;

    //inherited
    public final StringPath description;

    //inherited
    public final BooleanPath enabled;

    //inherited
    public final StringPath environment;

    //inherited
    public final NumberPath<Integer> errorCount;

    //inherited
    public final ListPath<CollectionError, QCollectionError> errors;

    // inherited
    public final org.bson.types.QObjectId id;

    //inherited
    public final NumberPath<Long> lastUpdated;

    //inherited
    public final StringPath niceName;

    //inherited
    public final MapPath<String, Object, SimplePath<Object>> options;

    //inherited
    public final BooleanPath pushed;

    //inherited
    public final StringPath refreshLink;

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QAutoDiscoverCollectorItem(String variable) {
        this(AutoDiscoverCollectorItem.class, forVariable(variable), INITS);
    }

    public QAutoDiscoverCollectorItem(Path<? extends AutoDiscoverCollectorItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAutoDiscoverCollectorItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAutoDiscoverCollectorItem(PathMetadata metadata, PathInits inits) {
        this(AutoDiscoverCollectorItem.class, metadata, inits);
    }

    public QAutoDiscoverCollectorItem(Class<? extends AutoDiscoverCollectorItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QCollectorItem(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collector = _super.collector;
        this.collectorId = _super.collectorId;
        this.description = _super.description;
        this.enabled = _super.enabled;
        this.environment = _super.environment;
        this.errorCount = _super.errorCount;
        this.errors = _super.errors;
        this.id = _super.id;
        this.lastUpdated = _super.lastUpdated;
        this.niceName = _super.niceName;
        this.options = _super.options;
        this.pushed = _super.pushed;
        this.refreshLink = _super.refreshLink;
        this.upsertTime = _super.upsertTime;
    }

}

