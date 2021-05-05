package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCollectorItem is a Querydsl query type for CollectorItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCollectorItem extends EntityPathBase<CollectorItem> {

    private static final long serialVersionUID = -1182913378L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCollectorItem collectorItem = new QCollectorItem("collectorItem");

    public final QBaseModel _super;

    //inherited
    public final StringPath clientReference;

    public final QCollector collector;

    public final org.bson.types.QObjectId collectorId;

    public final StringPath description = createString("description");

    public final BooleanPath enabled = createBoolean("enabled");

    public final StringPath environment = createString("environment");

    public final NumberPath<Integer> errorCount = createNumber("errorCount", Integer.class);

    public final ListPath<CollectionError, QCollectionError> errors = this.<CollectionError, QCollectionError>createList("errors", CollectionError.class, QCollectionError.class, PathInits.DIRECT2);

    // inherited
    public final org.bson.types.QObjectId id;

    public final NumberPath<Long> lastUpdated = createNumber("lastUpdated", Long.class);

    public final StringPath niceName = createString("niceName");

    public final MapPath<String, Object, SimplePath<Object>> options = this.<String, Object, SimplePath<Object>>createMap("options", String.class, Object.class, SimplePath.class);

    public final BooleanPath pushed = createBoolean("pushed");

    public final StringPath refreshLink = createString("refreshLink");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QCollectorItem(String variable) {
        this(CollectorItem.class, forVariable(variable), INITS);
    }

    public QCollectorItem(Path<? extends CollectorItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCollectorItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCollectorItem(PathMetadata metadata, PathInits inits) {
        this(CollectorItem.class, metadata, inits);
    }

    public QCollectorItem(Class<? extends CollectorItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collector = inits.isInitialized("collector") ? new QCollector(forProperty("collector"), inits.get("collector")) : null;
        this.collectorId = inits.isInitialized("collectorId") ? new org.bson.types.QObjectId(forProperty("collectorId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

