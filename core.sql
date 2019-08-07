/*
 Navicat Premium Data Transfer

 Source Server         : LOCALHOST
 Source Server Type    : PostgreSQL
 Source Server Version : 100003
 Source Host           : localhost:5432
 Source Catalog        : eapp
 Source Schema         : core

 Target Server Type    : PostgreSQL
 Target Server Version : 100003
 File Encoding         : 65001

 Date: 10/05/2018 23:30:30
*/


-- ----------------------------
-- Sequence structure for user_user_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "core"."user_user_id_seq";
CREATE SEQUENCE "core"."user_user_id_seq" 
INCREMENT 1
MAXVALUE 9223372036854775807
CACHE 1;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS "core"."user";
CREATE TABLE "core"."user" (
  "first_name" varchar(50) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "last_name" varchar(50) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "email" varchar(100) COLLATE "pg_catalog"."default" NOT NULL,
  "password" varchar(100) COLLATE "pg_catalog"."default" NOT NULL,
  "date_created" timestamp(6),
  "last_updated" timestamp(6),
  "user_id" int8 NOT NULL DEFAULT nextval('"core".user_user_id_seq'::regclass),
  "active" char(1) COLLATE "pg_catalog"."default",
  "deleted" char(1) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO "core"."user" VALUES ('test', 'test last', 'a@a.a', 'asdf', NULL, NULL, 1, 'Y', 'N');

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "core"."user_user_id_seq"
OWNED BY "core"."user"."user_id";
SELECT setval('"core"."user_user_id_seq"', 2, true);

-- ----------------------------
-- Primary Key structure for table user
-- ----------------------------
ALTER TABLE "core"."user" ADD CONSTRAINT "user_pkey" PRIMARY KEY ("user_id");
