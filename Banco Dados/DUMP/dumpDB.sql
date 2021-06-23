PGDMP     9    .                y         
   cursoBetha    11.10    11.10 1    v           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            w           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            x           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            y           1262    16405 
   cursoBetha    DATABASE     j   CREATE DATABASE "cursoBetha" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'C' LC_CTYPE = 'C';
    DROP DATABASE "cursoBetha";
             postgres    false            �            1259    16458    calculos    TABLE     �   CREATE TABLE public.calculos (
    i_calculos integer NOT NULL,
    mes_competencia integer,
    ano_competencia integer,
    i_funcionarios integer,
    valor_bruto real,
    valor_liquido real
);
    DROP TABLE public.calculos;
       public         postgres    false            �            1259    16469    calculos_composicao    TABLE     �   CREATE TABLE public.calculos_composicao (
    i_calculos_composicao integer NOT NULL,
    i_calculos integer,
    i_eventos_manuais integer,
    valor_calculado real
);
 '   DROP TABLE public.calculos_composicao;
       public         postgres    false            �            1259    16456    calculos_i_calculos_seq    SEQUENCE     �   CREATE SEQUENCE public.calculos_i_calculos_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.calculos_i_calculos_seq;
       public       postgres    false    205            z           0    0    calculos_i_calculos_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.calculos_i_calculos_seq OWNED BY public.calculos.i_calculos;
            public       postgres    false    204            �            1259    16408    cargos    TABLE     �   CREATE TABLE public.cargos (
    i_cargos integer NOT NULL,
    descricao character varying(60) NOT NULL,
    salario real NOT NULL
);
    DROP TABLE public.cargos;
       public         postgres    false            �            1259    16406    cargos_i_cargos_seq    SEQUENCE     �   CREATE SEQUENCE public.cargos_i_cargos_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.cargos_i_cargos_seq;
       public       postgres    false    197            {           0    0    cargos_i_cargos_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.cargos_i_cargos_seq OWNED BY public.cargos.i_cargos;
            public       postgres    false    196            �            1259    16431    eventos    TABLE     &  CREATE TABLE public.eventos (
    i_eventos integer NOT NULL,
    descricao character varying(60),
    tipo character varying(1) NOT NULL,
    valor_evento real,
    CONSTRAINT eventos_tipo_check CHECK (((tipo)::text = ANY ((ARRAY['A'::character varying, 'D'::character varying])::text[])))
);
    DROP TABLE public.eventos;
       public         postgres    false            �            1259    16429    eventos_i_eventos_seq    SEQUENCE     �   CREATE SEQUENCE public.eventos_i_eventos_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.eventos_i_eventos_seq;
       public       postgres    false    201            |           0    0    eventos_i_eventos_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.eventos_i_eventos_seq OWNED BY public.eventos.i_eventos;
            public       postgres    false    200            �            1259    16440    eventos_manuais    TABLE     �   CREATE TABLE public.eventos_manuais (
    i_eventos_manuais integer NOT NULL,
    anos integer,
    mes integer,
    i_funcionarios integer,
    i_eventos integer,
    valor_evento real
);
 #   DROP TABLE public.eventos_manuais;
       public         postgres    false            �            1259    16438 %   eventos_manuais_i_eventos_manuais_seq    SEQUENCE     �   CREATE SEQUENCE public.eventos_manuais_i_eventos_manuais_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 <   DROP SEQUENCE public.eventos_manuais_i_eventos_manuais_seq;
       public       postgres    false    203            }           0    0 %   eventos_manuais_i_eventos_manuais_seq    SEQUENCE OWNED BY     o   ALTER SEQUENCE public.eventos_manuais_i_eventos_manuais_seq OWNED BY public.eventos_manuais.i_eventos_manuais;
            public       postgres    false    202            �            1259    16416    funcionarios    TABLE     �  CREATE TABLE public.funcionarios (
    i_funcionarios integer NOT NULL,
    nome character varying(60),
    telefone character varying(14),
    email character varying(100),
    endereco character varying(100),
    cpf character varying(14) NOT NULL,
    carteira_trabalho character varying(14),
    dt_admissao date,
    dt_demissao date,
    dt_nascimento date,
    i_cargos integer
);
     DROP TABLE public.funcionarios;
       public         postgres    false            �            1259    16414    funcionarios_i_funcionarios_seq    SEQUENCE     �   CREATE SEQUENCE public.funcionarios_i_funcionarios_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 6   DROP SEQUENCE public.funcionarios_i_funcionarios_seq;
       public       postgres    false    199            ~           0    0    funcionarios_i_funcionarios_seq    SEQUENCE OWNED BY     c   ALTER SEQUENCE public.funcionarios_i_funcionarios_seq OWNED BY public.funcionarios.i_funcionarios;
            public       postgres    false    198            �           2604    16461    calculos i_calculos    DEFAULT     z   ALTER TABLE ONLY public.calculos ALTER COLUMN i_calculos SET DEFAULT nextval('public.calculos_i_calculos_seq'::regclass);
 B   ALTER TABLE public.calculos ALTER COLUMN i_calculos DROP DEFAULT;
       public       postgres    false    205    204    205            �           2604    16411    cargos i_cargos    DEFAULT     r   ALTER TABLE ONLY public.cargos ALTER COLUMN i_cargos SET DEFAULT nextval('public.cargos_i_cargos_seq'::regclass);
 >   ALTER TABLE public.cargos ALTER COLUMN i_cargos DROP DEFAULT;
       public       postgres    false    197    196    197            �           2604    16434    eventos i_eventos    DEFAULT     v   ALTER TABLE ONLY public.eventos ALTER COLUMN i_eventos SET DEFAULT nextval('public.eventos_i_eventos_seq'::regclass);
 @   ALTER TABLE public.eventos ALTER COLUMN i_eventos DROP DEFAULT;
       public       postgres    false    200    201    201            �           2604    16443 !   eventos_manuais i_eventos_manuais    DEFAULT     �   ALTER TABLE ONLY public.eventos_manuais ALTER COLUMN i_eventos_manuais SET DEFAULT nextval('public.eventos_manuais_i_eventos_manuais_seq'::regclass);
 P   ALTER TABLE public.eventos_manuais ALTER COLUMN i_eventos_manuais DROP DEFAULT;
       public       postgres    false    203    202    203            �           2604    16419    funcionarios i_funcionarios    DEFAULT     �   ALTER TABLE ONLY public.funcionarios ALTER COLUMN i_funcionarios SET DEFAULT nextval('public.funcionarios_i_funcionarios_seq'::regclass);
 J   ALTER TABLE public.funcionarios ALTER COLUMN i_funcionarios DROP DEFAULT;
       public       postgres    false    199    198    199            r          0    16458    calculos 
   TABLE DATA               |   COPY public.calculos (i_calculos, mes_competencia, ano_competencia, i_funcionarios, valor_bruto, valor_liquido) FROM stdin;
    public       postgres    false    205   �<       s          0    16469    calculos_composicao 
   TABLE DATA               t   COPY public.calculos_composicao (i_calculos_composicao, i_calculos, i_eventos_manuais, valor_calculado) FROM stdin;
    public       postgres    false    206   �<       j          0    16408    cargos 
   TABLE DATA               >   COPY public.cargos (i_cargos, descricao, salario) FROM stdin;
    public       postgres    false    197   �<       n          0    16431    eventos 
   TABLE DATA               K   COPY public.eventos (i_eventos, descricao, tipo, valor_evento) FROM stdin;
    public       postgres    false    201   9=       p          0    16440    eventos_manuais 
   TABLE DATA               p   COPY public.eventos_manuais (i_eventos_manuais, anos, mes, i_funcionarios, i_eventos, valor_evento) FROM stdin;
    public       postgres    false    203   V=       l          0    16416    funcionarios 
   TABLE DATA               �   COPY public.funcionarios (i_funcionarios, nome, telefone, email, endereco, cpf, carteira_trabalho, dt_admissao, dt_demissao, dt_nascimento, i_cargos) FROM stdin;
    public       postgres    false    199   s=                  0    0    calculos_i_calculos_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.calculos_i_calculos_seq', 1, false);
            public       postgres    false    204            �           0    0    cargos_i_cargos_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.cargos_i_cargos_seq', 2, true);
            public       postgres    false    196            �           0    0    eventos_i_eventos_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.eventos_i_eventos_seq', 1, false);
            public       postgres    false    200            �           0    0 %   eventos_manuais_i_eventos_manuais_seq    SEQUENCE SET     T   SELECT pg_catalog.setval('public.eventos_manuais_i_eventos_manuais_seq', 1, false);
            public       postgres    false    202            �           0    0    funcionarios_i_funcionarios_seq    SEQUENCE SET     N   SELECT pg_catalog.setval('public.funcionarios_i_funcionarios_seq', 1, false);
            public       postgres    false    198            �           2606    16473 ,   calculos_composicao calculos_composicao_pkey 
   CONSTRAINT     }   ALTER TABLE ONLY public.calculos_composicao
    ADD CONSTRAINT calculos_composicao_pkey PRIMARY KEY (i_calculos_composicao);
 V   ALTER TABLE ONLY public.calculos_composicao DROP CONSTRAINT calculos_composicao_pkey;
       public         postgres    false    206            �           2606    16463    calculos calculos_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.calculos
    ADD CONSTRAINT calculos_pkey PRIMARY KEY (i_calculos);
 @   ALTER TABLE ONLY public.calculos DROP CONSTRAINT calculos_pkey;
       public         postgres    false    205            �           2606    16413    cargos cargos_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.cargos
    ADD CONSTRAINT cargos_pkey PRIMARY KEY (i_cargos);
 <   ALTER TABLE ONLY public.cargos DROP CONSTRAINT cargos_pkey;
       public         postgres    false    197            �           2606    16445 $   eventos_manuais eventos_manuais_pkey 
   CONSTRAINT     q   ALTER TABLE ONLY public.eventos_manuais
    ADD CONSTRAINT eventos_manuais_pkey PRIMARY KEY (i_eventos_manuais);
 N   ALTER TABLE ONLY public.eventos_manuais DROP CONSTRAINT eventos_manuais_pkey;
       public         postgres    false    203            �           2606    16437    eventos eventos_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.eventos
    ADD CONSTRAINT eventos_pkey PRIMARY KEY (i_eventos);
 >   ALTER TABLE ONLY public.eventos DROP CONSTRAINT eventos_pkey;
       public         postgres    false    201            �           2606    16423 !   funcionarios funcionarios_cpf_key 
   CONSTRAINT     [   ALTER TABLE ONLY public.funcionarios
    ADD CONSTRAINT funcionarios_cpf_key UNIQUE (cpf);
 K   ALTER TABLE ONLY public.funcionarios DROP CONSTRAINT funcionarios_cpf_key;
       public         postgres    false    199            �           2606    16421    funcionarios funcionarios_pkey 
   CONSTRAINT     h   ALTER TABLE ONLY public.funcionarios
    ADD CONSTRAINT funcionarios_pkey PRIMARY KEY (i_funcionarios);
 H   ALTER TABLE ONLY public.funcionarios DROP CONSTRAINT funcionarios_pkey;
       public         postgres    false    199            �           2606    16474 7   calculos_composicao calculos_composicao_i_calculos_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.calculos_composicao
    ADD CONSTRAINT calculos_composicao_i_calculos_fkey FOREIGN KEY (i_calculos) REFERENCES public.calculos(i_calculos);
 a   ALTER TABLE ONLY public.calculos_composicao DROP CONSTRAINT calculos_composicao_i_calculos_fkey;
       public       postgres    false    206    205    3047            �           2606    16479 >   calculos_composicao calculos_composicao_i_eventos_manuais_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.calculos_composicao
    ADD CONSTRAINT calculos_composicao_i_eventos_manuais_fkey FOREIGN KEY (i_eventos_manuais) REFERENCES public.eventos_manuais(i_eventos_manuais);
 h   ALTER TABLE ONLY public.calculos_composicao DROP CONSTRAINT calculos_composicao_i_eventos_manuais_fkey;
       public       postgres    false    203    3045    206            �           2606    16464 %   calculos calculos_i_funcionarios_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.calculos
    ADD CONSTRAINT calculos_i_funcionarios_fkey FOREIGN KEY (i_funcionarios) REFERENCES public.funcionarios(i_funcionarios);
 O   ALTER TABLE ONLY public.calculos DROP CONSTRAINT calculos_i_funcionarios_fkey;
       public       postgres    false    205    3041    199            �           2606    16451 .   eventos_manuais eventos_manuais_i_eventos_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.eventos_manuais
    ADD CONSTRAINT eventos_manuais_i_eventos_fkey FOREIGN KEY (i_eventos) REFERENCES public.eventos(i_eventos);
 X   ALTER TABLE ONLY public.eventos_manuais DROP CONSTRAINT eventos_manuais_i_eventos_fkey;
       public       postgres    false    201    3043    203            �           2606    16446 3   eventos_manuais eventos_manuais_i_funcionarios_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.eventos_manuais
    ADD CONSTRAINT eventos_manuais_i_funcionarios_fkey FOREIGN KEY (i_funcionarios) REFERENCES public.funcionarios(i_funcionarios);
 ]   ALTER TABLE ONLY public.eventos_manuais DROP CONSTRAINT eventos_manuais_i_funcionarios_fkey;
       public       postgres    false    199    203    3041            �           2606    16424 '   funcionarios funcionarios_i_cargos_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.funcionarios
    ADD CONSTRAINT funcionarios_i_cargos_fkey FOREIGN KEY (i_cargos) REFERENCES public.cargos(i_cargos);
 Q   ALTER TABLE ONLY public.funcionarios DROP CONSTRAINT funcionarios_i_cargos_fkey;
       public       postgres    false    197    199    3037            r      x������ � �      s      x������ � �      j   5   x�3�t�K��,.ITHIU�T��4100�3����2�'i�!��i
������ }�      n      x������ � �      p      x������ � �      l      x������ � �     