package com.infinite.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="bills")
public class File {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String name;
		private String docType;
		
		@Lob
		private byte[] data;
		
		public File() {
			super();
		}

		public File(String name, String docType, byte[] data) {
			super();
			this.name = name;
			this.docType = docType;
			this.data = data;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDocType() {
			return docType;
		}
		public void setDocType(String docType) {
			this.docType = docType;
		}
		public byte[] getData() {
			return data;
		}
		public void setData(byte[] data) {
			this.data = data;
		}
}