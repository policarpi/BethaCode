PGDMP                         y         
   cursoBetha    11.10    11.10     g           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            h           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            i           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            j           1262    16405 
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
       public         postgres    false            �            1259    16456    calculos_i_calculos_seq    SEQUENCE     �   CREATE SEQUENCE public.calculos_i_calculos_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.calculos_i_calculos_seq;
       public       postgres    false    205            k           0    0    calculos_i_calculos_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.calculos_i_calculos_seq OWNED BY public.calculos.i_calculos;
            public       postgres    false    204            �           2604    16461    calculos i_calculos    DEFAULT     z   ALTER TABLE ONLY public.calculos ALTER COLUMN i_calculos SET DEFAULT nextval('public.calculos_i_calculos_seq'::regclass);
 B   ALTER TABLE public.calculos ALTER COLUMN i_calculos DROP DEFAULT;
       public       postgres    false    205    204    205            d          0    16458    calculos 
   TABLE DATA               |   COPY public.calculos (i_calculos, mes_competencia, ano_competencia, i_funcionarios, valor_bruto, valor_liquido) FROM stdin;
    public       postgres    false    205   �       l           0    0    calculos_i_calculos_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.calculos_i_calculos_seq', 1, false);
            public       postgres    false    204            �           2606    16463    calculos calculos_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.calculos
    ADD CONSTRAINT calculos_pkey PRIMARY KEY (i_calculos);
 @   ALTER TABLE ONLY public.calculos DROP CONSTRAINT calculos_pkey;
       public         postgres    false    205            �           2606    16464 %   calculos calculos_i_funcionarios_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.calculos
    ADD CONSTRAINT calculos_i_funcionarios_fkey FOREIGN KEY (i_funcionarios) REFERENCES public.funcionarios(i_funcionarios);
 O   ALTER TABLE ONLY public.calculos DROP CONSTRAINT calculos_i_funcionarios_fkey;
       public       postgres    false    205            d   �   x�m��!E�oSL䅵��_G< ���#F�w	� 5�y$�( 3�Eo�Z|٠G�0" ��F/��F/��c�*k��yͽ�����5�Ҧ��v����s$V�T�ʋ�5w��臊Uw�-��bݝ��q������
Zx�dᝲ�w*�i��~?)��~q�     