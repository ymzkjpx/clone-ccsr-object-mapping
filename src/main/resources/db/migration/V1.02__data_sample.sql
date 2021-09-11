-- リソース
INSERT INTO 商品.品種
(品種番号,名前)
VALUES
    ('VA-1234', 'ミント'),
    ('VA-X405', 'ローズマリー'),
    ('VA-040Z', 'タイム')
;

-- 商品
INSERT INTO 商品.栽培キット
(キット番号, 種まき日, カバー, 素材)
VALUES
    ('KIT-X123-Y9XD', CURRENT_DATE - 10, 'NON_COVERED', 'プラスチック')
;

INSERT INTO 商品.キットの特徴
(キット番号,順序番号,特徴)
VALUES
    ('KIT-X123-Y9XD',1, '肥料'),
    ('KIT-X123-Y9XD',2, 'PH調整剤')
;
INSERT INTO 商品.列
(キット番号,列番号,品種番号,種の数)
VALUES
    ('KIT-X123-Y9XD',1,'VA-1234', 10),
    ('KIT-X123-Y9XD',2,'VA-040Z', 5)
;
