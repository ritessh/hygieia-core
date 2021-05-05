package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWhiteSourceComponent is a Querydsl query type for WhiteSourceComponent
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWhiteSourceComponent extends EntityPathBase<WhiteSourceComponent> {

    private static final long serialVersionUID = -2028219749L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWhiteSourceComponent whiteSourceComponent = new QWhiteSourceComponent("whiteSourceComponent");

    public final QCollectorItem _super;

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

    public final StringPath orgName = createString("orgName");

    public final StringPath productName = createString("productName");

    public final StringPath productToken = createString("productToken");

    public final StringPath projectName = createString("projectName");

    public final StringPath projectToken = createString("projectToken");

    //inherited
    public final BooleanPath pushed;

    //inherited
    public final StringPath refreshLink;

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QWhiteSourceComponent(String variable) {
        this(WhiteSourceComponent.class, forVariable(variable), INITS);
    }

    public QWhiteSourceComponent(Path<? extends WhiteSourceComponent> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWhiteSourceComponent(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWhiteSourceComponent(PathMetadata metadata, PathInits inits) {
        this(WhiteSourceComponent.class, metadata, inits);
    }

    public QWhiteSourceComponent(Class<? extends WhiteSourceComponent> type, PathMetadata metadata, PathInits inits) {
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

