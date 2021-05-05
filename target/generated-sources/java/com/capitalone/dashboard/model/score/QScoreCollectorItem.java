package com.capitalone.dashboard.model.score;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QScoreCollectorItem is a Querydsl query type for ScoreCollectorItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QScoreCollectorItem extends EntityPathBase<ScoreCollectorItem> {

    private static final long serialVersionUID = 1912840844L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QScoreCollectorItem scoreCollectorItem = new QScoreCollectorItem("scoreCollectorItem");

    public final com.capitalone.dashboard.model.QCollectorItem _super;

    //inherited
    public final StringPath clientReference;

    // inherited
    public final com.capitalone.dashboard.model.QCollector collector;

    // inherited
    public final org.bson.types.QObjectId collectorId;

    public final org.bson.types.QObjectId dashboardId;

    //inherited
    public final StringPath description;

    //inherited
    public final BooleanPath enabled;

    //inherited
    public final StringPath environment;

    //inherited
    public final NumberPath<Integer> errorCount;

    //inherited
    public final ListPath<com.capitalone.dashboard.model.CollectionError, com.capitalone.dashboard.model.QCollectionError> errors;

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

    public QScoreCollectorItem(String variable) {
        this(ScoreCollectorItem.class, forVariable(variable), INITS);
    }

    public QScoreCollectorItem(Path<? extends ScoreCollectorItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QScoreCollectorItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QScoreCollectorItem(PathMetadata metadata, PathInits inits) {
        this(ScoreCollectorItem.class, metadata, inits);
    }

    public QScoreCollectorItem(Class<? extends ScoreCollectorItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new com.capitalone.dashboard.model.QCollectorItem(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collector = _super.collector;
        this.collectorId = _super.collectorId;
        this.dashboardId = inits.isInitialized("dashboardId") ? new org.bson.types.QObjectId(forProperty("dashboardId")) : null;
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

