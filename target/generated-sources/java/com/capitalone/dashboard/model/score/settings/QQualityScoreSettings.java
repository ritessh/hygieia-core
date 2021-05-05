package com.capitalone.dashboard.model.score.settings;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQualityScoreSettings is a Querydsl query type for QualityScoreSettings
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QQualityScoreSettings extends BeanPath<QualityScoreSettings> {

    private static final long serialVersionUID = 1166791107L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQualityScoreSettings qualityScoreSettings = new QQualityScoreSettings("qualityScoreSettings");

    public final QScoreComponentSettings _super = new QScoreComponentSettings(this);

    public final QScoreComponentSettings codeCoverage;

    //inherited
    public final SimplePath<ScoreCriteria> criteria = _super.criteria;

    //inherited
    public final BooleanPath disabled = _super.disabled;

    public final QScoreComponentSettings unitTests;

    public final SimplePath<QualityScoreSettings.ViolationsScoreSettings> violations = createSimple("violations", QualityScoreSettings.ViolationsScoreSettings.class);

    //inherited
    public final NumberPath<Integer> weight = _super.weight;

    public QQualityScoreSettings(String variable) {
        this(QualityScoreSettings.class, forVariable(variable), INITS);
    }

    public QQualityScoreSettings(Path<? extends QualityScoreSettings> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQualityScoreSettings(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQualityScoreSettings(PathMetadata metadata, PathInits inits) {
        this(QualityScoreSettings.class, metadata, inits);
    }

    public QQualityScoreSettings(Class<? extends QualityScoreSettings> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.codeCoverage = inits.isInitialized("codeCoverage") ? new QScoreComponentSettings(forProperty("codeCoverage")) : null;
        this.unitTests = inits.isInitialized("unitTests") ? new QScoreComponentSettings(forProperty("unitTests")) : null;
    }

}

